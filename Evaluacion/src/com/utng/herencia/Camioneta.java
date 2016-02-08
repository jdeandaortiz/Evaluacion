package com.utng.herencia;
/**
 * @author JesusDO
 * Clase que hereda de la clase Vehiculo
 */

public class Camioneta extends Vehiculo{
	//se declara los atributos de la clase
	private float tara;
	private float carga;
	// Constructor de la clase
	public Camioneta() {
		// TODO Auto-generated constructor stub
	}
	// M�todos de la clase
	public void caracteristicas(){
		System.out.println("Caracteristicas");
	}
	public void cargar(float kilos){
		System.out.println("Cargas: " + kilos);
	}
	// Setters y Getters
	/**
	 * M�todo para retornar la tara
	 * @return rata
	 */
	public float getTara() {
		return tara;
	}
	/**
	 * M�todo para asignar la tara
	 * @param tara para asignar la tara
	 */
	public void setTara(float tara) {
		this.tara = tara;
	}
	/**
	 * M�todo para retornar la carga
	 * @return carga
	 */
	public float getCarga() {
		return carga;
	}
	/**
	 * M�todo para asignar la carga
	 * @param carga para asignar la carga
	 */
	public void setCarga(float carga) {
		this.carga = carga;
	}

}
