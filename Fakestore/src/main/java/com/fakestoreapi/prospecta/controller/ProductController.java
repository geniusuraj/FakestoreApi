package com.fakestoreapi.prospecta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fakestoreapi.prospecta.service.ProductService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/category/{category}")
    public List<Map<String, Object>> getProductsByCategory(@PathVariable String category) {
        return productService.getProductsByCategory(category);
    }

    @PostMapping("/add")
    public Map<String, Object> addProduct(@RequestBody Map<String, Object> product) {
        return productService.addProduct(product);
    }
}
