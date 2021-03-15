package com.jhm.demo;

import com.jhm.demo.controller.GreeterService;
import javafx.beans.binding.BooleanExpression;
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

        // When
        String greeting = greeterService.sayHello("Jhon");

        // Then
        assertThat(greeting).isEqualTo("Hello World, Jhon");

    }

}
