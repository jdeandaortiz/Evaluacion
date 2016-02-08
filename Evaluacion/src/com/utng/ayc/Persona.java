package com.utng.ayc;

/**
 * @author JesusDO
 * Declaración de la clase persona
 */
public class Persona {
	public String nombre;
	private Corazon corazon;

	// Constructor de la clase
	public Persona(String nombre) {
		// Composición
		this.corazon = new Corazon();

	}

	// Métodos de la clase
	public void asignarCoche(Coche coche) {
		System.out.println("Asignar Coche");
	}

	public void viaja() {
		System.out.println("Viajar");
	}

	public void emociona() {
		System.out.println("Emocionar");
	}

	public void tranquiliza() {
		System.out.println("Tranquilizar");
	}
	//Setters y Getters

	/**
	 * Método para retornar nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre para asignar nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para retornar corazon
	 * @return corazon
	 */
	public Corazon getCorazon() {
		return corazon;
	}

	/**
	 * @param corazon para asignar corazon 
	 */
	public void setCorazon(Corazon corazon) {
		this.corazon = corazon;
	}

	
}
