
public class mat5 {
final static int MAX = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat [][] = {
				{0, 1, 2 ,3 ,4},
				{5,6,7,8,9},
				{10,11,12,13,14},
				{15,16,17,18,19},
				{20,21,22,23,24},
	};
		int arr[] = { 15,20,25,22,0};
		buscarPosicion( mat, arr);
		imprimirMatriz(mat);

	}
	public static void imprimirMatriz(int mat[][]){
		for(int i = 0; i<MAX;i++){
			System.out.println(" ");
			for(int j = 0; j < MAX;j++){
				System.out.print(mat[i][j] + "|");
			}
		}
	}
	public static int buscarValorArreglo(int arr[]){
		int aux = 0;
		for(int a = 0; a < MAX; a++){
			aux+= arr[a];
	}
		return aux;
	}
	public static int buscarValorMatriz(int mat[][], int pos){
		int aux = 0;
			for(int j = 0; j< MAX;++j){
				aux += mat[pos][j];
			}
		return aux;
	}
	public static void buscarPosicion(int mat[][], int arr []){
		int valorArr = buscarValorArreglo(arr);
		System.out.println(valorArr);
		int sumArr = 0;
		int pos = -1;
		boolean encontraste = false;
		while(pos < MAX && !encontraste){
				pos++;
				sumArr = buscarValorMatriz(mat, pos);
				if (sumArr > valorArr)
					encontraste = true;
				
		}
		System.out.println(pos);
		if(encontraste){
			insertarFila(mat, arr, pos);
			
		}
	}
	public static void corrimientoFila(int mat[][], int arr[], int pos){
		for(int i = MAX-1; i> pos; i--){
			for(int j = MAX-1; j >= 0; j--){
				mat[i][j] = mat [i-1][j];
				
			}
		}
			
	}
	public static void insertarFila(int[][]mat, int arr[], int pos){
		corrimientoFila(mat, arr, pos);
		for (int j = 0; j < MAX; j++) {
			mat[pos][j] = arr[j];
		}
	}

}
