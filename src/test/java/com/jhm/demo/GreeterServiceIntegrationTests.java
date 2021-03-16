package com.jhm.demo;

import com.jhm.demo.controller.GreeterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class GreeterServiceIntegrationTests {

    @Autowired
    private GreeterService greeterService;

    @Test
    public void pruebaUnitariaSayHelloJhon() {

        // Se envía el parámetro al servicio con la cadena de Jhon
        String greeting = greeterService.sayHello("Jhon");

        // Se compara el parámetro enviado con el saludo
        assertThat(greeting).isEqualTo("Hello World, Jhon");

    }

}
