
public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mensaje("Hola Mundo!!!");
		System.out.println(buenDia("Santiago"));
	}
	
	
	public static void mensaje(String m) {
		System.out.println(m);
	}
	
	public static String buenDia(String name) {
		
		return "Buen dia "+name+" te deseo lo mejor";
	}
}
