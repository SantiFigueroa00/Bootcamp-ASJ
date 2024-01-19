import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListas {

	public static void main(String[] args) {
		ArrayList<String> miArrayList = new ArrayList<String>();
		
		
		miArrayList.add("rojo");
		miArrayList.add("azul");
		
		
		for (int i = 0; i < miArrayList.size(); i++) {
			System.out.println(miArrayList.get(i));
		}
		
		System.out.println("------------");
		
		miArrayList.add("negro");
		miArrayList.add("blanco");
		miArrayList.add(2,"amarillo");
		
		imprimir(miArrayList);
		
//		Eliminar un elemento
		
		miArrayList.remove(4);
		
		System.out.println("-----------");
		imprimir(miArrayList);
		
		System.out.println("-----------");
		System.out.println(miArrayList.indexOf("amarillo"));
		System.out.println(miArrayList.lastIndexOf("amarillo"));
		
		
		System.out.println("-----------");
		//miArrayList.clear();
		System.out.println(miArrayList.size());
		System.out.println(miArrayList.isEmpty());
		
		
		System.out.println("-----------");
		Iterator<String> miIterator = miArrayList.iterator();
		
		while (miIterator.hasNext()) {
			String elem = (String) miIterator.next();
			System.out.print(elem+" - ");
		}
	}
	
	
	public static void imprimir(ArrayList<String> lista) {
		for (String item : lista) {
			System.out.println(item);
		}
	}
}
