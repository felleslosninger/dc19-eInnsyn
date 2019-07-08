package com.einnsyn.cosmodb.packages.Dokumentobjekt;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface DokumentobjektGraphRepository extends GremlinRepository<Dokumentobjekt, String>{
    Stream<Dokumentobjekt> findByName(String name);
}
