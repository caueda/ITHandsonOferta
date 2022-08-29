package com.example.ithandsonoferta.service;

import com.example.ithandsonoferta.domain.mongodb.Oferta;

import java.util.List;

public interface OfertaService {
    List<Oferta> findAll();

    Oferta saveOrUpdate(Oferta oferta);
}
