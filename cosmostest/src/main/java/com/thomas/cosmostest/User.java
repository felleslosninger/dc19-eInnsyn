package com.thomas.cosmostest;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;


@Document(collection = "mycollection")
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String address;

    public User(){

    }

    @Override
    public String toString(){
        return String.format("%s %s %s", firstName, lastName, address);
    }
}
