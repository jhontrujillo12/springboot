package com.jhm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication


public class DemoApplication {

	
	public static void main(String[] args) {
	    	//Corre la aplicación
		SpringApplication.run(DemoApplication.class, args);
	}

	// Método encargado de imprimir
	public void imprimir() {
		System.out.println("Imprime en consola");
	}

}
