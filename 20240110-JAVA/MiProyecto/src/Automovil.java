
public class Automovil {
	// Atributos
	private String marca;
	private int anio;
	private String color;
	
	//Constructor
	public Automovil() {
		System.out.println("Creando instancia de Clase Automovil");
	}
	
	public Automovil(String marca, int anio) {
		super();
		this.marca = marca;
		this.anio = anio;
	}

	
	public Automovil(String marca, int anio, String color) {
		super();
		this.marca = marca;
		this.anio = anio;
		this.color= color;
	}


	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// METODOS
	public void mostrarDatos() {
		System.out.println("Marca= "+this.marca+" - Año= "+this.anio+" - Color= "+this.color);
	}



	
	
	
}
