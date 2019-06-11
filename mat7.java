
public class mat7 {
final static int MAX = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mat[][] = {
				{'a', 'a', 'a', 'a', 'a'},
				{'b', 'b', ' ', 'b', 'b'},
				{'c', ' ', 'c', ' ', 'c'},
				{'d', ' ', 'd', ' ', 'd'},
				{'e', ' ', 'e', ' ', 'e'}
		};
		//for(int i = 0; i < MAX; i++){
		//int inicio = buscarInicioSecuencia(mat, 0, i);
		//int fin = buscarFinSecuencia(mat, 0, i);
		//System.out.println("inicio fila " +i + ", " +inicio);
		//System.out.println("fin fila " +i + ", " +fin);
		//}
		//int tam = 1;
		//for(int i = 0; i < MAX; i++){
		//System.out.println(cantidadSecuencias(mat, i));
		//if(cantidadSecuencias(mat, i) == tam){
		//corrimientoFila(mat, i);
				
		//}
		//}


		
	}
	public static int buscarInicioSecuencia(char mat[][], int inicio, int fila){
		int cont = inicio;
		boolean encontrado = false;
		while(cont < MAX  && encontrado == false ){
			if(mat[fila][cont] != ' '){
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
	public static int buscarFinSecuencia(char mat[][], int inicio, int fila){
		boolean encontrado = false;
		int cont = inicio;
		while(cont < MAX && encontrado == false){
			if(mat[fila][cont] == ' '){
				encontrado = true;
			}else{
				cont++;
			}
		}
		return cont;
	}
	public static int cantidadSecuencias(char mat [][], int fila){
		int contador = 0;
		int inicioSecuencia = 0;
		int finSecuencia = 0;
		while(inicioSecuencia != -1){
			inicioSecuencia = buscarInicioSecuencia(mat, finSecuencia, fila);
			if(inicioSecuencia != -1){
				contador++;
				finSecuencia = buscarFinSecuencia(mat, inicioSecuencia, fila );
			}
		}
		return contador;
	}
	public static void corrimientoFila(char mat[][], int fila){
		for(int i = MAX-1; i> fila; i--){
			for(int j = 0; j < MAX; j++){
				mat[i][j] = mat [i-1][j];
				
			}
		}
			
	}
	public static void imprimirMatriz(char mat[][]){
		for(int i = 0; i<MAX;i++){
			System.out.println(" ");
			for(int j = 0; j < MAX;j++){
				System.out.print(mat[i][j] + "|");
			}
		}
	}
	
	}

