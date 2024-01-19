import java.util.Random;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	
	
	public Persona() {
		super();
		generaDNI();
	}



	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(Character.toUpperCase(sexo));
		this.peso = 0;
        this.altura = 0;
        generaDNI();
	}



	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(Character.toUpperCase(sexo));
		this.peso = peso;
		this.altura = altura;
		generaDNI();
	}
	
	public int calcularIMC() {
		double formula = peso / Math.pow(altura, 2);
		
		if (formula < 20) {
            return -1;
        } else if (formula >= 20 && formula <= 25) {
            return 0;
        } else {
            return 1;
        }
	}
	
	public boolean esMayorDeEdad() {
		return edad>=18;
	}
	
	public char comprobarSexo(char sexo) {
		return (sexo == 'H' || sexo == 'M') ? sexo : 'H';
	}
	
	
	
	@Override
	public String toString() {
		return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nDNI: " + dni +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
	}

	private void generaDNI() {
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append((int) (Math.random() * 10));
        }
        dni = sb.toString();
	}

	
}
