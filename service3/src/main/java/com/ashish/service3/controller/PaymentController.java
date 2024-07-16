package com.ashish.service3.controller;



import com.ashish.service3.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paymentService")
public class PaymentController {
    private PaymentService paymentService;
    Logger logger = LoggerFactory.getLogger(PaymentController.class);
    PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @GetMapping("/payment")
    public ResponseEntity printService1(){
        logger.info("Inside PaymentController class");
        return ResponseEntity.ok(paymentService.callCartService());
    }
}
