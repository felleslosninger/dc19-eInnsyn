package com.einnsyn.cosmodb.packages.Graf;

import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Relation;

@Repository
public interface RelationRepository extends GremlinRepository<Relation, String> {
}
