import java.util.Scanner;

/*Soma de Impares Consecutivos I
 02) Leia 2 valores inteiros X e Y.
 A seguir, calcule emostre a soma
 dos números ímpares entre eles */

public class exercicio_youtube_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min, max, soma = 0;
		
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		
		for (int i=min+1; i<max; i++) {
			
			if (i%2 != 0) {	
				soma = soma + i;
			}	
			
		}
		System.out.println(soma);
		
		sc.close();
	}

}
