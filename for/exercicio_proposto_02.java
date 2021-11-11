import java.util.Scanner;

/* 02) Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos
em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora
do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo,
e "out" para fora do intervalo).*/

public class exercicio_proposto_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contOUT =0, contIN = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				contIN +=1;
			} else {
				contOUT +=1;
			}
		}
		System.out.println(contIN + " in ");
		System.out.println(contOUT + " out ");
		
		sc.close();
	}

}
