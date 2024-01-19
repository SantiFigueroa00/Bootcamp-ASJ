import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println("EJERCICIO 1 -----"); Operaciones operaciones = new
		 * Operaciones(250,150); System.out.println(operaciones.suma());
		 * 
		 * System.out.println("\nEJERCICIO 2 -----"); Cuenta cuenta1 = new
		 * Cuenta("Flecha",220); System.out.println(cuenta1.toString());
		 * 
		 * System.out.println("-----");
		 * System.out.print("¿Cuanto dinero desea ingresar?: "); double ingreso =
		 * scanner.nextDouble(); scanner.nextLine();
		 * 
		 * cuenta1.ingresar(ingreso); System.out.println(cuenta1.toString());
		 * 
		 * System.out.println("-----");
		 * System.out.print("¿Cuanto dinero desea retirar?: "); double retiro =
		 * scanner.nextDouble(); scanner.nextLine();
		 * 
		 * cuenta1.retirar(retiro); System.out.println(cuenta1.toString());
		 * 
		 
		System.out.println("\nEJERCICIO 3 -----");
		ArrayList<Password> contraseñas = new ArrayList<Password>();
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			Password contraseña = new Password(random.nextInt(20) + 8);
			contraseñas.add(contraseña);

			String seguridad = contraseña.esFuerte() ? "Fuerte" : "Debil";
			System.out.println("contraseña_" + i + ": " + contraseña.getContrasena());
			System.out.println("contraseña_" + i + " " + seguridad + "\n");

		}
*/
		System.out.println("\nEJERCICIO 4 -----");

        System.out.println("Ingrese datos para la primera persona:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Sexo (H/M): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        System.out.println("Ingrese datos para la segunda persona (sin peso y altura):");
        scanner.nextLine(); 
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Edad: ");
        edad = scanner.nextInt();
        System.out.print("Sexo (H/M): ");
        sexo = scanner.next().charAt(0);
        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona();

        System.out.println("\nResultados para la primera persona:");
        mostrarResultadosPersona(persona1);

        System.out.println("\nResultados para la segunda persona:");
        mostrarResultadosPersona(persona2);

        System.out.println("\nResultados para la tercera persona:");
        mostrarResultadosPersona(persona3);
    }

    private static void mostrarResultadosPersona(Persona persona) {
        int resultadoIMC = persona.calcularIMC();
        String mensajeIMC;
        switch (resultadoIMC) {
            case -1:
                mensajeIMC = "Por debajo de su peso ideal";
                break;
            case 0:
                mensajeIMC = "En su peso ideal";
                break;
            case 1:
                mensajeIMC = "Con sobrepeso";
                break;
            default:
                mensajeIMC = "Error al calcular IMC";
        }

        String mayorEdad = persona.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad";

        System.out.println("IMC: " + mensajeIMC);
        System.out.println(mayorEdad);
        System.out.println(persona.toString());
    }
}
