package com.einnsyn.cosmodb.packages.Dokumentbeskrivelse;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface DokumentbeskrivelseGraphRepository extends GremlinRepository<Dokumentbeskrivelse, String>{
    Stream<Dokumentbeskrivelse> findByName(String name);
}
