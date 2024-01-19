
public class Clases {

	public static void main(String[] args) {
		
		Automovil bmw = new Automovil("BMW",2024);
		
//		bmw.marca="BMW";
//		bmw.anio=2024;
		
		bmw.mostrarDatos();
		
		
		bmw.setMarca("VW");
		System.out.println(bmw.getMarca());
		bmw.mostrarDatos();
		
		bmw.setColor("Rojo");
		bmw.mostrarDatos();
		
		
		Camion scaniaCamion = new Camion("Scania", 2024, 15000);
		scaniaCamion.setColor("Azul");
		scaniaCamion.mostrarCamion();
		
		System.out.println(scaniaCamion.toString());
		
	}

}
