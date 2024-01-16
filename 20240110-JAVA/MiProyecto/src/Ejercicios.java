import java.util.Scanner;
import java.util.function.BiConsumer;

import javax.lang.model.element.Element;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		
		//Crear un programa donde se introduzcan los tres ángulos internos de un triángulo y se determine si el triángulo es válido o no.
		
		int a,b,c;
		String condition ="";
		/*
		System.out.println("---------Ejercicio 1 ----------");
		do {
			System.out.println("Ingrese el valor de 3 angulos internos de un triangulo (ej: 60 60 60): ");
			a= scanner.nextInt();
			b= scanner.nextInt();
			c= scanner.nextInt();
			
			if((a+b+c)==180) {
				System.out.println("El Triangulo es Valido \n");
				System.out.println("Desea volver a probar? (y/n): ");
				condition = scanner.nextLine().toLowerCase();
			}else{
				System.out.println("El Triangulo NO es Valido, la suma de sus angulos no da 180 ");
			}
		} while (condition.equals("y"));
		*/
//		Crear un programa que determine si un string introducido por un usuario empieza con un número o con una letra.
		/* System.out.println("---------Ejercicio 2 ----------");
		
		String input;
		
		do {
			System.out.print("Ingrese un texto: ");
			input= scanner.nextLine();
			
			if(input.charAt(0)>=48 && input.charAt(0)<=57) {
				System.out.println("El texto comienza con un numero \n");
				System.out.print("Desea volver a probar? (y/n): ");
				condition = scanner.nextLine().toLowerCase();
			}else if ((input.charAt(0)>=65&&input.charAt(0)<=90) || (input.charAt(0)>=97&&input.charAt(0)<=122)){
				System.out.println("El texto comienza con una letra \n");
				System.out.print("Desea volver a probar? (y/n): ");
				condition = scanner.nextLine().toLowerCase();
			}else {
				System.out.println("El texto no comienza ni con una letra ni con un numero");
				System.out.print("Desea volver a probar? (y/n): ");
				condition = scanner.nextLine().toLowerCase();
				
				System.out.println(condition.equals("y"));
			}
		} while (condition.equals("y"));
		*/
//		Realizar la suma de todos los números pares entre N y M donde N y M los ingresa un usuario.
		/*
		System.out.println("---------Ejercicio 3 ----------");
		
		int sum=0;
		
		do {
			do {
				System.out.print("Ingrese dos numeros enteros: ");
				a= scanner.nextInt();
				b= scanner.nextInt();	
				scanner.nextLine();
			} while (a>=b);
			
			for (int i = a; i <= b; i++) {
				if (i%2==0) {
					sum+=i;
				}
			}
			
			System.out.println("El resultado de la suma de los numeros enteros entre "+a+" y "+b+" es: "+sum);
			sum=0;
			System.out.print("Desea volver a probar? (y/n): ");
			condition = scanner.nextLine().toLowerCase();
		} while (condition.equals("y"));
		 */

//		Crear un programa que determine si un número es perfecto o no, (se dice que un número es perfecto si el número es igual a la suma de sus divisores positivos, excluido él mismo., Ejemplos 6 = 1 + 2 + 3)
/*
		System.out.println("---------Ejercicio 4 ----------");
		
		int sum=0;
		
		do {
			do {
				System.out.print("Ingrese un numero entero: ");
				a= scanner.nextInt();
				scanner.nextLine();
			} while (a<0);
			
			for (int i = 1; i < a; i++) {
				if (a%i==0) {
					sum+=i;
				}
			}
			
			String result = sum==a ? "El numero es perfecto"  : "El numero NO es perfecto";
				
			System.out.println(result);

			sum=0;
			System.out.print("Desea volver a probar? (y/n): ");
			condition = scanner.nextLine().toLowerCase();
			
		} while (condition.equals("y"));
		*/
		
//		Recrear el siguiente dibujo:(ver imagen)
		
		System.out.println("---------Ejercicio 5 ----------");
		
		int sum=0;
		
		do {
			do {
				System.out.print("Ingrese un numero entero: ");
				a= scanner.nextInt();
				scanner.nextLine();
			} while (a<0);
			
			for (int i = 1; i <= a; i++) {
				if (i%2==0) {
					for (int j = 0; j < (a-1); j++) {
						System.out.print("* ");
					}
					System.out.print("\n");
				}else {
					for (int j = 0; j < a; j++) {
						System.out.print("* ");
					}
					System.out.print("\n ");
				}
			}

			System.out.print("Desea volver a probar? (y/n): ");
			condition = scanner.nextLine().toLowerCase();
			
		} while (condition.equals("y"));
	}

}
