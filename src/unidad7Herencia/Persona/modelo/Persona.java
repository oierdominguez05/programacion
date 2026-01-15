package unidad7Herencia.Persona.modelo;

import java.util.Random;

public class Persona {

	private static final char sexoDefecto = 'H';
	
	
	private String nombre;
	private int edad;
	private int id;
	private char sexo;
	private double peso;// Kg
	private double altura; // m
	
	public Persona() {
		this.id = generarId();
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		
	}

	public Persona(String nombre, int edad, String id, char sexo, double peso, double altura) {
		this(nombre, edad, sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		double calculo = peso / (altura * altura);
		if (calculo < 20) return -1;
		if (calculo <= 25) return 0;
		return 1;
		
	}
	
	public boolean mayorDeEdad() {
		if(edad >= 18) return true;
		return false;
	}

	public char comprobarSexo() {
		if (sexo == 'M') return 'M';
		return 'H';
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", Id=" + Id + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	public int generarId() {
		int numero = (int)(Math.random() * 10);
		return numero;
	}
	
	
}
