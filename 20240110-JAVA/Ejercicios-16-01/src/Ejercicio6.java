import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        boolean condition = false;
        boolean matrizLlena = false;
        Scanner scanner = new Scanner(System.in);
        int key, fila, columna, resultado = 0;
        int[][] matriz = new int[4][4];

        do {
            System.out.println("   #----------MENU----------#");
            System.out.println("\t 1- RELLENAR MATRIZ");
            System.out.println("\t 2- SUMAR FILA");
            System.out.println("\t 3- SUMAR COLUMNA");
            System.out.println("\t 4- SUMAR DIAGONAL PRINCIPAL");
            System.out.println("\t 5- SUMAR DIAGONAL INVERSA");
            System.out.println("\t 6- SALIR");
            System.out.println("   #------------------------#");
            System.out.print("\n ¿Que opcion desea elegir?: ");
            key = scanner.nextInt();
            scanner.nextLine();

            switch (key) {
                case 1:
                    clearConsole();
                    rellenarMatriz(matriz, scanner);
                    matrizLlena = true;
                    break;
                case 2:
                case 3:
                    clearConsole();
                    if (matrizLlena) {
                    	imprimirMatriz(matriz);
                        System.out.print("\n ¿Cual " + (key == 2 ? "fila" : "columna") + " desea sumar? 1, 2, 3 o 4: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();
                        resultado = key == 2 ? sumaFila(matriz, indice) : sumaColumna(matriz, indice);
                        System.out.println("El resultado de la operacion es: " + resultado);
                    } else {
                        System.out.println("Primero debes rellenar la matriz.");
                    }

                    System.out.println("Presiona Enter para continuar...");
                    scanner.nextLine();
                    break;
                case 4:
                    clearConsole();
                    if (matrizLlena) {
                    	imprimirMatriz(matriz);
                        resultado = sumaDiagonalPrincipal(matriz);
                        System.out.println("El resultado de la operacion es: " + resultado);
                    } else {
                        System.out.println("Primero debes rellenar la matriz.");
                    }

                    System.out.println("Presiona Enter para continuar...");
                    scanner.nextLine();
                    break;
                case 5:
                    clearConsole();
                    if (matrizLlena) {
                    	imprimirMatriz(matriz);
                        resultado = sumaDiagonalInversa(matriz);
                        System.out.println("El resultado de la operacion es: " + resultado);
                    } else {
                        System.out.println("Primero debes rellenar la matriz.");
                    }

                    System.out.println("Presiona Enter para continuar...");
                    scanner.nextLine();
                    break;
                case 6:
                    clearConsole();
                    System.out.println("Gracias por usar nuestra sistema. ¡Que tengas un buen día!");
                    condition = true;
                    break;
                default:
                    clearConsole();
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }

        } while (!condition);

        scanner.close();
    }
    
    private static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz actual:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int sumaFila(int[][] matriz, int fila) {
        int resultado = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            resultado += matriz[fila - 1][j];
        }
        return resultado;
    }

    private static int sumaColumna(int[][] matriz, int columna) {
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            resultado += matriz[i][columna - 1];
        }
        return resultado;
    }

    private static int sumaDiagonalPrincipal(int[][] matriz) {
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            resultado += matriz[i][i];
        }
        return resultado;
    }

    private static int sumaDiagonalInversa(int[][] matriz) {
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            resultado += matriz[i][matriz.length - 1 - i];
        }
        return resultado;
    }

    private static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    private static void rellenarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    System.out.print("Ingrese un numero entero para la fila " + (i + 1) + " columna " + (j + 1) + ": ");
                    matriz[i][j] = scanner.nextInt();
                    scanner.nextLine();
                } while (matriz[i][j] < 0);
            }

        }
        System.out.println("Cargado correcto. Presiona Enter para continuar...");
        scanner.nextLine();
    }
}
