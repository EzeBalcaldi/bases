import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 0;
		try{
			BufferedReader entrada1 = new BufferedReader(new InputStreamReader(System.in));
			while(n != -1){
				System.out.println("ingrese n");
				n = new Integer(entrada1.readLine());
				if(n %2 == 0){
					System.out.println("es par");
				}else{
					System.out.println("es impar");
					if((n > 7)&&(n %7 == 0)){
						System.out.println("es impar y mayor de 7");
					}
						
				}
				
			}

		}
		catch (Exception exc ) {
			System.out.println( exc );
	}		
	}

}
