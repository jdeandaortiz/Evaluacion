/**
 * 
 */
package com.utng.ayc;

/**
 * @author JesusDO
 * Declaraci�n de la clase Aplicacion
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
	//M�todos de la clase
	private void inicia() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		
	}

}
