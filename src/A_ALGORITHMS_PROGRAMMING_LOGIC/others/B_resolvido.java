package A_ALGORITHMS_PROGRAMMING_LOGIC.others;

import java.util.Scanner;

public class B_resolvido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();

		if (x < y && x < z) {
			System.out.println("MENOR = " + x);
		} else if (y < x && y < z) {
			System.out.println("MENOR = " + y);
		} else {
			System.out.println("MENOR = " + z);
		}
	}
}
