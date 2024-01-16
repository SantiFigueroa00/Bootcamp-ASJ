
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int datos[] = new int[5];
		int[] datos2 = new int[8];
		
		byte arr[] = {1,2,3,4};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		*/
		int[][] matriz = new int[3][2];
		int[][] matriz2 = {{1,2},{3,4},{5,6}};
		
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j]);
			}
			System.out.println();
		}
	}

}
