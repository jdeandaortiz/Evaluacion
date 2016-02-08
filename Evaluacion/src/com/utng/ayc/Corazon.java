/**
 * 
 */
package com.utng.ayc;

/**
 * @author JesusDO
 * Declaración de la clase Corazon
 */
public class Corazon {
	private int ritmo;

	// Métodos de la clase
	public void cambiarRitmo() {
		System.out.println("Cambiar Ritmo");
	}

	public int leerRitmo() {
		return ritmo;
	}
	//Setters y Getters

	/**
	 * Método para retornar ritmo
	 * @return ritmo
	 */
	public int getRitmo() {
		return ritmo;
	}

	/**
	 * @param ritmo para asignar ritmo 
	 */
	public void setRitmo(int ritmo) {
		this.ritmo = ritmo;
	}
}