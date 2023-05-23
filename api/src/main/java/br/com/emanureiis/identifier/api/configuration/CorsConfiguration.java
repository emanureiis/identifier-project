package br.com.emanureiis.identifier.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Uma outra solução seria anotar:
 * @CrossOrigin(origins = "http://127.0.0.1:5500")
 * no Controller
 * */


@Configuration
public class CorsConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/identificador/dados")
                        .allowedOrigins("http://127.0.0.1:5500") // Adicione o domínio do seu front-end aqui
                        .allowedMethods("POST")
                        .allowCredentials(true);

                registry.addMapping("/identificador/creditos")
                        .allowedOrigins("http://127.0.0.1:5500") // Adicione o domínio do seu front-end aqui
                        .allowedMethods("GET")
                        .allowCredentials(true);
            }
        };
    }
}
