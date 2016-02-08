/**
 * 
 */
package jesusdeanda.giti7083s.proyecto;

import java.util.Date;
import java.util.List;

/**
 * @author JesusDO
 * clase presupuestos
 */
public class Presupuestos {
	private List<DeptoComercial> valida;
	private Cliente cliente;
	private Date fecha;
	private String descipcion;
	private Double importe;
	private String estado;
	private Comercial calcula;
	private List<Viaje> tiene;
	private List<Proyecto> proyectos;

	public Presupuestos(IConsultarEstado consutarEstado, Cliente cliente,
			Viaje viaje, Proyecto proyecto) {
		// TODO Auto-generated constructor stub
	}

}
