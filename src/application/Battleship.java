package application;

import java.util.Random;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Battleship extends Game {
	int turn = 0;
	Button[][] grid = new Button[5][5];
	GridPane Battleboard = new GridPane();

	public Battleship() {
	}

	public GridPane setupBoard() {

		for (int i = 0; i < 5; i++) {
			for (int a = 0; a < 5; a++) {
				grid[i][a] = new Button();
				grid[i][a].setMinSize(150, 150);
				Battleboard.add(grid[i][a], i, a);
				setOnClickEvents(grid[i][a]);
			}
		}
		Random random = new Random();
		int xBoat = random.nextInt(5);
		int yBoat = random.nextInt(5);
		System.out.println(xBoat + " " + yBoat);
		grid[xBoat][yBoat].setOnAction(value -> {
			System.out.println("Winner!");
			grid[xBoat][yBoat].setText("Winner");
		});

		return Battleboard;
	}

	private void setOnClickEvents(Button btn) {
		System.out.println("Onclicked");
		btn.setOnAction(value -> {
			System.out.println("Button clicked");
			removeButton(btn);
		});

	}

	private void removeButton(Button btn) {
		btn.setText("X");
		btn.setOnAction(value -> {
		});
	}

	@Override
	public int switchTurn() {
		// TODO Auto-generated method stub
		return 0;
	}

}
