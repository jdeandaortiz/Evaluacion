package jesusdeanda.giti7083s.figuras2;

/**
 * 
 * @author JesusDO
 *Clase Cuadrado hereda de la clase Figura
 */

public class Cuadrado extends Figura {
	private int lado;
	//M�todos de la clase
	@Override
	public double area() {

		return lado * lado;
	}
	//Setters y Getters
	/**
	 * M�todo para retornar lado
	 * @return lado
	 */
	public int getLado() {
		return lado;
	}
	/**
	 * @param lado para asignar lado 
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}
    
}
