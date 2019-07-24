package com.example.demo;

import org.neo4j.driver.v1.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class neo4jTest {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost/?user=neo4j,password=difidatabase,scheme=basic");//jdbc

        String query = "MATCH (n:ns0__Saksmappe) WHERE n.ns0__mappeID = \"2014/139\"  RETURN properties(n) LIMIT 200";
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
            Driver driver = GraphDatabase.driver("bolt://localhost:11006", AuthTokens.basic("neo4j", "difidatabase")); //driver
            Session session = driver.session();

            System.out.println("THIS IS THE SESSION QUERY");

            StatementResult result = session.run(
                    query
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