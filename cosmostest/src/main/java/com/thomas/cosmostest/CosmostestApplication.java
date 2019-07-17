package com.thomas.cosmostest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

import java.util.Optional;

@SpringBootApplication
public class CosmostestApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CosmostestApplication.class);

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CosmostestApplication.class, args);
    }

    public void run(String... var1) throws Exception{
        final User testUser = new User("testId", "testFirstName", "testLastName", "test address line one");

        repository.deleteAll();
        repository.save(testUser);

        final Optional<User> opResult = repository.findById(testUser.getId());
        Assert.isTrue(opResult.isPresent(), "Cannot find user.");

        final User result = opResult.get();
        Assert.state(result.getFirstName().equals(testUser.getFirstName()), "query result firstName doesn't match!");
        Assert.state(result.getLastName().equals(testUser.getLastName()), "query result lastName doesn't match!");

        LOGGER.info("findOne in User collection get result: {}", result.toString());
    }

}
