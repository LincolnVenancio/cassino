package view;

import controller.Jogador;

public class principal {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Jogador(i);
		}

	}
}
