/**
 * 
 */
package com.utng.herencia;

/**
 * @author JesusDO
 * Clase padre de la cual se heredan m�todos y atributos
 */

public class Vehiculo {
	 //se declara los atributos de la clase
	private String dueno;
	private int puertas;
	private int ruedas;
	// Constructor de la clase
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	// M�todos de la clase
	public void caracteristicas(){
		
	}
	// Setters y Getters
	/**
	 * M�todo para retornar el due�o del auto
	 * @return dueno
	 */
	public String getDueno() {
		return dueno;
	}
	/**
	 * M�todo para asignar el due�o del vehiculo
	 * @param dueno para asignar el due�o
	 */
	public void setDueno(String dueno) {
		this.dueno = dueno;
	}
	/**
	 * M�todo para retornar n�mero de puertas
	 * @return puertas
	 */
	public int getPuertas() {
		return puertas;
	}
	/**
	 * M�todo para asignar el n�mero de Puertas
	 * @param puertas para asignar el n�mero de puertas
	 */
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	/**
	 * M�todo para retornar n�mero de ruedas
	 * @return ruedas
	 */
	public int getRuedas() {
		return ruedas;
	}
	/**
	 * M�todo para asignar el n�mero de ruedas
	 * @param puertas para asignar el n�mero de ruedas
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
}
