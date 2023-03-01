package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		//Criar um triângulo
		System.out.println("Criando Triângulo 1...");
		Triangulo t1 = new Triangulo();
		System.out.println("Criando Triângulo 2...");
		Triangulo t2 = new Triangulo();
		System.out.println("Criando Triângulo 3...");
		Triangulo t3 = new Triangulo();
			
		//Definindo as dimensões dos triângulos
		t1.base = 20;
		t1.ladoB = 15;
		t1.ladoC = 15;
		t1.altura = 12;
		t1.nome = "Triângulo 001";
		
		t2.base = 10;
		t2.ladoB = 6;
		t2.ladoC = 8;
		t2.altura = 8;
		t2.nome = "Triângulo 002";
		
		t3.base = 18;
		t3.ladoB = 20;
		t3.ladoC = 21;
		t3.altura = 14;
		t3.nome = "Triângulo 003";
		
		//Mostrar dimensões dos triângulos
		t1.mostrarDimensoes();
		t2.mostrarDimensoes();
		t3.mostrarDimensoes();
		
	}

}
