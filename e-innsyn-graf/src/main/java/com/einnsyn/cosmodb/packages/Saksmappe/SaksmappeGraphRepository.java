package com.einnsyn.cosmodb.packages.Saksmappe;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface SaksmappeGraphRepository extends GremlinRepository<Saksmappe, String>{
    Stream<Saksmappe> findByName(String name);
}

