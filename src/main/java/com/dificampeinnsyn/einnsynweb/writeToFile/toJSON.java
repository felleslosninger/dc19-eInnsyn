package com.dificampeinnsyn.einnsynweb.writeToFile;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

@Component
public class toJSON {



    //SpringApplication.run(EInnsynWebApplication.class, args);

    // Connect to database

    @Autowired
    public static void toJSON(){

        String hostName = "mysqlserver794613852.database.windows.net"; // update me
        String dbName = "sampleDb"; // update me
        String user = "azureuser"; // update me
        String password = "@dificamp2019"; // update me
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
                + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
            String schema = connection.getSchema();
            System.out.println("Successful connection - Schema: " + schema);

            System.out.println("Query data example:");
            System.out.println("=========================================");

            // Create and execute a SELECT SQL statement.
            String tableName = "[dbo].[Persons]";
            String selectStatement = "*";
            String selectSql =  "SELECT " + selectStatement +
                    " FROM " + tableName;

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSql)) {

                // Print results from select statement
                System.out.println("Results from :");

                //Create personList
                JSONArray personList = new JSONArray();

                while (resultSet.next())
                {
                    //Create JSONobject for each person and add attributes
                    JSONObject personDetails = new JSONObject();
                    personDetails.put("name", resultSet.getString(1));
                    personDetails.put("age", resultSet.getString(2));

                    //Create personObject with the personDetails
                    JSONObject personObject = new JSONObject();
                    personObject.put("person", personDetails);

                    //Add to personList
                    personList.put(personObject);

                    //Write to file.json
                    try(FileWriter file = new FileWriter("persons.json")){

                        file.write(personList.toString());
                        file.flush();
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                }
                connection.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
    //Create personList
    JSONArray personList = new JSONArray();

    while (les.next() != null){
        //Create JSONobject for each person and add attributes
        JSONObject personDetails = new JSONObject();
        personDetaljer.put("name", "les.name?");
        personDetaljer.put("age", "les.age?");

        //Create personObject with the personDetails
        JSONObject personObject = new JSONObject();
        personObject.put("person", personDetails);

        //Add to personList
        personList.add(personObject);

        //Write to file.json
        try(FileWriter file = new FileWriter("persons.json")){

            file.write(personList.toJSONString());
            file.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
