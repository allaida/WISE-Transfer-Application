package com.example.demo.domain;

import lombok.Data;

@Data
public class RecipientAccountDetails {
    private String legalType = "PRIVATE";
    private String accountType = "CHECKING";
    private String email;
    private Address address;
    private String abartn = "064000020";
    private String accountNumber;
}
