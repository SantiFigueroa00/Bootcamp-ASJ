import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        char caracter;
        int ascii;

        System.out.print("Ingrese un texto a codificar: ");
        texto = scanner.nextLine().toUpperCase();
        StringBuilder textoCifrado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            if (Character.isLetter(caracter)) {
                ascii = ((int) caracter - 'A' + 2) % 26 + 'A';
                textoCifrado.append((char) ascii);
            } else {
                textoCifrado.append(caracter);
            }
        }

        System.out.println("El texto cifrado es: " + textoCifrado.toString());
    }

}
