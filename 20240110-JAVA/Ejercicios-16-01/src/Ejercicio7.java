import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> encuesta = generarEncuesta(10);
		
		mostrarEncuesta(encuesta);
		
		calcularPorcentajes(encuesta);
		calcularSueldoPromedio(encuesta, 1); 
		calcularSueldoPromedio(encuesta, 2); 
	}
	
	private static void mostrarEncuesta(ArrayList<ArrayList<Integer>> encuesta) {
	    System.out.println("Encuesta:");
	    System.out.printf("%-10s %-15s %-15s %-15s%n", "Persona", "Sexo", "Trabaja", "Sueldo");

	    for (int i = 0; i < encuesta.size(); i++) {
	        ArrayList<Integer> persona = encuesta.get(i);
	        int numeroPersona = i + 1;
	        int sexo = persona.get(0);
	        int trabaja = persona.get(1);
	        int sueldo = persona.get(2);

	        System.out.printf("%-10s %-15s %-15s %-15s%n", numeroPersona, (sexo == 1 ? "Hombre" : "Mujer"), (trabaja == 1 ? "Sí" : "No"), sueldo);
	    }
	}

	private static void calcularSueldoPromedio(ArrayList<ArrayList<Integer>> encuesta, int sexo) {
        int totalSueldo = 0;
        int personasTrabajan = 0;

        for (ArrayList<Integer> persona : encuesta) {
            int sexoPersona = persona.get(0);
            int trabaja = persona.get(1);
            int sueldo = persona.get(2);

            if (sexoPersona == sexo && trabaja == 1) {
                totalSueldo += sueldo;
                personasTrabajan++;
            }
        }

        double sueldoPromedio = personasTrabajan > 0 ? (double) totalSueldo / personasTrabajan : 0;

        System.out.println("Sueldo promedio de " + (sexo == 1 ? "hombres" : "mujeres") + " que trabajan: " + sueldoPromedio);
    }

	private static void calcularPorcentajes(ArrayList<ArrayList<Integer>> encuesta) {
		
		int totalPersonas = encuesta.size();
		int hombres=0,mujeres=0,hombresT=0,mujeresT=0;
		
		for (ArrayList<Integer> persona : encuesta) {
			int sexo = persona.get(0);
            int trabaja = persona.get(1);

            if (sexo == 1) {
                hombres++;
                if (trabaja == 1) {
                    hombresT++;
                }
            } else {
                mujeres++;
                if (trabaja == 1) {
                    mujeresT++;
                }
            }
		}
		
		double porcentajeHombres = ((double) hombres / totalPersonas) * 100;
        double porcentajeMujeres = ((double) mujeres / totalPersonas) * 100;
        double porcentajeHombresTrabajan = ((double) hombresT / hombres) * 100;
        double porcentajeMujeresTrabajan = ((double) mujeresT / mujeres) * 100;

        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajan + "%");
        System.out.println("Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan + "%");
	}

	private static ArrayList<ArrayList<Integer>> generarEncuesta(int n) {
		ArrayList<ArrayList<Integer>> encuesta = new ArrayList<>();
		
		Random random = new Random();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> persona = new ArrayList<>();
            persona.add(random.nextInt(2) + 1); 
            persona.add(random.nextInt(2) + 1); 
            int sueldo = persona.get(1) == 1 ? random.nextInt(1401) + 600 : 0; 
            persona.add(sueldo);

            encuesta.add(persona);
        }

        return encuesta;
	}
}
