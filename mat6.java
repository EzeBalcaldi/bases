public class mat6 {
final static int MAX = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat [][] = {
				{0, 1, 2 ,8 ,4, 1, 9, 0},
				{0, 1, 5,7, 0,9,  9, 0},
				{0,1,0,4,0, 5, 0, 5},
				{0,1, 0, 1, 0, 1, 0, 1},
				{0,2, 0, 5, 0, 2, 0, 4},
				{0,2, 0, 5, 0, 2, 0, 4},
				{0,2, 0, 5, 0, 2, 0, 4},
				{0,2, 0, 5, 0, 2, 0, 4},

	};
		int arr[] = {0,99, 2, 3, 0, 5, 6,0};
		System.out.println(cantidadSecuenciasMatriz(mat, arr));
		//System.out.println(cantidadSecuencias(arr));
}
	public static void imprimirMatriz(int mat[][]){
		for(int i = 0; i<MAX;i++){
			System.out.println(" ");
			for(int j = 0; j < MAX;j++){
				System.out.print(mat[i][j] + "|");
			}
		}
	}
	public static int buscarInicioSecuencia(int arr[], int inicio){
		int cont = inicio;
		boolean encontrado = false;
		while(cont < MAX  && encontrado == false ){
			if(arr[cont] != 0){
				encontrado = true;
			}else{
				cont++;
			}
	}
		if(encontrado == true){
			return cont;
		}
		return -1;

}
	public static int buscarFinSecuencia(int arr[], int inicio){
		boolean encontrado = false;
		int cont = inicio;
		while(cont < MAX && encontrado == false){
			if(arr[cont] == 0){
				encontrado = true;
			}else{
				cont++;
			}
		}
		return cont;
	}
	public static int cantidadSecuencias(int []arr){
		int contador = 0;
		int inicioSecuencia = 0;
		int finSecuencia = 0;
		while(inicioSecuencia != -1){
			inicioSecuencia = buscarInicioSecuencia(arr, finSecuencia);
			if(inicioSecuencia != -1){
				contador++;
				finSecuencia = buscarFinSecuencia(arr, inicioSecuencia);
			}
		}
		return contador;
	}
	public static int buscarInicioSecuenciaMatriz(int mat[][], int inicio, int fila){
		int cont = inicio;
		boolean encontrado = false;
		while(cont < MAX  && encontrado == false ){
			if(mat[fila][cont] != 0){
				encontrado = true;
			}else{
				cont++;
			}
	}
		if(encontrado == true){
			return cont;
		}
		return -1;

}
	public static int buscarFinSecuenciaMatriz(int mat[][], int inicio, int fila){
		boolean encontrado = false;
		int cont = inicio;
		while(cont < MAX && encontrado == false){
			if(mat[fila][cont] == 0){
				encontrado = true;
			}else{
				cont++;
			}
		}
		return cont;
	}
	public static int cantidadSecuenciasMatriz(int [][]mat, int[]arr){
		int contador = 0;
		int fila = 2;
		int inicioSecuencia = 0;
		int finSecuencia = 0;
		int cantidadSecArreglo = cantidadSecuencias(arr);
		boolean encontrado = false;
		System.out.println(cantidadSecArreglo);
		while(inicioSecuencia != -1 && fila < MAX && encontrado == false){
			inicioSecuencia = buscarInicioSecuenciaMatriz(mat, finSecuencia, fila);
			if(inicioSecuencia != -1){
				contador++;
				finSecuencia = buscarFinSecuenciaMatriz(mat, inicioSecuencia, fila);
			}
			System.out.println(contador);
			if(cantidadSecArreglo < contador){
				encontrado = true;
				corrimientoFila(mat, fila, inicioSecuencia);
				imprimirMatriz(mat);
				insertarArreglo(arr, mat, fila);
				System.out.println();
				imprimirMatriz(mat);
			}
			}
		return contador;
	}
	public static void corrimientoFila(int mat[][], int fila, int pos){
		for(int i = MAX-1; i> fila; i--){
			for(int j = 0; j < MAX; j++){
				mat[i][j] = mat [i-1][j];
				
			}
		}
			
	}
	public static void insertarArreglo(int arr[], int mat[][], int fila){
		for(int i = 0; i < MAX; i++){
			mat[fila][i] = arr[i];
		}
	}
}
