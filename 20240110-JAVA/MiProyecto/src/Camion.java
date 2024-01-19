
public class Camion extends Automovil {
	
	private double cargaMax;

	public Camion(String marca, int anio, double cargaMax) {
		super(marca,anio);
		this.cargaMax = cargaMax;
	}

	public double getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}
	
	
	public void mostrarCamion() {
		System.out.println("CAMION: MARCA= "+super.getMarca()+" - AÑO= "+super.getAnio()+" - COLOR= "+super.getColor()+" - CARGA= "+this.cargaMax);
	}
	
	/*
	public void mostrarCamion() {
		super.mostrarDatos();
		System.out.println(" - CARGA= "+this.cargaMax);
	}*/

	@Override
	public String toString() {
		return "Camion [cargaMax=" + cargaMax + ", getMarca()=" + getMarca() + ", getAnio()=" + getAnio()
				+ ", getColor()=" + getColor() + "]";
	}

	
	
}
