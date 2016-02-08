/**
 * 
 */
package com.utng.ayc;

/**
 * @author JesusDO
 * Declaración de la clase Aplicacion
 */
public class Aplicacion {
	Motor motor;
	Coche coche;
	Persona persona;
	//Constructor
	public Aplicacion() {
		Motor motor = new Motor();
		Coche coche = new Coche(motor);
		Persona persona = new Persona("");
	}
	//Métodos de la clase
	private void inicia() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		
	}

}
