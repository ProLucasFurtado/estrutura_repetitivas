import java.util.Scanner;

/* 02) Escreva um programa para ler as coordenadas (X,Y)
de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que
ele pertence. O algoritmo será encerrado quando pelo
menos uma de suas coordenadas for NULA (nesta situação sem
escrever mensagem alguma).*/

public class exercicio_proposto_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x != 0.0 && y != 0.0) {
			
			if (x > 0.0 && y > 0.0) {
				System.out.println("Primeiro Quadrante - Q1");
			}
			else if (x < 0.0 && y > 0.0) {
				System.out.println("Segundo Quadrante - Q2");
			}
			else if (x < 0.0 && y < 0.0) {
				System.out.println("Terceiro Quadrante - Q3");
			}
			else {
				System.out.println("Quarto Quadrante - Q4");
			}
			
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();
		
	}

}
