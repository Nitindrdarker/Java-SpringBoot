package com.example.example_10.model;

import lombok.Data;

@Data // Lombok annotation to generate getters, setters, toString, etc.
public class Contact {
    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;


}
