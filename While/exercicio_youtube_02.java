import java.util.Locale;
import java.util.Scanner;

/*Faça um programa para ler um número indeterminado
de dados, contendo cada um, a idade de um indivíduo.
O último dado, que não entrará nos cálculos, contém
um valor de idade negativa. Calcular e imprimir a
idade média deste grupo de indivíduos. Se for entrar
um valor negativo na primeira vez, mostrar a mensagem
"Impossível calcular".*/

public class exercicio_youtube_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, idade = sc.nextInt();
		
		double soma = 0, media = 0;
		
		while (idade >= 0) {
			
			cont += 1;
			soma += idade;
			media = soma/cont;
			idade = sc.nextInt();
		}
		
		if(idade < 0) {
			System.out.println("impossível calcular");
			System.exit(0);
			}
		System.out.printf("%.2f%n",media);
		
		sc.close();

	}

}
