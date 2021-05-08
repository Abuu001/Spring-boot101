package com.lugonzo.Springboot101.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {

    private final UUID id;

    @NotBlank  //@NotBlank ensures that the string is not empty
    private  final String name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
