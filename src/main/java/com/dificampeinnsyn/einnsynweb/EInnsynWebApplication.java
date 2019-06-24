package com.dificampeinnsyn.einnsynweb;

import com.dificampeinnsyn.einnsynweb.controllers.registerInDatabase;
import com.dificampeinnsyn.einnsynweb.controllers.viewDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


//@SpringBootApplication
public class EInnsynWebApplication {

    public static void main(String[] args) {
        Scanner textObj = new Scanner(System.in);
        String typeWord;


        System.out.println("To communicate with the db, you have to type in one of the following");
        System.out.println("Type 'view' to see the db");
        System.out.println("Type 'reg' to make the program register another line in db");
        typeWord = textObj.nextLine();

        if(typeWord.equals("reg")) {
            //showTables viewTables = new showTables();
            viewDatabase viewDB = new viewDatabase();
        }
        if(typeWord.equals("view")) {
            registerInDatabase regDB = new registerInDatabase();
        }
        else{
            System.out.println("Fail");
        }

        //SpringApplication.run(EInnsynWebApplication.class, args);
        }

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





        /*  File f = new File("TEXT_FILES/minidata.txt");
        try {
            readLines.readLine(f);
        } catch (IOException e){
            e.printStackTrace();
        }
*/
   // }

}
