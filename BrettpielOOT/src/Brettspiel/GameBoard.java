package Brettspiel;

import java.util.Arrays;
import java.util.Scanner;
//import java.lang.Character.getNumericValue;

public class GameBoard {

	static int size;
	static char stone[][];
	public static int turn = 1;

	/**
	 * Konstruktor für das Spielfeld
	 *
	 * @param size
	 *            die Größe des zu erstellenden Spielfeldes
	 */

	GameBoard(int size) {
		this.size = size;
		stone = new char[size][size]; // Erstellen des steine Arrays
		for (int i = 0; i < size; i++) { // i also increased this size
			Arrays.fill(stone[i], '_'); // Das Array wird mit unterstrichen
										// gefüllt
		}
		stone[size - 1][0] = ' ';
		stone[size - 1][size - 1] = ' '; // Die unteren Eckfelder werden mit
											// Leerzeichen besetzt
		stone[size / 2 - 1][size / 2 - 1] = 'X';
		stone[size / 2][size / 2] = 'X';
		stone[size / 2][size / 2 - 1] = 'O';
		stone[size / 2 - 1][size / 2] = 'O'; // Die Startsteine werden gesetzt
		draw();
	}

	/**
	 * Methode zum zeichnen des Spielfeldes in der Konsole
	 */

	static void draw() {
		// System.out.print(" ");
		String space = "";

		System.out.println();
		System.out.print("     ");

		System.out.print(space); // i also deleted the unnecessary space inside
									// there
		for (int k = 0; k < size - 2; k++) { // "Deckel" des Spielfeldes
			System.out.print("_ ");
		}

		System.out.println("");

		for (int i = 0; i < size; i++) { // Schleife für jede Zeile
			System.out.print(i + 1 + " "); // Nummerierung
			if (size > 9 && i < 9) {
				System.out.print(" ");
			}
			if (0 < i && i < size - 1) {
				System.out.print("|");
			} else {
				System.out.print(" ");
			}
			for (int j = 0; j < size; j++) { // Schleife für jedes Element der
												// Zeile
				System.out.print(stone[i][j]);
				if (!(j == size - 1 && (i == 0 || i == size - 1))) { // i
																		// increased
																		// this
																		// number
					System.out.print("|");
				}
			}

			System.out.println();
		}

		if (size > 9) { // Anpassung falls Nummerierung 2-stellig wird
			space = " ";
		}
		System.out.print("   " + space); // i deleted the unnecessary space
											// inside there
		for (int c = 65; c < size + 65; c++) { // Koordinatenbelegung A-Z
			System.out.print((char) c + " ");
		}
	}

	public static int countTurns() {
		return turn++;
	}

