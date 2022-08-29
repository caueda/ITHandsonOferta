package com.example.ithandsonoferta.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config  implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("HEAD", "OPTIONS", "GET", "POST", "DELETE")
                .allowedOrigins("http://localhost:4200","http://localhost:4300")
                .allowedHeaders("Origin", "X-Requested-With", "Content-Type", "Accept",
                        "Access-Control-Allow-Headers", "access-control-allow-origin");
    }
}
