package Brettspiel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Willkommen zu Reversi");
		setPlayers();
		System.out.println("Wähle die Spielfeldgröße: ");
		setBoard();

		System.out.println();
		System.out.print("Geben Sie Ihre Positionen ein! : ");
		while (gameOver()) {
			GameBoard.setStones();
		}
	}

	static void setPlayers() {
		System.out.println("Spieler 1 gib einen Namen ein: ");
		Scanner scan1 = new Scanner(System.in);
		Player player1 = new Player(scan1.next(), 'X');

		System.out.println("Spieler 2 gib einen Namen ein: ");
		Scanner scan2 = new Scanner(System.in);
		Player player2 = new Player(scan2.next(), 'O');
	}

	static void setBoard() {
		Scanner scan3 = new Scanner(System.in);
		int size = scan3.nextInt();
		if (size > 5 && size % 2 == 0 && size <27) {
			GameBoard board = new GameBoard(size);
		} else {
			System.out.println("Bitte nur gerade Zahlen größer 5 und kleiner 27 eingeben:");
			setBoard();
		}
	}

	static boolean gameOver() {

		int end = 1; // the game is still taking place
		if (end == 1) {
			return true;
		} else {
			return false;
		}
	}

}
