package com.example.demo;

import org.neo4j.driver.v1.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class neo4jTest {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost/?user=neo4j,password=1234,scheme=basic");//jdbc

        String query = "MATCH (n) Return (n) LIMIT 100";
        String query1 = ":POST /rdf/cypher {\"cypher\" : \"MATCH (n) RETURN n LIMIT 50\"}";

                PreparedStatement stmt = con.prepareStatement(query);
                try {
                    System.out.println("THIS IS THE JDBC QUERY");
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        System.out.println(rs.getString("n"));
            }

        } catch (Exception e ){
            System.out.println(e);
        }


        try {
            Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "1234")); //driver
            Session session = driver.session();

            System.out.println("THIS IS THE SESSION QUERY");

            StatementResult result = session.run(
                    query1
            );
                while (result.hasNext()){
                System.out.println(result.next().toString());
            }

            session.close();
            driver.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }

}