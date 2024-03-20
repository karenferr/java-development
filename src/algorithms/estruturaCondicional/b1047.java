package algorithms.estruturaCondicional;

import java.util.Scanner;

public class b1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		sc.close();

		int instanteInicial = horaInicial * 60 + minutoInicial;
		int instanteFinal = horaFinal * 60 + minutoFinal;

		int duracao;
		if (instanteInicial < instanteFinal) {
			duracao = instanteFinal - instanteInicial;
		} else {
			duracao = (24 * 60 - instanteInicial) + instanteFinal;
		}
		int duracaoHoras = duracao / 60;
		int duracaoMinutos = duracao % 60;
		
System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
		
		sc.close();

	}

}
