package com.ashish.service2.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartClient {

    @Autowired
    private RestTemplate restTemplate;
    Logger logger = LoggerFactory.getLogger(CartClient.class);

    public void callPaymentService(){
        logger.info("Inside CartClient class");
        logger.info("Going to payment service");
        //restTemplate.getForEntity("http://localhost:8082/paymentService/payment", null);
        ResponseEntity<String> response
                = restTemplate.getForEntity("http://localhost:8082/paymentService/payment", String.class);
    }
}
