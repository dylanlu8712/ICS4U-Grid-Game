package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	//Setup of the stage for JavaFx.
	@Override
	public void start(Stage primaryStage) {
		try {
			//Makes first gridpane.
			GridPane root = new GridPane();
			
			//Sets up boat and ttt buttons.
			Button Boat = new Button("Battleship");
			Boat.setMaxSize(200, 200);
			Boat.setTranslateX(400);
			Boat.setTranslateY(0);

			Button TTT = new Button("Tic Tac Toe");
			TTT.setMaxSize(200, 200);
			Boat.setTranslateX(100);
			Boat.setTranslateY(0);
			
			//Action events for boat and ttt. Also switches scenes into the new games.
			Boat.setOnAction((event) -> {
				Battleship Game = new Battleship();
				Game.setupBoard();
				root.getChildren().removeAll(Boat, TTT);
				Scene BattleBoard = new Scene(Game.setupBoard(), 750, 750);
				primaryStage.setScene(BattleBoard);
				primaryStage.show();
			});

			TTT.setOnAction((event) -> {
				TicTacToe Game = new TicTacToe();
				Game.setupBoard();
				root.getChildren().removeAll(Boat, TTT);
				Scene BattleBoard = new Scene(Game.setupBoard(), 750, 750);
				primaryStage.setScene(BattleBoard);
				primaryStage.show();
			});

			root.getChildren().addAll(Boat, TTT);

			Scene scene = new Scene(root, 400, 200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Launches the game.
	public static void main(String[] args) {
		launch(args);
	}
}
