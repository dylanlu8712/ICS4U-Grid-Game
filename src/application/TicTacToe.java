package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class TicTacToe extends Game {
	Button[][] ticTacToeBoard = new Button[3][3];
	Label winner = new Label();

	public boolean checkForWin() {
		if (((ticTacToeBoard[0][0].getText() == ticTacToeBoard[0][1].getText()
				&& ticTacToeBoard[0][1].getText() == ticTacToeBoard[0][2].getText())
				&& ticTacToeBoard[0][0].getText() != "")
				|| ((ticTacToeBoard[0][0].getText() == ticTacToeBoard[1][0].getText()
						&& ticTacToeBoard[1][0].getText() == ticTacToeBoard[2][0].getText())
						&& ticTacToeBoard[0][0].getText() != "")
				|| ((ticTacToeBoard[0][0].getText() == ticTacToeBoard[1][1].getText()
						&& ticTacToeBoard[1][1].getText() == ticTacToeBoard[2][2].getText())
						&& ticTacToeBoard[0][0].getText() != "")
				|| ((ticTacToeBoard[1][0].getText() == ticTacToeBoard[1][1].getText()
						&& ticTacToeBoard[1][1].getText() == ticTacToeBoard[1][2].getText())
						&& ticTacToeBoard[1][0].getText() != "")
				|| ((ticTacToeBoard[2][0].getText() == ticTacToeBoard[2][1].getText()
						&& ticTacToeBoard[2][1].getText() == ticTacToeBoard[2][2].getText())
						&& ticTacToeBoard[2][0].getText() != "")
				|| ((ticTacToeBoard[0][1].getText() == ticTacToeBoard[1][1].getText()
						&& ticTacToeBoard[1][1].getText() == ticTacToeBoard[2][1].getText())
						&& ticTacToeBoard[0][1].getText() != "")
				|| ((ticTacToeBoard[0][2].getText() == ticTacToeBoard[1][2].getText()
						&& ticTacToeBoard[1][2].getText() == ticTacToeBoard[2][2].getText())
						&& ticTacToeBoard[0][2].getText() != "")
				|| ((ticTacToeBoard[0][2].getText() == ticTacToeBoard[1][1].getText()
						&& ticTacToeBoard[1][1].getText() == ticTacToeBoard[2][0].getText())
						&& ticTacToeBoard[0][2].getText() != "")) {
			return true;
		} else
			return false;
	}

	public int switchTurn() {
		turn++;
		return turn;
	}

	public StackPane setupBoard() {
		TicTacToe button1 = new TTTButton();
		TicTacToe button2 = new TTTButton();
		TicTacToe button3 = new TTTButton();
		TicTacToe button4 = new TTTButton();
		TicTacToe button5 = new TTTButton();
		TicTacToe button6 = new TTTButton();
		TicTacToe button7 = new TTTButton();
		TicTacToe button8 = new TTTButton();
		TicTacToe button9 = new TTTButton();
		StackPane newBoard = new StackPane();
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				ticTacToeBoard[i][k] = new Button();
				ticTacToeBoard[i][k].setMaxHeight(250);
				ticTacToeBoard[i][k].setMaxWidth(250);
				ticTacToeBoard[i][k].setTranslateX(-250 + i * 250);
				ticTacToeBoard[i][k].setTranslateY(-250 + k * 250);
				newBoard.getChildren().add(ticTacToeBoard[i][k]);
			}
		}

		ticTacToeBoard[0][0].setOnAction((event) -> {
			if (((TTTButton) button1).onCheck == true) {
				turn = switchTurn();
				((TTTButton) button1).onCheck = false;
				if ((((TTTButton) button1).chooseXO(((TTTButton) button1))) == true) {
					ticTacToeBoard[0][0].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				} else {
					ticTacToeBoard[0][0].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				}
			} else {
			}
		});

		ticTacToeBoard[0][1].setOnAction((event) -> {
			if (((TTTButton) button2).onCheck == true) {
				turn = switchTurn();
				((TTTButton) button2).onCheck = false;
				if ((((TTTButton) button2).chooseXO(((TTTButton) button1))) == true) {
					ticTacToeBoard[0][1].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				} else {
					ticTacToeBoard[0][1].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				}
			} else {
			}
		});

		ticTacToeBoard[0][2].setOnAction((event) -> {
			if (((TTTButton) button3).onCheck == true) {
				turn = switchTurn();
				((TTTButton) button3).onCheck = false;
				if ((((TTTButton) button3).chooseXO()) == true) {
					ticTacToeBoard[0][2].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				} else {
					ticTacToeBoard[0][2].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				}
			} else {
			}
		});

		ticTacToeBoard[1][0].setOnAction((event) -> {
			if (((TTTButton) button4).onCheck == true) {
				turn = switchTurn();
				((TTTButton) button4).onCheck = false;
				if ((((TTTButton) button4).chooseXO(((TTTButton) button1))) == true) {
					ticTacToeBoard[1][0].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				} else {
					ticTacToeBoard[1][0].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				}
			} else {
			}
		});

		ticTacToeBoard[1][1].setOnAction((event) -> {
			if (((TTTButton) button5).onCheck == true) {
				turn = switchTurn();
				((TTTButton) button5).onCheck = false;
				if ((((TTTButton) button5).chooseXO()) == true) {
					ticTacToeBoard[1][1].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				} else {
					ticTacToeBoard[1][1].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				}
			} else {
			}
		});

		ticTacToeBoard[1][2].setOnAction((event) -> {
			if (((TTTButton) button6).onCheck == true) {
				turn = switchTurn();
				((TTTButton) button6).onCheck = false;
				if ((((TTTButton) button6).chooseXO()) == true) {
					ticTacToeBoard[1][2].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				} else {
					ticTacToeBoard[1][2].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				}
			} else {
			}
		});

		ticTacToeBoard[2][0].setOnAction((event) -> {
			if (((TTTButton) button7).onCheck == true) {
				turn = switchTurn();
				((TTTButton) button7).onCheck = false;
				if ((((TTTButton) button7).chooseXO()) == true) {
					ticTacToeBoard[2][0].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				} else {
					ticTacToeBoard[2][0].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				}
			} else {
			}
		});

		ticTacToeBoard[2][1].setOnAction((event) -> {
			if (((TTTButton) button8).onCheck == true) {
				turn = switchTurn();
				((TTTButton) button8).onCheck = false;
				if ((((TTTButton) button8).chooseXO()) == true) {
					ticTacToeBoard[2][1].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				} else {
					ticTacToeBoard[2][1].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				}
			} else {
			}
		});

		ticTacToeBoard[2][2].setOnAction((event) -> {
			if (((TTTButton) button9).onCheck == true) {
				turn = switchTurn();
				((TTTButton) button9).onCheck = false;
				if ((((TTTButton) button9).chooseXO(((TTTButton) button1))) == true) {
					ticTacToeBoard[2][2].setText("X");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);
					} else {
					}
				} else {
					ticTacToeBoard[2][2].setText("O");
					if (checkForWin() == true) {
						newBoard.getChildren().removeAll(ticTacToeBoard[0][0], ticTacToeBoard[1][0],
								ticTacToeBoard[2][0], ticTacToeBoard[0][1], ticTacToeBoard[0][2], ticTacToeBoard[1][1],
								ticTacToeBoard[2][1], ticTacToeBoard[1][2], ticTacToeBoard[2][2]);

					} else {
					}
				}
			} else {
			}
		});

		return newBoard;
	}

	public void win() {
		// TODO Auto-generated method stub

	}

}
