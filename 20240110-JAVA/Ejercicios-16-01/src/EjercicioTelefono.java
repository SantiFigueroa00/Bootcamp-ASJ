import java.util.Scanner;

public class EjercicioTelefono {
	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner scanner = new Scanner(System.in);
	 * 
	 * System.out.print("Ingrese un texto a traducir: "); String texto =
	 * scanner.nextLine().toUpperCase();
	 * 
	 * String resultado = traducirTexto(texto);
	 * 
	 * System.out.println("El texto traducido es: " + resultado);
	 * 
	 * scanner.close(); }
	 * 
	 * private static String traducirTexto(String texto) { StringBuilder resultado =
	 * new StringBuilder();
	 * 
	 * // Array que representa la posición en el teclado numérico de las letras
	 * String[] tecladoNumerico = { "2", "22", "222", // ABC "3", "33", "333", //
	 * DEF "4", "44", "444", // GHI "5", "55", "555", // JKL "6", "66", "666", //
	 * MNO "7", "77", "777", "7777", // PQRS "8", "88", "888", // TUV "9", "99",
	 * "999", "9999", // WXYZ "0" };
	 * 
	 * for (char letra : texto.toCharArray()) { if (Character.isLetter(letra)) { int
	 * posicion = obtenerPosicionEnTeclado(letra);
	 * resultado.append(tecladoNumerico[posicion]); resultado.append(' '); } else {
	 * resultado.append(letra); } }
	 * 
	 * return resultado.toString(); }
	 * 
	 * private static int obtenerPosicionEnTeclado(char letra) { // ASCII de 'A' es
	 * 65, restamos 65 para obtener la posición en el array return
	 * Character.toUpperCase(letra) - 'A'; }
}
	 */

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una sucesión de números separados por espacio: ");
        String numeros = scanner.nextLine();

        String resultado = traducirNumeros(numeros);

        System.out.println("El texto traducido es: " + resultado);

        scanner.close();
    }

    private static String traducirNumeros(String numeros) {
        StringBuilder resultado = new StringBuilder();

        String[] tecladoNumerico = {
                " ",   // 0
                "",    // 1
                "ABC", // 2
                "DEF", // 3
                "GHI", // 4
                "JKL", // 5
                "MNO", // 6
                "PQRS",// 7
                "TUV", // 8
                "WXYZ" // 9
        };

        String[] numerosArray = numeros.split(" ");

        for (String numero : numerosArray) {
            try {
            	char[] aux = numero.toCharArray();
            	if (aux.length==1) {
            		int i = Character.getNumericValue(aux[0]);
            		resultado.append(tecladoNumerico[i].toCharArray()[0]);
				}else if(aux.length==2) {
					int i = Character.getNumericValue(aux[0]);
            		resultado.append(tecladoNumerico[i].toCharArray()[1]);
				}else if (aux.length==3) {
					int i = Character.getNumericValue(aux[0]);
            		resultado.append(tecladoNumerico[i].toCharArray()[2]);
				}

            } catch (NumberFormatException e) {
                // Si no es un número válido, agregar un espacio
                resultado.append(' ');
            }
        }

        return resultado.toString();
    }

}