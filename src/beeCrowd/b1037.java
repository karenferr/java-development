package A_ALGORITHMS_PROGRAMMING_LOGIC.estruturaCondicional;

import java.util.Scanner;

public class b1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();
		sc.close();

		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (valor <= 50 && valor > 25) {
			System.out.println("Intervalo (25,50]");
		} else if (valor <= 75 && valor > 50) {
			System.out.println("Intervalo (50,75]");
		}
		else if (valor <= 100 && valor > 75) {
			System.out.println("Intervalo (75,100]");
		}
		else 
		{
			System.out.println("Fora de intervalo");
		}

	}

}
