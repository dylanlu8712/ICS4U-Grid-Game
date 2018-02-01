package application;

import java.util.Random;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Battleship implements Grid {
	int turn = 0;
	Button[][] grid = new Button[5][5];
	GridPane Battleboard = new GridPane();

	public Battleship() {
	}

	public GridPane setupBoard() {

		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < 5; a++) {
				grid[i][a] = new Button();
				grid[i][a].setMaxSize(150, 150);
				Battleboard.add(grid[i][a], i, a);
			}
		}
		Random random = new Random();
		int x = random.nextInt();

		setOnClickEvents();
		return Battleboard;
	}

	int k = 0;
	int j = 0;

	private void setOnClickEvents() {
		System.out.println("Onclicked");
		for (; k < 5; k++) {
			for (; j < 5; j++) {
				grid[k][j].setOnAction(value -> {
					System.out.println("Button clicked");
					removeButton(k, j);
				});
			}
		}
	}

	private void removeButton(int k, int j) {
		grid[k][j].setStyle("fx-background-color: #ff7c7c");
		grid[k][j].setOnAction(value -> {
		});
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