	public static void setStones() { // method to set a stone into the field

		Scanner scan4 = new Scanner(System.in);
		String position = scan4.nextLine(); // to get the position where to set
											// the stone

		if (position.length() <= 1 || position.length() > 3) { //

			System.out.println(" Die eingegebene 0000000Position ist leider falsch! " + "bitte noch mal versuchen! ");
			setStones(); // enter a position again

		} else if (position.length() == 2) { //

			if (((position.charAt(0) >= 65 && position.charAt(0) <= 90) // upper-case
					|| position.charAt(0) >= 97 && position.charAt(0) <= 122) // lower-case
					&& (position.charAt(1) >= 49 && position.charAt(1) <= 57)) { // numbers

				String help = position.charAt(1) + ""; // to
				int check = Integer.parseInt(help); // refers to the integer
													// part of
													// the
													// entered position

				int help1 = 0; // refers to letter
				if (position.charAt(0) == 'A' || position.charAt(0) == 'a') { //

					help1 = 0;

				} else if (position.charAt(0) == 'B' || position.charAt(0) == 'b') {
					help1 = 1;

				} else if (position.charAt(0) == 'C' || position.charAt(0) == 'c') { //

					help1 = 2;

				} else if (position.charAt(0) == 'D' || position.charAt(0) == 'd') {
					help1 = 3;
				} else if (position.charAt(0) == 'E' || position.charAt(0) == 'e') { //

					help1 = 4;

				} else if (position.charAt(0) == 'F' || position.charAt(0) == 'f') {
					help1 = 5;

				} else if (position.charAt(0) == 'G' || position.charAt(0) == 'g') { //

					help1 = 6;

				} else if (position.charAt(0) == 'H' || position.charAt(0) == 'h') {
					help1 = 7;
				} else if (position.charAt(0) == 'I' || position.charAt(0) == 'i') {
					help1 = 8;

				} else if (position.charAt(0) == 'J' || position.charAt(0) == 'j') { //

					help1 = 9;

				} else if (position.charAt(0) == 'K' || position.charAt(0) == 'k') {
					help1 = 10;
				} else if (position.charAt(0) == 'L' || position.charAt(0) == 'l') { //

					help1 = 11;

				} else if (position.charAt(0) == 'M' || position.charAt(0) == 'm') {
					help1 = 12;

				} else if (position.charAt(0) == 'N' || position.charAt(0) == 'n') { //

					help1 = 13;

				} else if (position.charAt(0) == 'O' || position.charAt(0) == 'o') {
					help1 = 14;
				} else if (position.charAt(0) == 'P' || position.charAt(0) == 'p') {
					help1 = 15;

				} else if (position.charAt(0) == 'Q' || position.charAt(0) == 'q') { //

					help1 = 16;

				} else if (position.charAt(0) == 'R' || position.charAt(0) == 'r') {
					help1 = 17;
				} else if (position.charAt(0) == 'S' || position.charAt(0) == 's') { //

					help1 = 18;

				} else if (position.charAt(0) == 'T' || position.charAt(0) == 't') {
					help1 = 19;

				} else if (position.charAt(0) == 'U' || position.charAt(0) == 'u') { //

					help1 = 20;

				} else if (position.charAt(0) == 'V' || position.charAt(0) == 'v') {
					help1 = 21;
				} else if (position.charAt(0) == 'W' || position.charAt(0) == 'w') {
					help1 = 22;

				} else if (position.charAt(0) == 'X' || position.charAt(0) == 'x') { //

					help1 = 23;

				} else if (position.charAt(0) == 'Y' || position.charAt(0) == 'y') {
					help1 = 24;
				} else if (position.charAt(0) == 'Z' || position.charAt(0) == 'z') { //

					help1 = 25;
				}

				if (check > size) { // the size is larger
					System.out.println("Die eingegebene Position ist zu gross! noch mal versuchen!  ");
					setStones();
				} else {
					if ((help1 == 0 && check == 1) || (help1 == size - 1 && check == 1) || (help1 == 0 && check == size)
							|| help1 == size - 1 && check == size) { // don't
																		// set a
																		// stone
																		// at
																		// the
																		// borders
						System.out.println("Nicht in die Ecken hinsetzen! versuchen Sie noch mal");
						setStones();
					} else {

						if (stone[help1][check - 1] == 'X' || stone[help1][check - 1] == 'O') { // field
																								// occupied
							System.out.println("Feld besetzt! bitte ßßßwoanders hinsetzen "); // field
							// busy
							setStones();
						} else { // field occupied
							if (turn % 2 == 0) {
								stone[check - 1][help1] = 'X'; // you have to
																// inverse
																// the orders
								draw();
								countTurns(); //
							} else {
								stone[check - 1][help1] = 'O'; // you have to
																// inverse
																// the orders
								draw();
								countTurns();
							}
						}
					}
				}

			} else {

				System.out
						.println(" Die eingegebene ------Position ist leider falsch! " + "bitte noch mal versuchen! ");
				setStones(); // enter a position again
				// the entered position was correct
			}
		} else { // position.length()= 3

			if ((position.charAt(0) >= 65 && position.charAt(0) <= 90)
					|| (position.charAt(0) >= 97 && position.charAt(0) <= 122)
							&& (position.charAt(1) >= 49 && position.charAt(1) <= 57)
							&& (position.charAt(2) >= 48 && position.charAt(2) <= 57)) { // the
																							// second
																							// digit
																							// of
																							// the
																							// entered
																							// position
																							// can
																							// be
																							// zero

				String helper = position.charAt(1) + "";
				String help2 = position.charAt(2) + "";

				String help = helper + help2;

				int check = Integer.parseInt(help); //
				int help1 = 0; //
				if (position.charAt(0) == 'A' || position.charAt(0) == 'a') { //

					help1 = 0;

				} else if (position.charAt(0) == 'B' || position.charAt(0) == 'b') {
					help1 = 1;

				} else if (position.charAt(0) == 'C' || position.charAt(0) == 'c') { //

					help1 = 2;

				} else if (position.charAt(0) == 'D' || position.charAt(0) == 'd') {
					help1 = 3;
				} else if (position.charAt(0) == 'E' || position.charAt(0) == 'e') { //

					help1 = 4;

				} else if (position.charAt(0) == 'F' || position.charAt(0) == 'f') {
					help1 = 5;

				} else if (position.charAt(0) == 'G' || position.charAt(0) == 'g') { //

					help1 = 6;

				} else if (position.charAt(0) == 'H' || position.charAt(0) == 'h') {
					help1 = 7;
				} else if (position.charAt(0) == 'I' || position.charAt(0) == 'i') {
					help1 = 8;

				} else if (position.charAt(0) == 'J' || position.charAt(0) == 'j') { //

					help1 = 9;

				} else if (position.charAt(0) == 'K' || position.charAt(0) == 'k') {
					help1 = 10;
				} else if (position.charAt(0) == 'L' || position.charAt(0) == 'l') { //

					help1 = 11;

				} else if (position.charAt(0) == 'M' || position.charAt(0) == 'm') {
					help1 = 12;

				} else if (position.charAt(0) == 'N' || position.charAt(0) == 'n') { //

					help1 = 13;

				} else if (position.charAt(0) == 'O' || position.charAt(0) == 'o') {
					help1 = 14;
				} else if (position.charAt(0) == 'P' || position.charAt(0) == 'p') {
					help1 = 15;

				} else if (position.charAt(0) == 'Q' || position.charAt(0) == 'q') { //

					help1 = 16;

				} else if (position.charAt(0) == 'R' || position.charAt(0) == 'r') {
					help1 = 17;
				} else if (position.charAt(0) == 'S' || position.charAt(0) == 's') { //

					help1 = 18;

				} else if (position.charAt(0) == 'T' || position.charAt(0) == 't') {
					help1 = 19;

				} else if (position.charAt(0) == 'U' || position.charAt(0) == 'u') { //

					help1 = 20;

				} else if (position.charAt(0) == 'V' || position.charAt(0) == 'v') {
					help1 = 21;
				} else if (position.charAt(0) == 'W' || position.charAt(0) == 'w') {
					help1 = 22;

				} else if (position.charAt(0) == 'X' || position.charAt(0) == 'x') { //

					help1 = 23;

				} else if (position.charAt(0) == 'Y' || position.charAt(0) == 'y') {
					help1 = 24;
				} else if (position.charAt(0) == 'Z' || position.charAt(0) == 'z') { //

					help1 = 25;
				}

				if (check > size) { // the size is smaller
					System.out.println("Die eingegebene Position ist zu gross! noch mal versuchen!  ");
					setStones();
				} else {
					if ((help1 == 0 && check == 1) || (help1 == size - 1 && check == 1) || (help1 == 0 && check == size)
							|| help1 == size - 1 && check == size) { // don't
																		// set a
																		// stone
																		// at
																		// the
																		// borders
						System.out.println("Nicht in die Ecken hinsetzen! versuchen Sie noch mal");
						setStones();
					} else {

						if (stone[help1][check - 1] == 'X' || stone[help1][check - 1] == 'O') { // field
																								// occupied
							System.out.println("Feld besetzt! bitte ßßßwoanders hinsetzen "); // field
							// busy
							setStones();
						} else { // field occupied
							if (turn % 2 == 0) {
								stone[check - 1][help1] = 'X'; // you have to
																// inverse
																// the orders
								draw();
								countTurns(); //
							} else {
								stone[check - 1][help1] = 'O'; // you have to
																// inverse
																// the orders
								draw();
								countTurns();
							}
						}
					}
				}

			} else {
				System.out.println(" Die eingegebene ++++Position ist leider falsch! " + "bitte noch mal versuchen! ");
				setStones(); // enter a position again

			} // the entered position was correct
		}
	}
}
