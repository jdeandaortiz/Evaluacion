package com.utng.ayc;

/**
 * @author JesusDO
 * Declaración de la clase coche
 */
public class Coche {

	// Asociacion
	private Motor motor;

	public Coche(Motor motor) {
		this.motor = motor;
	}

	// Metodo para asignar conductor
	public void asignaConductor(Persona maneja) {
		maneja = new Persona("");
	}

	// Metodos del coche
	public void enciende() {
		System.out.println("Encender");
	}

	public void acelera() {
		System.out.println("Acelerar");
	}

	public void apaga() {
		System.out.println("Apagar");
	}

	public void frena() {
		System.out.println("Frenar");
	}

	public boolean estaEncendido() {
		return true;
	}
	//Setters y Getters

	/**
	 * Método para retornar motor
	 * @return motor
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * @param motor para asignar motor 
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
}