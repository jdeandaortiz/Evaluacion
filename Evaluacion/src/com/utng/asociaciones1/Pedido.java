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
public class Pedido {
	private double pe_id;
	private Date pe_fechaPedido;
	private Date pe_fechaNecesidad;
	private Date pe_fechaProgramada;
	private Date pe_fechaEntrega;
	private int pe_estado;
	private List<Articulo> contacts;
	//Constructor de la clase
	public Pedido(List<Articulo> contacts) {
		this.contacts = contacts;
	}
	//Setters y Getters
	/**
	 * Método para retornar pe_id
	 * @return pe_id
	 */
	public double getPe_id() {
		return pe_id;
	}
	/**
	 * @param pe_id para asignar pe_id 
	 */
	public void setPe_id(double pe_id) {
		this.pe_id = pe_id;
	}
	/**
	 * Método para retornar pe_fechaPedido
	 * @return pe_fechaPedido
	 */
	public Date getPe_fechaPedido() {
		return pe_fechaPedido;
	}
	/**
	 * @param pe_fechaPedido para asignar pe_fechaPedido 
	 */
	public void setPe_fechaPedido(Date pe_fechaPedido) {
		this.pe_fechaPedido = pe_fechaPedido;
	}
	/**
	 * Método para retornar pe_fechaNecesidad
	 * @return pe_fechaNecesidad
	 */
	public Date getPe_fechaNecesidad() {
		return pe_fechaNecesidad;
	}
	/**
	 * @param pe_fechaNecesidad para asignar pe_fechaNecesidad 
	 */
	public void setPe_fechaNecesidad(Date pe_fechaNecesidad) {
		this.pe_fechaNecesidad = pe_fechaNecesidad;
	}
	/**
	 * Método para retornar pe_fechaProgramada
	 * @return pe_fechaProgramada
	 */
	public Date getPe_fechaProgramada() {
		return pe_fechaProgramada;
	}
	/**
	 * @param pe_fechaProgramada para asignar pe_fechaProgramada 
	 */
	public void setPe_fechaProgramada(Date pe_fechaProgramada) {
		this.pe_fechaProgramada = pe_fechaProgramada;
	}
	/**
	 * Método para retornar pe_fechaEntrega
	 * @return pe_fechaEntrega
	 */
	public Date getPe_fechaEntrega() {
		return pe_fechaEntrega;
	}
	/**
	 * @param pe_fechaEntrega para asignar pe_fechaEntrega 
	 */
	public void setPe_fechaEntrega(Date pe_fechaEntrega) {
		this.pe_fechaEntrega = pe_fechaEntrega;
	}
	/**
	 * Método para retornar pe_estado
	 * @return pe_estado
	 */
	public int getPe_estado() {
		return pe_estado;
	}
	/**
	 * @param pe_estado para asignar pe_estado 
	 */
	public void setPe_estado(int pe_estado) {
		this.pe_estado = pe_estado;
	}
	/**
	 * Método para retornar contacts
	 * @return contacts
	 */
	public List<Articulo> getContacts() {
		return contacts;
	}
	/**
	 * @param contacts para asignar contacts 
	 */
	public void setContacts(List<Articulo> contacts) {
		this.contacts = contacts;
	}
}