package com.jhm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Se crea otro comentario
//Este metodo se encarga de hacer pruebas
@SpringBootApplication
/**
 * Hago este comentario grande para especificar funcionalidades
 */

// Comentario para que muestre conflictos
//Método encargado de hacer el demo de la aplicación
public class DemoApplication {

	public static void main(String[] args) {

	    //Se agrega comentario de prueba
		SpringApplication.run(DemoApplication.class, args);
	}

	// ejemplo de prueba de comentario
	//se grega comentario de nada
	public void nada() {

		System.out.println();	
	}

	public void imprimir() {
		System.out.println("Imprime en consola");
	}

}
