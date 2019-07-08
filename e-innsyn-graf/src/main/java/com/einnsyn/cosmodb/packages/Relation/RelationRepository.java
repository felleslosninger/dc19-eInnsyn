package com.einnsyn.cosmodb.packages.Relation;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationRepository extends GremlinRepository<Relation, String> {
}
