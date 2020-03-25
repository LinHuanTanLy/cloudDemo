package com.ly.order.service;

import com.ly.commom.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-server")
public interface ProductService {

    @GetMapping(value = "/api/product/{productId}")
    Product findByPid(@PathVariable("productId") String productId);
}
