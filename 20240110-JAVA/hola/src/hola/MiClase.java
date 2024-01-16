package hola;

import java.util.Iterator;
import java.util.Scanner;

public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Hola loco");
		
		int edad = 0;
		char letra;
		double num1;
		Boolean estado;
		String nombre;
		float precio;
		
		System.out.println(edad+1);
		edad=25;
		letra = 'c';
		num1 = 12.2;
		estado=true;
		precio=29.3f;
		
		System.out.println(edad+1);
		System.out.println(letra);
		System.out.println(num1);
		System.out.println(estado);
		System.out.println(precio);
		
		//Estructura condicional
		if(edad>18) {
			System.out.println("Mayor qllll");
		}*/
		
		Scanner scanner = new Scanner(System.in);
		/*int myInt1 = scanner.nextInt();
		int myInt2 = scanner.nextInt();
		int myInt3 = scanner.nextInt();
		scanner.close();

		System.out.println("myInt is: " + myInt1);
		System.out.println("myInt is: " + myInt2);
		System.out.println("myInt is: " + myInt3);*/
		
		/*int myInt = scanner.nextInt();
		double myDouble = scanner.nextDouble();
		scanner.nextLine();
		String myString = scanner.nextLine();
		scanner.close();

		System.out.println("myString is: " + myString);
		System.out.println("myDouble is: " + myDouble);
		System.out.println("myInt is: " + myInt);*/
				
		
		/*System.out.print("Enter a number: ");
		int myInt = scanner.nextInt();
		scanner.close();
		
		
		if(myInt>=1 && myInt<=100) {
			if(myInt%2!=0) {
				System.out.println("WEIRD");
			}else if(2<=myInt && myInt<=5) {
				System.out.println("NOT WEIRD");
			}else if(6<=myInt && myInt<=20) {
				System.out.println("WEIRD");
			}else if(myInt>20){
				System.out.println("NOT WEIRD");
			}
		}else {
			System.out.println("You didn't entered a numbrer between 1 and 100");
		}
		*/
		/*int myInt;
		do {
			System.out.print("Enter a number, to see your first 10 multipliers: ");
			myInt = scanner.nextInt();
		}while(myInt<2 || myInt>20);
		
		scanner.close();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(myInt+" * "+i+ " = "+ myInt*i );
		}*/
		int array[][];
        int q, a, b, n;
        int index = 0;

        do {
            System.out.print("Enter a number between 0 and 500: ");
            q = scanner.nextInt();
        } while (q < 0 || q > 500);

        array = new int[q][];

        for (int i = 0; i < q; i++) {
            do {
                System.out.print("\nEnter 3 numbers: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                n = scanner.nextInt();
            } while (a < 0 || a > 50 || b < 0 || b > 50 || n < 0 || n > 15);

            array[index] = new int[n];
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    array[i][j] = (int) (a + Math.pow(2, j) * b); // Utilizar Math.pow para calcular la potencia
                } else {
                	array[i][j] = array[i][j- 1] + (int) (a + Math.pow(2, j) * b); // Utilizar Math.pow para calcular la potencia
                }
            }
            index++;
        }

        scanner.close();

        // Mostrar el resultado
        for (int h = 0; h < q; h++) {
            for (int j = 0; j < array[h].length; j++) {
                System.out.print(array[h][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
		
	}

}
