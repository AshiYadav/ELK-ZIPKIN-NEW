package com.ashish.service2.service;

import com.ashish.service2.client.CartClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartClient cartClient;
    Logger logger = LoggerFactory.getLogger(CartService.class);

    public String callpaymentService(){
        logger.info("Inside CartService class");
        cartClient.callPaymentService();
        return "Success";
    }
}
