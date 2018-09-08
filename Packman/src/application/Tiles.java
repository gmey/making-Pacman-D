package application;

import java.awt.Point;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Tiles {
	boolean wall = false;
	boolean point = false;
	boolean bigPoint = false;
	boolean space = false;
	Circle shape = new Circle();//restore the shape of each point
	Point pos;//holds the position of each point

	public Tiles(int x, int y) {
		pos = new Point(x, y);
	}

	void show() {
		/*drawing small point*/
		if (point) {
			if (!space) {
				shape.setCenterX(pos.x);
				shape.setCenterY(pos.y);
				shape.setRadius(3);
				shape.setFill(Color.YELLOW);
				Main.getRoot().getChildren().add(shape);
			}
			/* drawing big point*/
		} else if (bigPoint) {
			if (!space) {
				shape.setCenterX(pos.x);
				shape.setCenterY(pos.y);
				shape.setRadius(5);
				shape.setFill(Color.YELLOW);
				Main.getRoot().getChildren().add(shape);
			}
		}
	}

}
