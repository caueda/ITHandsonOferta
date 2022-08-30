package com.example.ithandsonoferta.controller;

import com.example.ithandsonoferta.domain.dto.Produto;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {
    private RestTemplate restTemplate;

    private static final String WALKTHROUGHJAVA_API = "http://localhost:8888/api/produto";
    public ProdutoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public ResponseEntity<?> saveOrUpdate(@RequestBody Produto produto) {
        HttpEntity<Produto> request = new HttpEntity<>(produto);
        Produto prod = restTemplate.postForObject(WALKTHROUGHJAVA_API, request, Produto.class);
        return ResponseEntity.ok(prod);
    }
}
