package shape.filledShapes;

import java.awt.Graphics;

import shape.Circle;
import shape.Point;

public class FilledCircle extends Circle {

	protected FilledCircle(Point center, int radius) {
		super(center, radius);
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval(center.getX(), center.getY(), radius, radius);
	}

}
