package com.example.demo.domain;

import lombok.Data;

@Data
public class Address {
    private String city = "New York";
    private String countryCode = "US";
    private String postCode = "35004";
    private String state = "NY";
    private String firstLine = "158 Wall Street";
}
