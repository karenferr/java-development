package A_ALGORITHMS_PROGRAMMING_LOGIC.estruturaCondicional;

import java.util.Scanner;

public class b1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

	}

}
