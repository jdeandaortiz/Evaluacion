package jesusdeanda.giti7083s.figuras2;

/**
 * 
 * @author JesusDO
 * Clase Test
 *
 */

public class TestFiguras2 {
	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.setRadio(4.6);
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setLado(3);
		System.out.println("Area circulo:" + circulo.area());
		System.out.println("Area cuadrado:" + cuadrado.area());
	}
}
