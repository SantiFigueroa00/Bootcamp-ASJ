import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio5 {

	public static void main(String[] args) {
		
        int[][] matriz = new int[3][3];

        Set<Integer> numerosUnicos = new HashSet<>();

        Random random = new Random();

        while (numerosUnicos.size() < 9) {
            int numeroAleatorio = random.nextInt(51) + 1; 
            numerosUnicos.add(numeroAleatorio);
        }

        int indice = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) numerosUnicos.toArray()[indice];
                indice++;
            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        Scanner scanner = new Scanner(System.in);
        int key, resultado=0, fila, columna ;
        boolean condition=false;
        
        do {
        	System.out.println("\n Opciones: ");
            System.out.println("1- Sumar Fila");
            System.out.println("2- Sumar Columna");
            System.out.print("Ingrese la opcion deseada: ");
            key=scanner.nextInt();
            scanner.nextLine();
            
            switch (key) {
    		case 1:
    			do {
    				System.out.print("\n ¿Cual fila desea sumar? 1, 2 o 3: ");
    				fila=scanner.nextInt();
    				scanner.nextLine();
				} while (fila < 1 || fila > 4);
    			
    			for (int j = 0; j < 3; j++) {
    					resultado+=matriz[fila-1][j];
    			}
    			condition=true;
    			break;
    		case 2:
    			do {
    				System.out.print("\n ¿Cual Columna desea sumar? 1, 2 o 3: ");
    				columna=scanner.nextInt();
    				scanner.nextLine();
				} while (columna < 1 || columna > 4);
    			
    			for (int i = 0; i < 3; i++) {
    				resultado+=matriz[i][columna-1];
    			}
    			condition=true;
    			break;
    		default:
    			System.out.println("Elegi una opcion correcta, porfavor");
    			break;
    		}
		} while (!condition);
        
        
        System.out.println("\n El resultado de la suma es: "+resultado);
	}

}
