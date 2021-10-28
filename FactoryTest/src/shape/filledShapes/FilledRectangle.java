package shape.filledShapes;

import java.awt.Graphics;

import shape.Point;
import shape.Rectangle;

public class FilledRectangle extends Rectangle {

	protected FilledRectangle(Point a, Point b) {
		super(a, b);
	}

	@Override
	public void draw(Graphics g) {
		g.fillRect(a.getX(), a.getY(), b.getX() - a.getX(), b.getY() - a.getY());
	}

}
