package com.example.ithandsonoferta;

import com.example.ithandsonoferta.service.OfertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItHandsonOfertaApplication {
	@Autowired
	private OfertaService perfilService;

	public static void main(String[] args) {
		SpringApplication.run(ItHandsonOfertaApplication.class, args);
	}

}
