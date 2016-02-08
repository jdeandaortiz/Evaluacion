package jesusdeanda.giti7083s.animal;

/**
 * 
 * @author JesusDO 
 * Clase Animal que implementa interfaz IAnimal
 *
 */

public class Animal implements IAnimal{
	public String nombre;

	// Constructor de la clase
	public Animal() {
		
	}

	// Métodos de la clase
	public void tipoAnimal() {

	}
	
	@Override
	public void comunicarse() {
		// TODO Auto-generated method stub
		
	}
	//Setters y Getters
	/**
	 * Método para retornar nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre para asignar nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
