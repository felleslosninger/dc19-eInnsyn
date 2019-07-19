package com.thomas.cosmostest;

import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends DocumentDbRepository<Person, String> {
}
