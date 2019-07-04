package com.einnsyn.cosmodb.packages.Graf;

import com.microsoft.spring.data.gremlin.annotation.Edge;
import com.microsoft.spring.data.gremlin.annotation.EdgeFrom;
import com.microsoft.spring.data.gremlin.annotation.EdgeTo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Edge
public class Relations {

    @Id
    private String id;

    private String name;

    //@EdgeFrom
    //private X xFrom;      //private Journalpost journalpostFrom feks

    //@EdgeTo
    //private X xTo;
}
