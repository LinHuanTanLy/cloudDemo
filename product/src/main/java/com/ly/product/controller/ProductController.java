package com.ly.product.controller;

import com.ly.commom.entity.Product;
import com.ly.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{productId}")
    public Product product(@PathVariable Integer productId) {
        return productService.findById(productId);
    }
}
