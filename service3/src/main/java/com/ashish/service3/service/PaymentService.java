package com.ashish.service3.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    Logger logger = LoggerFactory.getLogger(PaymentService.class);

    public String callCartService(){
        logger.info("Inside PaymentService class");

        return "Success";
    }
}
