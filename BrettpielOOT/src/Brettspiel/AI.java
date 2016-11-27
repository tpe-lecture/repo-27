package Brettspiel;

import java.util.Scanner;

public class AI extends Player {

	int difficulty;
	String position; // added by me joshua

	AI(String name, char symbol, int difficulty) {
		super(name, symbol);
		this.difficulty = difficulty;
	}

}
