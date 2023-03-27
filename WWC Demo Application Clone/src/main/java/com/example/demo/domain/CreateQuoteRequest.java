package com.example.demo.domain;

import lombok.Data;

@Data
public class CreateQuoteRequest {
    String sourceCurrency;
    String targetCurrency;
    Long targetAmount;
    Long sourceAmount;
//    Long profile = 16727665L;
}
