/**
 * 
 */
package com.utng.ayc;

/**
 * @author JesusDO
 * Declaraci�n de la clase Motor
 */
public class Motor {
	private int revolucionesPorMinuto;
	private boolean activo;

	// Metodos de la clase
	public void cambiarRevolucionesPorMinuto(int rpm) {
		System.out.println("Cambiar revoluciones a " + rpm);
	}

	public boolean estaActivo() {
		return activo;
	}

	public void activa() {
		System.out.println("Activar");
	}

	public void desactiva() {
		System.out.println("Desactivar");
	}

	//Setters y Getters
	/**
	 * M�todo para retornar revolucionesPorMinuto
	 * @return revolucionesPorMinuto
	 */
	public int getRevolucionesPorMinuto() {
		return revolucionesPorMinuto;
	}

	/**
	 * @param revolucionesPorMinuto para asignar revolucionesPorMinuto 
	 */
	public void setRevolucionesPorMinuto(int revolucionesPorMinuto) {
		this.revolucionesPorMinuto = revolucionesPorMinuto;
	}

	/**
	 * M�todo para retornar activo
	 * @return activo
	 */
	public boolean isActivo() {
		return activo;
	}

	/**
	 * @param activo para asignar activo 
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}