package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	private static BorderPane root = new BorderPane();

	public static BorderPane getRoot() {
		return root;
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			Maze maze = new Maze();
			Player player = new Player();
			Scene scene = new Scene(root, 448, 496);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			/*setting up the maze*/
			maze.setUp();
			/*setting up the position of the player*/
			player.setPlayer();
			/*controls to move the player*/
			scene.setOnKeyPressed(e -> {
				switch (e.getCode()) {
				case RIGHT:
					player.moveRight();
					break;
				case LEFT:
					player.moveLeft();
					break;
				case UP:
					player.moveUp();
					break;
				case DOWN:
					player.moveDown();
					break;	
				default:
					break;
				}
			});
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Packman");
			primaryStage.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
