package br.senai.sp.model;

public class Triangulo {
	
	// Propriedades da classe
	public double base; 
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;
	
	// Métodos da classe
	public void mostrarDimensoes() {
		System.out.println("_____________________");
		System.out.println("Nome: "+ nome);
		System.out.println("_____________________");
		System.out.println("Base----> "+ base);
		System.out.println("Lado B--> "+ ladoB);
		System.out.println("Lado C--> "+ ladoC);
		System.out.println("Altura--> "+ altura);
		System.out.println("---------------------");
		calcularPerimetro();
		calcularArea();
	
}
	public void calcularArea() {
		
		double area = (base * altura) / 2;
		System.out.println("Área do triângulo=" + area);
}
	public void calcularPerimetro() {
		
		double perimetro = (base + ladoB + ladoC);
		System.out.println("Perímetro do triângulo=" + perimetro);
}
}
