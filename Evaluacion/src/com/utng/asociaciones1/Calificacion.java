/**
 * 
 */
package com.utng.asociaciones1;

/**
 * @author JesusDO
 * Declaración de la clase Calificacion
 */
public class Calificacion {
	private int cal_ID;
	private String cal_descripcion;
	// Asociacion
	private ProveedorCalificado proveedor = new ProveedorCalificado(null);
	//Setters y Getters
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
	 * Método para retornar cal_descripcion
	 * @return cal_descripcion
	 */
	public String getCal_descripcion() {
		return cal_descripcion;
	}
	/**
	 * @param cal_descripcion para asignar cal_descripcion 
	 */
	public void setCal_descripcion(String cal_descripcion) {
		this.cal_descripcion = cal_descripcion;
	}
	/**
	 * Método para retornar proveedor
	 * @return proveedor
	 */
	public ProveedorCalificado getProveedor() {
		return proveedor;
	}
	/**
	 * @param proveedor para asignar proveedor 
	 */
	public void setProveedor(ProveedorCalificado proveedor) {
		this.proveedor = proveedor;
	}
}
