import java.util.Scanner;

/*Problema exemplo
Fazer um programa que lê números inteiros até que
um zero seja lido. Ao final mostra a soma dos números lidos.*/
public class exemplo_estrutura_repeticao_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int soma = 0;
		
		while(numero != 0) {
			soma += numero;
			numero = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
