package com.ly.order.controller;

import com.ly.commom.entity.Product;
import com.ly.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {


    @Autowired
    ProductService productService;

    //    @GetMapping("/{productId}")
//    public String order(@PathVariable Integer productId) {
//        return "hahahahaha";
//    }
    @GetMapping("/{productId}")
    public Product order(@PathVariable String productId) {
        return productService.findByPid(productId);
    }
}
