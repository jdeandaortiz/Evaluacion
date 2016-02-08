/**
 * 
 */
package com.utng.asociaciones1;

import java.util.List;

/**
 * @author JesusDO
 * Declaración de la clase Articulo
 */
public class Articulo {
	private String art_ID;
	private String art_Descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadCritica;
	private double art_cantidadMinima;

	// Agregación
	private List<Rubro> rubros;
	// Asociacion
	private Precio tiene = new Precio();

	public Articulo(List<Rubro> rubros) {
		this.rubros = rubros;
		// TODO Auto-generated constructor stub
	}
	//Setters y Getters
	/**
	 * Método para retornar art_ID
	 * @return art_ID
	 */
	public String getArt_ID() {
		return art_ID;
	}

	/**
	 * @param art_ID para asignar art_ID 
	 */
	public void setArt_ID(String art_ID) {
		this.art_ID = art_ID;
	}

	/**
	 * Método para retornar art_Descripcion
	 * @return art_Descripcion
	 */
	public String getArt_Descripcion() {
		return art_Descripcion;
	}

	/**
	 * @param art_Descripcion para asignar art_Descripcion 
	 */
	public void setArt_Descripcion(String art_Descripcion) {
		this.art_Descripcion = art_Descripcion;
	}

	/**
	 * Método para retornar art_estado
	 * @return art_estado
	 */
	public int getArt_estado() {
		return art_estado;
	}

	/**
	 * @param art_estado para asignar art_estado 
	 */
	public void setArt_estado(int art_estado) {
		this.art_estado = art_estado;
	}

	/**
	 * Método para retornar art_tipo
	 * @return art_tipo
	 */
	public int getArt_tipo() {
		return art_tipo;
	}

	/**
	 * @param art_tipo para asignar art_tipo 
	 */
	public void setArt_tipo(int art_tipo) {
		this.art_tipo = art_tipo;
	}

	/**
	 * Método para retornar art_cantidad
	 * @return art_cantidad
	 */
	public int getArt_cantidad() {
		return art_cantidad;
	}

	/**
	 * @param art_cantidad para asignar art_cantidad 
	 */
	public void setArt_cantidad(int art_cantidad) {
		this.art_cantidad = art_cantidad;
	}

	/**
	 * Método para retornar art_cantidadCritica
	 * @return art_cantidadCritica
	 */
	public double getArt_cantidadCritica() {
		return art_cantidadCritica;
	}

	/**
	 * @param art_cantidadCritica para asignar art_cantidadCritica 
	 */
	public void setArt_cantidadCritica(double art_cantidadCritica) {
		this.art_cantidadCritica = art_cantidadCritica;
	}

	/**
	 * Método para retornar art_cantidadMinima
	 * @return art_cantidadMinima
	 */
	public double getArt_cantidadMinima() {
		return art_cantidadMinima;
	}

	/**
	 * @param art_cantidadMinima para asignar art_cantidadMinima 
	 */
	public void setArt_cantidadMinima(double art_cantidadMinima) {
		this.art_cantidadMinima = art_cantidadMinima;
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
	 * Método para retornar tiene
	 * @return tiene
	 */
	public Precio getTiene() {
		return tiene;
	}

	/**
	 * @param tiene para asignar tiene 
	 */
	public void setTiene(Precio tiene) {
		this.tiene = tiene;
	}
	
}