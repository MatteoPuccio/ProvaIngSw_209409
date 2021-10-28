package shape.lineShapes;

import java.awt.Color;
import java.awt.Graphics;

import shape.Point;
import shape.Rectangle;

public class LineRectangle extends Rectangle {

	public LineRectangle(Point a, Point b) {
		super(a, b);
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(a.getX(), a.getY(), b.getX() - a.getX(), b.getY() - a.getY());
	}

}
