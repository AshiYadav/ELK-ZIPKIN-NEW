package com.ashish.service2.controller;


import com.ashish.service2.service.CartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartService")
public class CartController {
    private CartService cartService;
    Logger logger = LoggerFactory.getLogger(CartController.class);
    CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping("/cart")
    public ResponseEntity printService1(){
        logger.info("Inside CartController class");
        logger.info("Now going to call callpaymentService method");
        return ResponseEntity.ok(cartService.callpaymentService());
    }
}
