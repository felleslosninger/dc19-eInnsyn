package com.einnsyn.cosmodb.packages.Skjerming;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface SkjermingGraphRepository extends GremlinRepository<Skjerming, String>{
    Stream<Skjerming> findByName(String name);
}

