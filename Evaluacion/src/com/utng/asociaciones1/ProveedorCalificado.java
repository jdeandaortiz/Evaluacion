/**
 * 
 */
package com.utng.asociaciones1;

import java.util.Date;
import java.util.List;

/**
 * @author JesusDO
 * Declaración de la clase Calificacion
 */
public class ProveedorCalificado {
	private Date fechaCalificacion;
	private int cal_ID;
	private int pr_ID;
	private List<Calificacion> calificacions;
	//Constructor de la clase
	public ProveedorCalificado(List<Calificacion> calificacions) {
		this.calificacions = calificacions;

	}
	//Setters y Getters
	/**
	 * Método para retornar fechaCalificacion
	 * @return fechaCalificacion
	 */
	public Date getFechaCalificacion() {
		return fechaCalificacion;
	}
	/**
	 * @param fechaCalificacion para asignar fechaCalificacion 
	 */
	public void setFechaCalificacion(Date fechaCalificacion) {
		this.fechaCalificacion = fechaCalificacion;
	}
	/**
	 * Método para retornar cal_ID
	 * @return cal_ID
	 */
	public int getCal_ID() {
		return cal_ID;
	}
	/**
	 * @param cal_ID para asignar cal_ID 
	 */
	public void setCal_ID(int cal_ID) {
		this.cal_ID = cal_ID;
	}
	/**
	 * Método para retornar pr_ID
	 * @return pr_ID
	 */
	public int getPr_ID() {
		return pr_ID;
	}
	/**
	 * @param pr_ID para asignar pr_ID 
	 */
	public void setPr_ID(int pr_ID) {
		this.pr_ID = pr_ID;
	}
	/**
	 * Método para retornar calificacions
	 * @return calificacions
	 */
	public List<Calificacion> getCalificacions() {
		return calificacions;
	}
	/**
	 * @param calificacions para asignar calificacions 
	 */
	public void setCalificacions(List<Calificacion> calificacions) {
		this.calificacions = calificacions;
	}
}
