package application;

import javafx.scene.control.Label;

public abstract class Game {
	static int turn = 0;
	static Label goodGame = new Label("Good Game"); // used by all classes

	public abstract int switchTurn();
}
