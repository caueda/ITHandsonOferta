package com.example.ithandsonoferta.repository;

import com.example.ithandsonoferta.domain.Oferta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OfertaRepository extends CrudRepository<Oferta, String> {
    List<Oferta> findAllByProdutoId(Long produtoId);
}
