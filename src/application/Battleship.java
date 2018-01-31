package application;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Battleship implements Grid {
	int turn = 0;
	Button[][] grid = new Button[5][5];

	public Battleship() {
	}

	public GridPane setupBoard() {

		GridPane BattleBoard = new GridPane();
		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < 5; a++) {
				grid[i][a] = new Button();
				grid[i][a].setMaxSize(150, 150);
				grid[i][a].setTranslateX(-300 + i * 150);
				grid[i][a].setTranslateY(-300 + a * 150);
				BattleBoard.getChildren().add(grid[i][a]);
			}
		}

		return BattleBoard;
	}

	@Override
	public boolean checkForWin() {

		if (true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean switchTurns() {
		turn++;
		if (turn % 2 == 1) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public void win() {
		// TODO Auto-generated method stub

	}

}
