package com.einnsyn.cosmodb.packages.Mappe;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface MappeGraphRepository extends GremlinRepository<Mappe, String>{
    Stream<Mappe> findByName(String name);
}
