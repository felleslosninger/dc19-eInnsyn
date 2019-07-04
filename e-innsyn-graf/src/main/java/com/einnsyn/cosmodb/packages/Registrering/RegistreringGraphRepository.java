package com.einnsyn.cosmodb.packages.Registrering;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface RegistreringGraphRepository extends GremlinRepository<Registrering, String>{
    Stream<Registrering> findByName(String name);
}
