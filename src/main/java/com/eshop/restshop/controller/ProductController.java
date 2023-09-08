package com.eshop.restshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping ("/get-products")
    public ResponseEntity<String> getAllProducts() {
        return ResponseEntity.ok("Test");
    }

}
