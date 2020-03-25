package com.ly.product.service;

import com.ly.commom.entity.Product;
import com.ly.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductMapper mapper;


    public Product findById(Integer id) {
        return mapper.findById(id);
    }
}
