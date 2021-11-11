import java.util.Scanner;

/*Tabuada
 01) Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:*/

public class exercicio_youtube_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i <= 10; i++) {
		 int mult = i * N;	
		 System.out.println(i + " x " + N + " = " + mult);
		}
		
		
		sc.close();
	}

}
