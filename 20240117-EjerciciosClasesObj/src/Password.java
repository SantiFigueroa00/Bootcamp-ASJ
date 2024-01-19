import java.util.Iterator;
import java.util.Random;

public class Password {
	private String contrasena;
	private int longitud;
	
	
	
	public Password() {
		super();
		this.longitud=8;
		generarPassword();
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		generarPassword();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}

	public String getContrasena() {
		return contrasena;
	}
	
	public void generarPassword() {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		for (int i = 0; i < longitud; i++) {
			int tipoCaracter = random.nextInt(3);
			
			switch (tipoCaracter) {
			case 0:
				sb.append((char) (random.nextInt(26) + 'A'));
				break;
			case 1:
				sb.append((char) (random.nextInt(26) + 'a'));
				break;
			case 2:
				sb.append(random.nextInt(10));
				break;
			}
			
			contrasena=sb.toString();
		}
	}
	
	public boolean esFuerte() {
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		
		for (char caracter : contrasena.toCharArray()) {
			if (Character.isUpperCase(caracter)) {
				mayusculas++;
			}else if (Character.isLowerCase(caracter)) {
				minusculas++;
			}else if (Character.isDigit(caracter)) {
				numeros++;
			}
		}
		
		return  mayusculas > 2 && minusculas > 1 && numeros > 5;
	}
	
	
	
}
