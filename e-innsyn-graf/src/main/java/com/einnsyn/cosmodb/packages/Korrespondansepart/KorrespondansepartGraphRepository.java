package com.einnsyn.cosmodb.packages.Korrespondansepart;

import com.einnsyn.cosmodb.packages.Dokumentobjekt.Dokumentobjekt;
import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface KorrespondansepartGraphRepository extends GremlinRepository<Korrespondansepart, String>{
    Stream<Korrespondansepart> findByName(String name);
}

