/**
 * 
 */
package com.utng.asociaciones1;

/**
 * @author JesusDO
 * Declaración de la clase Precio
 */
public class Precio {
	private double pre_id;
	private double art_ID;
	private double pr_id;
	private float pr_pesos;
	private int pr_dolar;
	private float pr_cotizacionDolar;
	
	//Setters y Getters
	/**
	 * Método para retornar pre_id
	 * @return pre_id
	 */
	public double getPre_id() {
		return pre_id;
	}
	/**
	 * @param pre_id para asignar pre_id 
	 */
	public void setPre_id(double pre_id) {
		this.pre_id = pre_id;
	}
	/**
	 * Método para retornar art_ID
	 * @return art_ID
	 */
	public double getArt_ID() {
		return art_ID;
	}
	/**
	 * @param art_ID para asignar art_ID 
	 */
	public void setArt_ID(double art_ID) {
		this.art_ID = art_ID;
	}
	/**
	 * Método para retornar pr_id
	 * @return pr_id
	 */
	public double getPr_id() {
		return pr_id;
	}
	/**
	 * @param pr_id para asignar pr_id 
	 */
	public void setPr_id(double pr_id) {
		this.pr_id = pr_id;
	}
	/**
	 * Método para retornar pr_pesos
	 * @return pr_pesos
	 */
	public float getPr_pesos() {
		return pr_pesos;
	}
	/**
	 * @param pr_pesos para asignar pr_pesos 
	 */
	public void setPr_pesos(float pr_pesos) {
		this.pr_pesos = pr_pesos;
	}
	/**
	 * Método para retornar pr_dolar
	 * @return pr_dolar
	 */
	public int getPr_dolar() {
		return pr_dolar;
	}
	/**
	 * @param pr_dolar para asignar pr_dolar 
	 */
	public void setPr_dolar(int pr_dolar) {
		this.pr_dolar = pr_dolar;
	}
	/**
	 * Método para retornar pr_cotizacionDolar
	 * @return pr_cotizacionDolar
	 */
	public float getPr_cotizacionDolar() {
		return pr_cotizacionDolar;
	}
	/**
	 * @param pr_cotizacionDolar para asignar pr_cotizacionDolar 
	 */
	public void setPr_cotizacionDolar(float pr_cotizacionDolar) {
		this.pr_cotizacionDolar = pr_cotizacionDolar;
	}
}
