package com.example.ProyectoFinalCine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de arranque de la aplicación Spring Boot.
 *
 * <p>Inicializa el contexto de la aplicación y levanta el sistema
 * del cine configurado en el proyecto.</p>
 */
@SpringBootApplication
public class ProyectoFinalCineApplication {
	/**
	 * Metodo principal que inicia la aplicación.
	 *
	 * @param args argumentos de línea de comandos.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalCineApplication.class, args);
	}

}
