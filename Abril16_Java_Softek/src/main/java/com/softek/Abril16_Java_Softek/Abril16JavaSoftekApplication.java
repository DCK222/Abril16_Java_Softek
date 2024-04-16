package com.softek.Abril16_Java_Softek;

import com.softek.Abril16_Java_Softek.modelo.Ejercicio1;
import com.softek.Abril16_Java_Softek.modelo.Ejercicio3.Coche2;
import com.softek.Abril16_Java_Softek.modelo.Ejercicio3.Italler;
import com.softek.Abril16_Java_Softek.modelo.Ejercicio3.SeguroCoche;
import com.softek.Abril16_Java_Softek.modelo.Ejercicio4.Director;
import com.softek.Abril16_Java_Softek.modelo.ejercicio2.Coche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16JavaSoftekApplication implements CommandLineRunner {

	@Autowired
	private SeguroCoche repararseguro;
	@Autowired
	private Ejercicio1 saludo;
	@Autowired
	private Coche coche1;
	@Autowired
	private Coche2 coche;
	@Autowired
	private Director director;


	public static void main(String[] args) {
		SpringApplication.run(Abril16JavaSoftekApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----");
		System.out.println(saludo.getSaludo());
		System.out.println(coche1.moverse());
		System.out.println(repararseguro.reparar(coche));
		System.out.println(director.getTareas() + director.getInforme());



	}

}
