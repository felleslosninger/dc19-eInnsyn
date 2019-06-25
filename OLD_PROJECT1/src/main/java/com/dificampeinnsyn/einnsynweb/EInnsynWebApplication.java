package com.dificampeinnsyn.einnsynweb;

import com.dificampeinnsyn.einnsynweb.readFile.readLines;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


//@SpringBootApplication
public class EInnsynWebApplication {

    public static void main(String[] args) {
        Scanner textObj = new Scanner(System.in);
        String typeWord;


/*
        System.out.println("To communicate with the db, you have to type in one of the following");
        System.out.println("Type 'view' to see the db");
        System.out.println("Type 'reg' to make the program register another line in db");
        typeWord = textObj.nextLine();

        if(typeWord.equals("reg")) {
            //showTables viewTables = new showTables();
            registerDatabase regDB = new registerDatabase();
        }
        else if(typeWord.equals("view")) {
            viewDatabase viewDB = new viewDatabase();
        }
        else{
            System.out.println("Fail");
        }

        //SpringApplication.run(EInnsynWebApplication.class, args);
        }
*/
    /*public class showTables(){
        // Connect to database
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
            String selectSql =
                    "SELECT " + selectStatement +
                    " FROM " + tableName;

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSql)) {

                // Print results from select statement
                System.out.println("Results from :");
                while (resultSet.next())
                {
                    System.out.println(resultSet.getString(1) + " "
                            + resultSet.getString(2));
                }
                connection.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


*/

        File f = new File("C:\\Users\\camp-oih\\Desktop\\export_difi.ttl");
        try {
            readLines.readTurtle(f);
        } catch (IOException e){
            e.printStackTrace();
        }


        // }

    }
}
