package com.example.ithandsonoferta.repository;

import com.example.ithandsonoferta.domain.mongodb.Oferta;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OfertaRepository extends MongoRepository<Oferta, String> {
    List<Oferta> findAllByProdutoId(Long produtoId);
}
