package jesusdeanda.giti7083s.figuras;
/**
 * 
 * @author JesusDO
 * Clase Circulo extiende de clase abstracta Figura
 *
 */

public class Circulo extends Figura {
	private Punto centro = null;
	private double radio = 0.0;
	private static double PI = Math.PI;
	//Métodos de la clase
	@Override
	public double calcularPerimetro() {
		return PI * (2 * radio);
	}
	@Override
	public double calcularArea() {
		return PI * (radio * radio);
	}
	//Setters y Getters
	/**
	 * Método para retornar centro
	 * @return centro
	 */
	public Punto getCentro() {
		return centro;
	}
	/**
	 * @param centro para asignar centro 
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	/**
	 * Método para retornar radio
	 * @return radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio para asignar radio 
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/**
	 * Método para retornar pI
	 * @return pI
	 */
	public static double getPI() {
		return PI;
	}
	/**
	 * @param pI para asignar pI 
	 */
	public static void setPI(double pI) {
		PI = pI;
	}

}
