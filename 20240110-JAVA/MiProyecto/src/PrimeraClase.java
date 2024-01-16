import java.util.Scanner;

public class PrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int entero;
		double doble;
		float flotante;
		String string;
		char character;
		byte myByte;
		short myShort;
		long myLong;

//		System.out.println("Tipo: Minimo - Maximo");
//		System.out.println("int: Min= "+ Integer.MIN_VALUE + " - Max= "+ Integer.MAX_VALUE);
//		System.out.println("double: Min= "+ Double.MIN_VALUE + " - Max= "+ Double.MAX_VALUE);
//		System.out.println("float: Min= "+ Float.MIN_VALUE + " - Max= "+ Float.MAX_VALUE);
//		System.out.println("byte: Min= "+ Byte.MIN_VALUE + " - Max= "+ Byte.MAX_VALUE);
//		System.out.println("short: Min= "+ Short.MIN_VALUE + " - Max= "+ Short.MAX_VALUE);
//		System.out.println("long: Min= "+ Long.MIN_VALUE + " - Max= "+ Long.MAX_VALUE);

		// Casteo(parseo)
		entero = 40;
		doble = 12.5;

//		System.out.println(entero/doble);

		int a = 30;
		int b = 12;

//		System.out.println(a/b);
//		
//		double c = (double) a/b;
//		System.out.println(c);

		// Operadores
		/*
		 * Matematicos Logicos Comparacion
		 */

		String palabra1 = "B";
		String palabra2 = "A";

//		 System.out.println(palabra1.compareTo(palabra2));
//		 System.out.println(palabra1.equals(palabra2));

		int variableInt = 77;

		System.out.println((char) variableInt);

		/*
		 * Dada una palabra ingresada por el usuario , mostrar su equivalente en ASCII
		 * EJ: Hola -> 72 111 108 97
		 */
		
		/*
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String text = input.nextLine();

		char character1;
		int ascii;
		System.out.println("Equivalencia en ASCII: ");
		for (int i = 0; i < text.length(); i++) {
//			character1 = text.charAt(i);
//			ascii = (int) character1;
//
//			System.out.print(ascii);
			
			System.out.print((int) text.charAt(i));
			
			if (i < text.length() - 1) {
                System.out.print(" ");
            }
		}
		
		input.close();
		*/
		
		System.out.println(Math.PI);
		System.out.println(Math.pow(3, 2));
		System.out.println(Math.sqrt(25));
		
		double num = 45.5;
		
		System.out.println(Math.floor(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.round(num));
		
	}

}
