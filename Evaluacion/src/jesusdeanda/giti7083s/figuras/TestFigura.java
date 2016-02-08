package jesusdeanda.giti7083s.figuras;
/**
 * 
 * @author JesusDO
 * Clase Test
 *
 */

public class TestFigura {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.setRadio(4.6);
		System.out.println("Perimetro: " + circulo.calcularPerimetro());
		System.out.println("Area: " + circulo.calcularArea());
	}
}
