package com.einnsyn.cosmodb;


import com.steelbridgelabs.oss.neo4j.structure.Neo4JElementIdProvider;
import com.steelbridgelabs.oss.neo4j.structure.Neo4JGraph;
import com.steelbridgelabs.oss.neo4j.structure.providers.Neo4JNativeElementIdProvider;
import org.apache.tinkerpop.gremlin.structure.Graph;
import org.neo4j.driver.v1.*;

import static org.neo4j.driver.v1.Values.parameters;

public class Neo4j implements AutoCloseable{
        private final Driver driver;


    public Neo4j(String uri, String user, String password ) throws Exception {

        driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) );


    }


    public void traverse(Driver driver){
        Neo4JElementIdProvider<?> vertexIdProvider = new Neo4JNativeElementIdProvider();
        Neo4JElementIdProvider<?> edgeIdProvider = new Neo4JNativeElementIdProvider();

        try (Graph graph = new Neo4JGraph(driver, vertexIdProvider, edgeIdProvider)) {
            graph.traversal().V().label().toList().stream().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
        public void close() throws Exception {
            driver.close();
        }

        public void printGreeting( final String message ) {
            try ( Session session = driver.session() ) {
                String greeting = session.writeTransaction( new TransactionWork<String>() {
                    @Override
                    public String execute( Transaction tx )
                    {
                        StatementResult result = tx.run( "CREATE (a:Greeting) " +
                                        "SET a.message = $message " +
                                        "RETURN a.message + ', from node ' + id(a)",
                                parameters( "message", message ) );
                        return result.single().get( 0 ).asString();
                    }
                } );
                System.out.println( greeting );


            }
        }


        public static void main( String... args ) throws Exception
        {
            try ( Neo4j greeter = new Neo4j( "bolt://localhost:7687", "neo4j", "difidatabase" ) )
            {
                greeter.printGreeting( "hello, world :) " );

            }

            Neo4j db = new Neo4j("bolt://localhost:7687", "neo4j", "difidatabase");

            db.traverse(db.driver);



        }
}
