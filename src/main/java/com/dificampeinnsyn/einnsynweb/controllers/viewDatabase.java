package com.dificampeinnsyn.einnsynweb.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class viewDatabase {
    // Connect to database
    String hostName = "mysqlserver794613852.database.windows.net"; // update me
    String dbName = "sampleDb"; // update me
    String user = "azureuser"; // update me
    String password = "@dificamp2019"; // update me
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
    Connection connection = null;
    Statement statement = null;
    public viewDatabase(){
        try {
            connection = DriverManager.getConnection(url);
            String schema = connection.getSchema();
            System.out.println("Successful connection - Schema: " + schema);

            System.out.println("Insert data to table:");
            System.out.println("=========================================");

            statement = connection.createStatement();
            String database = "INSERT INTO [dbo].[Persons]" +
                    "VALUES ('Tiril', 24)";
            statement.executeUpdate(database);
            connection.close();

        }
            catch (Exception e) {
                e.printStackTrace();}
        // Create and execute a SELECT SQL statement.
        //String selectSql = "SELECT * " + "FROM [dbo].[Persons] ";

        /*try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSql)) {

            // Print results from select statement
            System.out.println("Top 20 categories:");
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



        /*  File f = new File("TEXT_FILES/minidata.txt");
        try {
            readLines.readLine(f);
        } catch (IOException e){
            e.printStackTrace();
        }
*/
}
}
