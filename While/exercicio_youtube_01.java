import java.util.Scanner;

/*Crescente e Decrescente URI 1113
Leia uma quantidade indeterminada de duplas de valores
inteiros X e Y. Escreva para cada X e Y uma mensagem
que indique se estes valores foram digitados em ordem
crescente ou decrescente.*/

public class exercicio_youtube_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != y) {

			if (x > y) {

				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}

			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();

	}

}
