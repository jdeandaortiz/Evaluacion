/**
 * 
 */
package com.utng.herencia;

/**
 * @author JesusDO
 * Clase padre de la cual se heredan métodos y atributos
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
	// Métodos de la clase
	public void caracteristicas(){
		
	}
	// Setters y Getters
	/**
	 * Método para retornar el dueño del auto
	 * @return dueno
	 */
	public String getDueno() {
		return dueno;
	}
	/**
	 * Método para asignar el dueño del vehiculo
	 * @param dueno para asignar el dueño
	 */
	public void setDueno(String dueno) {
		this.dueno = dueno;
	}
	/**
	 * Método para retornar número de puertas
	 * @return puertas
	 */
	public int getPuertas() {
		return puertas;
	}
	/**
	 * Método para asignar el número de Puertas
	 * @param puertas para asignar el número de puertas
	 */
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	/**
	 * Método para retornar número de ruedas
	 * @return ruedas
	 */
	public int getRuedas() {
		return ruedas;
	}
	/**
	 * Método para asignar el número de ruedas
	 * @param puertas para asignar el número de ruedas
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
}
