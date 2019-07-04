package com.einnsyn.cosmodb.packages.Journalpost;

import com.einnsyn.cosmodb.packages.Dokumentobjekt.Dokumentobjekt;
import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface JournalpostGraphRepository extends GremlinRepository<Journalpost, String>{
    Stream<Journalpost> findByName(String name);
}
