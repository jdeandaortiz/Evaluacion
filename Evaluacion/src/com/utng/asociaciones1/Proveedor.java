/**
 * 
 */
package com.utng.asociaciones1;

import java.util.ArrayList;
import java.util.List;
/**
 * @author JesusDO
 * Declaración de la clase Calificacion
 */
public class Proveedor {
	private double pr_ID;
	private String pr_RazonSocial;
	private String pr_contacto;
	private String pr_telefono1;
	private short pr_telefono2;
	private String pr_fax;
	private String pr_email1;
	private String pr_email2;
	private String pr_web;
	private int pr_CUIT;
	private List<Rubro> rubros;
	private Direccion direccion;
	private Precio precio = new Precio();
	private List<Articulo> articulos = new ArrayList<Articulo>();
	private Calificacion calificacion = new Calificacion();
	//Constructor de la clase
	public Proveedor(List<Rubro> rubros, Direccion direccion) {
		this.rubros = rubros;
		this.direccion = direccion;
	}
	//Getters y Setters
	/**
	 * Método para retornar pr_ID
	 * @return pr_ID
	 */
	public double getPr_ID() {
		return pr_ID;
	}
	/**
	 * @param pr_ID para asignar pr_ID 
	 */
	public void setPr_ID(double pr_ID) {
		this.pr_ID = pr_ID;
	}
	/**
	 * Método para retornar pr_RazonSocial
	 * @return pr_RazonSocial
	 */
	public String getPr_RazonSocial() {
		return pr_RazonSocial;
	}
	/**
	 * @param pr_RazonSocial para asignar pr_RazonSocial 
	 */
	public void setPr_RazonSocial(String pr_RazonSocial) {
		this.pr_RazonSocial = pr_RazonSocial;
	}
	/**
	 * Método para retornar pr_contacto
	 * @return pr_contacto
	 */
	public String getPr_contacto() {
		return pr_contacto;
	}
	/**
	 * @param pr_contacto para asignar pr_contacto 
	 */
	public void setPr_contacto(String pr_contacto) {
		this.pr_contacto = pr_contacto;
	}
	/**
	 * Método para retornar pr_telefono1
	 * @return pr_telefono1
	 */
	public String getPr_telefono1() {
		return pr_telefono1;
	}
	/**
	 * @param pr_telefono1 para asignar pr_telefono1 
	 */
	public void setPr_telefono1(String pr_telefono1) {
		this.pr_telefono1 = pr_telefono1;
	}
	/**
	 * Método para retornar pr_telefono2
	 * @return pr_telefono2
	 */
	public short getPr_telefono2() {
		return pr_telefono2;
	}
	/**
	 * @param pr_telefono2 para asignar pr_telefono2 
	 */
	public void setPr_telefono2(short pr_telefono2) {
		this.pr_telefono2 = pr_telefono2;
	}
	/**
	 * Método para retornar pr_fax
	 * @return pr_fax
	 */
	public String getPr_fax() {
		return pr_fax;
	}
	/**
	 * @param pr_fax para asignar pr_fax 
	 */
	public void setPr_fax(String pr_fax) {
		this.pr_fax = pr_fax;
	}
	/**
	 * Método para retornar pr_email1
	 * @return pr_email1
	 */
	public String getPr_email1() {
		return pr_email1;
	}
	/**
	 * @param pr_email1 para asignar pr_email1 
	 */
	public void setPr_email1(String pr_email1) {
		this.pr_email1 = pr_email1;
	}
	/**
	 * Método para retornar pr_email2
	 * @return pr_email2
	 */
	public String getPr_email2() {
		return pr_email2;
	}
	/**
	 * @param pr_email2 para asignar pr_email2 
	 */
	public void setPr_email2(String pr_email2) {
		this.pr_email2 = pr_email2;
	}
	/**
	 * Método para retornar pr_web
	 * @return pr_web
	 */
	public String getPr_web() {
		return pr_web;
	}
	/**
	 * @param pr_web para asignar pr_web 
	 */
	public void setPr_web(String pr_web) {
		this.pr_web = pr_web;
	}
	/**
	 * Método para retornar pr_CUIT
	 * @return pr_CUIT
	 */
	public int getPr_CUIT() {
		return pr_CUIT;
	}
	/**
	 * @param pr_CUIT para asignar pr_CUIT 
	 */
	public void setPr_CUIT(int pr_CUIT) {
		this.pr_CUIT = pr_CUIT;
	}
	/**
	 * Método para retornar rubros
	 * @return rubros
	 */
	public List<Rubro> getRubros() {
		return rubros;
	}
	/**
	 * @param rubros para asignar rubros 
	 */
	public void setRubros(List<Rubro> rubros) {
		this.rubros = rubros;
	}
	/**
	 * Método para retornar direccion
	 * @return direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion para asignar direccion 
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	/**
	 * Método para retornar precio
	 * @return precio
	 */
	public Precio getPrecio() {
		return precio;
	}
	/**
	 * @param precio para asignar precio 
	 */
	public void setPrecio(Precio precio) {
		this.precio = precio;
	}
	/**
	 * Método para retornar articulos
	 * @return articulos
	 */
	public List<Articulo> getArticulos() {
		return articulos;
	}
	/**
	 * @param articulos para asignar articulos 
	 */
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
	/**
	 * Método para retornar calificacion
	 * @return calificacion
	 */
	public Calificacion getCalificacion() {
		return calificacion;
	}
	/**
	 * @param calificacion para asignar calificacion 
	 */
	public void setCalificacion(Calificacion calificacion) {
		this.calificacion = calificacion;
	}
}