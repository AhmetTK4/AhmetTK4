package com.example.springpojoapp.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring POJO API Documentation")
                        .version("1.0.0")
                        .description("Bu proje, Spring Boot 3 kullanarak basit bir REST API örneğidir.")
                        .contact(new Contact()
                                .name("Temel")
                                .email("temel@example.com")));
    }
}
