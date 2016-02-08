package jesusdeanda.giti7083s.interfacefigura;

import java.util.Scanner;
/**
 * 
 * @author JesusDO 
 * Clase Test
 */
public class TestInterfaceFigura {
	public void test() {
		Figura figura;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escoge una figura");
		int seleccion = scanner.nextInt();
		switch (seleccion) {
		case 1:
			figura = new Cuadrado();
			break;
		case 2:
			figura = new Circulo();
			break;
		case 3:
			figura = new Triangulo();
			break;

		default:
			break;
		}
	}
	public static void main(String[] args) {
		new TestInterfaceFigura().test();
	}

}
