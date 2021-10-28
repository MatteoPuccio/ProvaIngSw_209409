package shape.lineShapes;

import java.awt.Graphics;

import shape.Circle;
import shape.Point;

public class LineCircle extends Circle {

	public LineCircle(Point center, int radius) {
		super(center, radius);
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX(), center.getY(), radius, radius);
	}

}
