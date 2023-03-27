package com.example.demo.domain;

import lombok.Data;

@Data
public class CreateTransferRequest {
    Long targetAccount;
    String quoteUuid;
    String customerTransactionId;

}
