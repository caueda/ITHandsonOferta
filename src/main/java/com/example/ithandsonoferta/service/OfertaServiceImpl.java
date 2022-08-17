package com.example.ithandsonoferta.service;

import com.example.ithandsonoferta.domain.Oferta;
import com.example.ithandsonoferta.repository.OfertaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfertaServiceImpl implements OfertaService {
    private OfertaRepository ofertaRepository;

    public OfertaServiceImpl(OfertaRepository perfilRepository) {
        this.ofertaRepository = perfilRepository;
    }

    @Override
    public List<Oferta> findAll() {
        List<Oferta> ofertas = new ArrayList<>();
        this.ofertaRepository.findAll().forEach(ofertas::add);
        return ofertas;
    }

    @Override
    public Oferta saveOrUpdate(Oferta oferta) {
        return this.ofertaRepository.save(oferta);
    }
}
