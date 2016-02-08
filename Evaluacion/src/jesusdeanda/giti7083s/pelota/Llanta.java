package jesusdeanda.giti7083s.pelota;

/**
 * 
 * @author JesusDO
 * Clase LLanta
 *
 */

public class Llanta implements Rebotable{
	private int factorRebote;

	@Override
	public void rebotar() {
		System.out.println("Rebotar");
	}

	@Override
	public void setfactorRebote(int factorRebote) {
		this.factorRebote = factorRebote;
		
	}
	

}
