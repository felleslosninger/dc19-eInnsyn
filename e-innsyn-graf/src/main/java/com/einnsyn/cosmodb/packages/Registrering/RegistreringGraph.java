package com.einnsyn.cosmodb.packages.Registrering;

import com.microsoft.spring.data.gremlin.annotation.EdgeSet;
import com.microsoft.spring.data.gremlin.annotation.Graph;
import com.microsoft.spring.data.gremlin.annotation.VertexSet;
import lombok.Getter;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Graph
public class RegistreringGraph {

    @Id
    private String id;

    @VertexSet
    @Getter
    private List<Object> vertexes;

    @EdgeSet
    @Getter
    private List<Object> edges;

    public RegistreringGraph(){
        this.vertexes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public RegistreringGraph(String id){
        this.id = id;
        this.vertexes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }
}