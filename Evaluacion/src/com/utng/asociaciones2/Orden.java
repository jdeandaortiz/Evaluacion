/**
 * 
 */
package com.utng.asociaciones2;

import java.util.List;

/**
 * @author JesusDO
 * Clase Orden
 */
public class Orden {
	private int hora;
	private String mesero;
	private Cliente cliente;
	private List<Bebida> bebidas;
	private List<Platillo>platillos;
	private Pago pago;

	// Constructor 
	public Orden(List<Bebida> bebidas, List<Platillo>platillos) {
		this.bebidas = bebidas;
		this.platillos = platillos;
		// TODO Auto-generated constructor stub
	}

}
