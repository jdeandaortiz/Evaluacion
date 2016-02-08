package jesusdeanda.giti7083s.animal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestAnimal {
	
	public void test(){
		Animal animal;
		Scanner s = new Scanner(System.in);
		System.out.println("Escoge un animal");
		int seleccion = s.nextInt();
		switch (seleccion) {
		case 1:
			animal = new Perro();
			animal.setNombre("Perro");
			System.out.println("Soy un perro y me llamo "+ animal.getNombre());
			break;
		case 2:
			animal = new Gato();
			animal.setNombre("Gato");
			System.out.println("Soy un gato y me llamo "+ animal.getNombre());
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		new TestAnimal().test();
	}

}
