package com.einnsyn.cosmodb.packages.Saksmappe;

import com.microsoft.spring.data.gremlin.annotation.EdgeSet;
import com.microsoft.spring.data.gremlin.annotation.Graph;
import com.microsoft.spring.data.gremlin.annotation.VertexSet;
import lombok.Getter;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Graph
public class SaksmappeGraph {

    @Id
    private String id;

    @VertexSet
    @Getter
    private List<Object> vertexes;

    @EdgeSet
    @Getter
    private List<Object> edges;

    public SaksmappeGraph(){
        this.vertexes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public SaksmappeGraph(String id){
        this.id = id;
        this.vertexes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }
}
