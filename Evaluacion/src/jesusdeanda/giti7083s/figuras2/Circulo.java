package jesusdeanda.giti7083s.figuras2;

/**
 * 
 * @author JesusDO
 * Clase Circulo hereda de la clase Figura
 *
 */
public class Circulo extends Figura {
	private double radio;
	private static double PI = Math.PI;

	//Métodos de clase
	@Override
	public double area() {
		return PI * (radio * radio);
	}
	//Setters y Getters
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
