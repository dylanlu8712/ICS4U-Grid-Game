package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();

			Button Boat = new Button("Battleship");
			Boat.setMaxSize(200, 200);
			Boat.setTranslateX(400);
			Boat.setTranslateY(0);

			Button TTT = new Button("Tic Tac Toe");
			TTT.setMaxSize(200, 200);
			Boat.setTranslateX(-100);
			Boat.setTranslateY(0);

			Boat.setOnAction((event) -> {
				Battleship Game = new Battleship();
				Game.setupBoard();
				root.getChildren().removeAll(Boat, TTT);
				Scene BattleBoard = new Scene(Game.setupBoard(), 750, 750);
				primaryStage.setScene(BattleBoard);
				primaryStage.show();
			});

			TTT.setOnAction((event) -> {
				Battleship Game = new Battleship();
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

	public static void main(String[] args) {
		launch(args);
	}
}
