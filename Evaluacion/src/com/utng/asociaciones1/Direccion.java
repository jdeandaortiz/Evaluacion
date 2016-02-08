/**
 * 
 */
package com.utng.asociaciones1;

/**
 * @author JesusDO
 * Declaración de la clase Calificacion
 */
public class Direccion {
	private String calle;
	private String numero;
	private String departamento;
	private int piso;
	private String cp;
	private String localidad;
	private String provincia;
	private String pais;
	
	//Setters y Getters
	/**
	 * Método para retornar calle
	 * @return calle
	 */
	public String getCalle() {
		return calle;
	}
	/**
	 * @param calle para asignar calle 
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
	/**
	 * Método para retornar numero
	 * @return numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero para asignar numero 
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * Método para retornar departamento
	 * @return departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento para asignar departamento 
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	/**
	 * Método para retornar piso
	 * @return piso
	 */
	public int getPiso() {
		return piso;
	}
	/**
	 * @param piso para asignar piso 
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}
	/**
	 * Método para retornar cp
	 * @return cp
	 */
	public String getCp() {
		return cp;
	}
	/**
	 * @param cp para asignar cp 
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}
	/**
	 * Método para retornar localidad
	 * @return localidad
	 */
	public String getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad para asignar localidad 
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	/**
	 * Método para retornar provincia
	 * @return provincia
	 */
	public String getProvincia() {
		return provincia;
	}
	/**
	 * @param provincia para asignar provincia 
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	/**
	 * Método para retornar pais
	 * @return pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais para asignar pais 
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}