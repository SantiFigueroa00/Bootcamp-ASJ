import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbersRandom = new ArrayList<>();
        ArrayList<Integer> numbersEven = new ArrayList<>();
        ArrayList<Integer> numbersOdd = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(101);
            numbersRandom.add(randomNumber);

            if (randomNumber % 2 == 0) {
                numbersEven.add(randomNumber);
            } else {
                numbersOdd.add(randomNumber);
            }
        }

        numbersRandom.clear();
        numbersRandom.addAll(numbersEven);
        numbersRandom.addAll(numbersOdd);

        System.out.println("Array después del intercambio:");
        System.out.println(numbersRandom);
    
	}

}
