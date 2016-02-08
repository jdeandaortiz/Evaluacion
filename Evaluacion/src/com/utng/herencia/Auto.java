/**
 * 
 */
package com.utng.herencia;

/**
 * @author JesusDO
 * Clase que hereda de la clase Vehiculo
 */
public class Auto extends Vehiculo{
	//se declaran los atributos de la clase
	private boolean descapotable;
	public Auto() {
		// TODO Auto-generated constructor stub
	}
	// M�todos de la clase
	public void caracteristicas() {
		System.out.println("Caracteristicas");
	}
	public void subir() {
		System.out.println("Subir");
	}
	public void bajar() {
		System.out.println("Bajar");
	}
    
	// Setters y Getters
	/**
	 * M�todo para retornar si es descapotable
	 * @return descapotable
	 */
	public boolean isDescapotable() {
		return descapotable;
	}

	/**
	 * M�todo para asignar descapotable
	 * @param descapotable para determinar si es descapotable
	 */
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
}
