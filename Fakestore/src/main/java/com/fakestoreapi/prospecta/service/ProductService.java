package com.fakestoreapi.prospecta.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class ProductService {

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Map<String, Object>> getProductsByCategory(String category) {
        String url = "https://fakestoreapi.com/products/category/" + category;
        return restTemplate.getForObject(url, List.class);
    }

    public Map<String, Object> addProduct(Map<String, Object> product) {
        String url = "https://fakestoreapi.com/products";
        return restTemplate.postForObject(url, product, Map.class);
    }
}
