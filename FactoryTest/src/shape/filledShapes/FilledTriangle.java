package shape.filledShapes;

import java.awt.Graphics;

import shape.Point;
import shape.Triangle;

public class FilledTriangle extends Triangle {

public FilledTriangle(Point a, Point b, Point c) {
		super(a, b, c);
		
	}

	@Override
	public void draw(Graphics g) {
		int xPoints[] = {a.getX(),b.getX(),c.getX()};
		int yPoints[] = {a.getY(),b.getY(),c.getY()};
		g.fillPolygon(xPoints,yPoints,3);
	}

}
