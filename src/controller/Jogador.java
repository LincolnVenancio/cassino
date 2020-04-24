package controller;

import java.util.Random;

public class Jogador extends Thread {
	private static int Vitorias;
	private int dado1, dado2, Thread;
	Random aleatorio = new Random();

	public Jogador(int numThread) {
		start();
		this.Thread = numThread;
	}

	public void run() {
		confereDados();
	}

	public void confereDados() {
		int pontos = 0;
		do {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.err.println("A Thread foi interrompida!");
			}
			dado1 = aleatorio.nextInt(6) + 1;
			dado2 = aleatorio.nextInt(6) + 1;
			if (dado1 + dado2 == 7 || dado1 + dado2 == 11) {
				pontos++;
			}
		} while (pontos != 5);
		Vitorias++;
		if (Vitorias < 6) {
			switch (Vitorias) {
			case 1:
				System.out.println("Jogador " + Thread + " ficou em primeiro lugar!");
				break;
			case 2:
				System.out.println("Jogador " + Thread + " ficou em segundo lugar!");
				break;
			case 3:
				System.out.println("Jogador " + Thread + " ficou em terceiro lugar!");
				break;
			case 4:
				System.out.println("Jogador " + Thread + " ficou em quarto lugar!");
				break;
			case 5:
				System.out.println("Jogador " + Thread + " ficou em quinto lugar!");
				break;
			}

		}

	}
}
