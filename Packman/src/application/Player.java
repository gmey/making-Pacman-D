package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Player {
	int flagR = 14;
	int flagC = 1;
	Circle player = new Circle(1 * 16 + 8, 14 * 16 + 8, 10);

	public void setPlayer() {
		player.setFill(Color.YELLOW);
		Main.getRoot().getChildren().add(player);
	}

	public void moveRight() {
		if (flagC == 27) {
			player.setTranslateX(player.getTranslateX() - 27 * 16);
			flagC = 0;
			Maze.tileRep[flagR][flagC].space = true;
			Maze.tileRep[flagR][flagC].shape.setVisible(false);
		} else {
			if (!Maze.tileRep[flagR][flagC + 1].wall) {
				player.setTranslateX(player.getTranslateX() + 16);
				flagC++;
				Maze.tileRep[flagR][flagC].space = true;
				Maze.tileRep[flagR][flagC].shape.setVisible(false);
			}
		}
	}

	public void moveUp() {
		if (!Maze.tileRep[flagR - 1][flagC].wall) {
			player.setTranslateY(player.getTranslateY() - 16);
			flagR--;
			Maze.tileRep[flagR][flagC].space = true;
			Maze.tileRep[flagR][flagC].shape.setVisible(false);
		}
	}

	public void moveLeft() {
		if (flagC == 0) {
			player.setTranslateX(player.getTranslateX() + 27 * 16);
			flagC = 27;
			Maze.tileRep[flagR][flagC].space = true;
			Maze.tileRep[flagR][flagC].shape.setVisible(false);
		} else {
			if (!Maze.tileRep[flagR][flagC - 1].wall) {
				player.setTranslateX(player.getTranslateX() - 16);
				flagC--;
				Maze.tileRep[flagR][flagC].space = true;
				Maze.tileRep[flagR][flagC].shape.setVisible(false);
			}
		}
	}

	public void moveDown() {
		if (!Maze.tileRep[flagR + 1][flagC].wall) {
			player.setTranslateY(player.getTranslateY() + 16);
			flagR++;
			Maze.tileRep[flagR][flagC].space = true;
			Maze.tileRep[flagR][flagC].shape.setVisible(false);
		}

	}

}
