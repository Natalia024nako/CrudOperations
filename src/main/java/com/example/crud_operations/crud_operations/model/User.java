package com.example.crud_operations.crud_operations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

// Lombok eshte librari qe shmang shrimin e kodit te perseritur (boilerplate code),
// duke krijuar automatikisht getters, setters, construktor, to string
@Data //Gjeneron getters dhe setters, toString, equals, hashCode
@AllArgsConstructor // gjeneron kostruktorin me te gjitha fushat
@NoArgsConstructor // gjenenron konstruktorin bosh
@Slf4j // shton aotomatikisht logs si log.info, log.error

public class User {
    private Long id;
    private String name;
    private String email;
}