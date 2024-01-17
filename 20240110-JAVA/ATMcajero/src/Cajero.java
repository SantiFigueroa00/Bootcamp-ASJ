import java.util.ArrayList;
import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {

		boolean condition = false;
		Scanner scanner = new Scanner(System.in);
		int key;
		double cuenta=100, monto;
		ArrayList<String[]> operaciones = new ArrayList<>();
		
		
		do {
			System.out.println("   #----------MENU----------#");
			System.out.println("\t 1- EXTRAER");
			System.out.println("\t 2- DEPOSITAR");
			System.out.println("\t 3- CONSULTAR SALDO");
			System.out.println("\t 4- VER ULTIMOS MOV.");
			System.out.println("\t 5- SALIR");
			System.out.println("   #------------------------#");
			System.out.print("\n ¿Que opcion desea elegir?: ");
			key = scanner.nextInt();
			scanner.nextLine();
			switch (key) {
			case 1:
				clearConsole();
				System.out.print("Ingrese el monto a extraer: ");
				monto=scanner.nextDouble();
				scanner.nextLine();
				
				cuenta = extraccion(monto, cuenta,operaciones);
				
				System.out.println("Presiona Enter para continuar...");
				scanner.nextLine();
				
				
				break;
			case 2:
				clearConsole();
				System.out.print("Ingrese el monto a depositar: ");
				monto=scanner.nextDouble();
				scanner.nextLine();
				
				cuenta = deposito(monto, cuenta);
				
				operaciones.add(new String[]{"Deposito", Double.toString(monto)});
				
				System.out.println("Presiona Enter para continuar...");
				scanner.nextLine();
				
				break;
			case 3:
				clearConsole();
				
				System.out.println(consulta(cuenta));
				
				operaciones.add(new String[]{"Consulta de saldo", Double.toString(cuenta)});
				
				System.out.println("Presiona Enter para continuar...");
				scanner.nextLine();
				
				break;
			case 4:
				clearConsole();
				
				movimientos(operaciones);
		      
		        System.out.println("Presiona Enter para continuar...");
				scanner.nextLine();
				
				break;
			case 5:
				clearConsole();
				System.out.println("Gracias por usar nuestra sistema que tenga un buen dia.5");
				condition = true;
				break;

			default:
				clearConsole();
				System.out.println("Ingrese una opcion valida!");
				break;
			}

			
		} while (!condition);
		
		scanner.close();
	}


	private static void movimientos(ArrayList<String[]> operaciones) {
		System.out.println("Historial de Operaciones:");

	    if (operaciones.isEmpty()) {
	        System.out.println("No hay operaciones registradas.");
	    } else {
	        for (String[] operacion : operaciones) {
	            System.out.println("Tipo: " + operacion[0] + ", Monto: " + operacion[1]);
	        }
	    }
	}


	private static String consulta(double cuenta) {
		return "El saldo de su cuenta es: $ "+cuenta;
	}


	private static void clearConsole() {
	    for (int i = 0; i < 50; i++) {
	        System.out.println();
	    }
	}
	
	public static double extraccion(double monto,double cuenta, ArrayList<String[]> operaciones) {
		if (monto<=cuenta) {
			cuenta-=monto;
			operaciones.add(new String[]{"Extraccion", Double.toString(monto)});
		} else {
			System.out.println("Dinero en cuenta Insuficiente para realizar la operacion.");
		}
		
		return cuenta;
	}
	
	private static double deposito(double monto, double cuenta) {
		return cuenta+=monto;
	}
}
