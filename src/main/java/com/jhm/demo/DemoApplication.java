package com.jhm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Se crea otro comentario
//Este metodo se encarga de hacer pruebas
@SpringBootApplication
/**
 * Hago este comentario grande para especificar funcionalidades
 */
public class nada() {
	
}

public class DemoApplication {

	public void imprimir() {
		System.out.println("Imprime en consola");
	}

	public static void main(String[] args) {
	    
		SpringApplication.run(DemoApplication.class, args);
	}

}
