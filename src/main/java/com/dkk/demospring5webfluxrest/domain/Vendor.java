package com.dkk.demospring5webfluxrest.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Vendor {
    private String id;
    private String firstName;
    private String lastName;
}
