package shape.lineShapes;

import java.awt.Graphics;

import shape.Point;
import shape.Triangle;

public class LineTriangle extends Triangle {

	public LineTriangle(Point a, Point b, Point c) {
		super(a, b, c);
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(a.getX(), a.getY(), b.getX(), b.getY());
		g.drawLine(a.getX(), a.getY(), c.getX(), c.getY());
		g.drawLine(b.getX(), b.getY(), c.getX(), c.getY());

	}

	
}
