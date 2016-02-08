/**
 * 
 */
package com.utng.asociaciones2;

/**
 * @author JesusDO
 * clase Credito que hereda de Pago
 */
public class Credito extends Pago{
	private int numeroTdeCredito;
	private String tipo;
	private String nombre;
	
	private fechaDeExp fechaDeExp;
	
	/**
	 *
	 * @param total
	 * @return
	 */
	public static boolean hacerCargo(double total){
		return false;
	}
	
	public Credito() {
		// TODO Auto-generated constructor stub
	}

}
