package application;

public class TTTButton extends TicTacToe {
	boolean onCheck = true;

	public TTTButton() {
	}

	public boolean chooseXO(TTTButton a) {
		if (turn % 2 == 0) {
			return true;
		} else if (turn % 2 == 1) {
			return false;
		} else
			return (Boolean) null;
	}

	public boolean chooseXO() {
		if (turn % 2 == 0) {
			return true;
		} else if (turn % 2 == 1) {
			return false;
		} else
			return (Boolean) null;
	}

}
