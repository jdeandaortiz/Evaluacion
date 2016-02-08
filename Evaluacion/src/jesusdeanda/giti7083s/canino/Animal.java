package jesusdeanda.giti7083s.canino;

/**
 * @author JesusDO
 * Clase Abstracta Animal
 *
 */
public abstract class Animal {
	private String foto;
	private String tipo_Commida;
	private String localzacion;
	private String tamanio;
	/**
	 * 
	 */
	public Animal() {
		
	}
	//Métodos de la clase
	public abstract void hacerRuido();
	public abstract void comer();
	public abstract void dormir();
	public abstract void rugir();
	
	//Setters y Getters
	/**
	 * Método para retornar foto
	 * @return foto
	 */
	public String getFoto() {
		return foto;
	}
	/**
	 * @param foto para asignar foto 
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}
	/**
	 * Método para retornar tipo_Commida
	 * @return tipo_Commida
	 */
	public String getTipo_Commida() {
		return tipo_Commida;
	}
	/**
	 * @param tipo_Commida para asignar tipo_Commida 
	 */
	public void setTipo_Commida(String tipo_Commida) {
		this.tipo_Commida = tipo_Commida;
	}
	/**
	 * Método para retornar localzacion
	 * @return localzacion
	 */
	public String getLocalzacion() {
		return localzacion;
	}
	/**
	 * @param localzacion para asignar localzacion 
	 */
	public void setLocalzacion(String localzacion) {
		this.localzacion = localzacion;
	}
	/**
	 * Método para retornar tamanio
	 * @return tamanio
	 */
	public String getTamanio() {
		return tamanio;
	}
	/**
	 * @param tamanio para asignar tamanio 
	 */
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}	
}
