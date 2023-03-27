package com.example.demo.domain;

import lombok.Data;

@Data
public class CreateRecipientRequest {
    String accountHolderName;
    String currency;
    String type;
    RecipientAccountDetails details;
}
