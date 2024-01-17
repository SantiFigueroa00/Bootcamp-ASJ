import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers= new int[15];
		
		System.out.println("Ingrese 15 numeros enteros: ");
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        if (numbers.length > 0) {
            int lastElement = numbers[numbers.length - 1];

            for (int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }

            numbers[0] = lastElement;
        }
        
		System.out.println("Array después de la rotación:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
	}

}
