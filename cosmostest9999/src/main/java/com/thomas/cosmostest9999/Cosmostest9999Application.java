package com.thomas.cosmostest9999;

import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsoft.azure.documentdb.ConnectionPolicy;
import com.microsoft.azure.documentdb.ConsistencyLevel;
import com.microsoft.azure.documentdb.DataType;
import com.microsoft.azure.documentdb.Database;
import com.microsoft.azure.documentdb.DocumentClient;
import com.microsoft.azure.documentdb.DocumentClientException;
import com.microsoft.azure.documentdb.DocumentCollection;
import com.microsoft.azure.documentdb.Index;
import com.microsoft.azure.documentdb.IndexingPolicy;
import com.microsoft.azure.documentdb.RangeIndex;
import com.microsoft.azure.documentdb.RequestOptions;

@SpringBootApplication
@RestController
public class Cosmostest9999Application {



    private DocumentClient client;
    public static void main(String[] args) throws ParseException, IOException, DocumentClientException {
        SpringApplication.run(Cosmostest9999Application.class, args);
        Cosmostest9999Application cb = new Cosmostest9999Application();
        System.out.println("Running Main");
        cb.connectToDB();
    }

    @RequestMapping("Connect")
    public String connectToDB() throws DocumentClientException, IOException, ParseException {

        // Making the connection with COSMos DB account
        client = new DocumentClient("https://dc19-e-innsyn.documents.azure.com:443/",
                "36LQvEvwlxI1Ovcsg0ytkJFunTr3JCSS1Ejc0ZFPOLZQwsJOqQ1XZZQ254FJrzymCihprMnnc3u9GmWSACSpnQ==",
                new ConnectionPolicy(), ConsistencyLevel.Session);

        JSONParser parser = new JSONParser();
        // Use JSONObject for simple JSON and JSONArray for array of JSON.
        JSONObject data = (JSONObject) parser
                .parse(new FileReader("C:\\Users\\camp-rgu\\Documents\\Dumpfil\\jsonfil.json"));


        //This one is added to take date and time.
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        data.put("id", date.toString());   // we are taking ID as a random value.
        System.out.println("Create DB");

        this.createDatabaseIfNotExists("RandoDB");
        System.out.println("Create coll");
        this.createDocumentCollectionIfNotExists("RandoDB", "testRando");
        System.out.println("Create doc");
        this.createDocumentIfNotExists("RandoDB", "testRando", data);

        return "Success";
    }

    // Create Database
    private void createDatabaseIfNotExists(String databaseName) throws DocumentClientException, IOException {
        String databaseLink = String.format("/dbs/%s", databaseName);

        // Check to verify a database with the id=FamilyDB does not exist
        try {
            client.readDatabase(databaseLink, null);
            System.out.println("database created");
        } catch (DocumentClientException de) {
            // If the database does not exist, create a new database
            if (de.getStatusCode() == 404) {
                Database database = new Database();
                database.setId(databaseName);

                client.createDatabase(database, null);
            } else {
                throw de;
            }
        }
    }

    // Create Collection
    private void createDocumentCollectionIfNotExists(String databaseName, String collectionName)
            throws IOException, DocumentClientException {
        String databaseLink = String.format("/dbs/%s", databaseName);
        String collectionLink = String.format("/dbs/%s/colls/%s", databaseName, collectionName);

        try {
            client.readCollection(collectionLink, null);
            System.out.println("colleaction red");
        } catch (DocumentClientException de) {
            // If the document collection does not exist, create a new
            // collection
            if (de.getStatusCode() == 404) {
                DocumentCollection collectionInfo = new DocumentCollection();
                collectionInfo.setId(collectionName);

                // Optionally, you can configure the indexing policy of a
                // collection. Here we configure collections for maximum query
                // flexibility including string range queries.
                RangeIndex index = new RangeIndex(DataType.String);
                index.setPrecision(-1);

                collectionInfo.setIndexingPolicy(new IndexingPolicy(new Index[] { index }));

                // DocumentDB collections can be reserved with throughput
                // specified in request units/second. 1 RU is a normalized
                // request equivalent to the read of a 1KB document. Here we
                // create a collection with 400 RU/s.
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.setOfferThroughput(400);

                client.createCollection(databaseLink, collectionInfo, requestOptions);

            } else {
                throw de;
            }
        }

    }

    // create Document
    private void createDocumentIfNotExists(String databaseName, String collectionName, JSONObject json)
            throws DocumentClientException, IOException {
        try {
            String documentLink = String.format("/dbs/%s/colls/%s/docs/%s", databaseName, collectionName, json);
            client.readDocument(documentLink, new RequestOptions());
            System.out.println("Dokument created");

        } catch (DocumentClientException de) {
            if (de.getStatusCode() == 404) {
                String collectionLink = String.format("/dbs/%s/colls/%s", databaseName, collectionName);
                this.client.createDocument(collectionLink, json, new RequestOptions(), true);
            } else {
                throw de;
            }
        }
    }

}
