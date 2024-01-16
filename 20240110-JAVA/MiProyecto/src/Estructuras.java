import java.io.NotActiveException;
import java.util.Scanner;

public class Estructuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a = 10;
		int b = 20;
		
		if (a<b) {
			System.out.println("cumplio");
		} else {
			System.out.println("no cumplio");
		}
		
		
		switch (key) {
		case value:
			
			break;

		default:
			break;
		}
		
		
		boolean state = false;
		String msgString = state ? "Aprobado" : "Desaprobado";
		System.out.println(msgString);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		int i =0;
		while (state==false) {
			if (i==5) {
				System.out.println("sale");
				state=true;
			}
			i++;
		}
		
		i=0;
		do {
			if (i==5) {
				System.out.println("sale");
				state=true;
			}
			i++;
		} while (state==false);
		
		*/
		
		/*
		EJERCICIO

		Pedir al usuario que ingrese ¿cuántas notas quiere ingresar?
		Según eso, pedir el valor de cada nota (1 al 10)
		Sacar el promedio

		Aclaración: hacerlo con FOR, WHILE y DO-WHILE
		*/
		double grade;
		double acc=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----------FOR");
		System.out.print("how many grades do you want to enter? ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= n; i++) {
			do {
				System.out.print("Enter the value of the note "+(i)+" :");
				grade = scanner.nextDouble();
			} while (grade<1 || grade>10);
			acc+=grade;
		}
		
		System.out.println("The grade point average is: "+acc/n);
		
		acc=0;
		int i = 1;
		System.out.println("-----------WHILE");
		while (i<=n) {
			do {
				System.out.print("Enter the value of the note "+(i)+" :");
				grade = scanner.nextDouble();
			} while (grade<1 || grade>10);
			acc+=grade;
			i++;
		}
		
		System.out.println("The grade point average is: "+acc/n);
		
		System.out.println("-----------DO WHILE");
		acc=0;
		i=1;
		do {
			do {
				System.out.print("Enter the value of the note "+(i)+" :");
				grade = scanner.nextDouble();
			} while (grade<1 || grade>10); 
			acc+=grade;
			i++;
		} while (i<=n);
		System.out.println("The grade point average is: "+acc/n);
		scanner.close();
	}
}
