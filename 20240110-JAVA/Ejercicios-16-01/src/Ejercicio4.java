import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {

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
        
	}

}
