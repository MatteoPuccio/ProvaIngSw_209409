package shape.lineShapes;

import shape.Circle;
import shape.Point;
import shape.Rectangle;
import shape.ShapeFactory;
import shape.Triangle;

public class LineShapeFactory extends ShapeFactory{

	private static LineShapeFactory instance;
	
	@Override
	public Triangle createTriangle(Point a, Point b, Point c) {
		return new LineTriangle(a, b, c);
	}

	@Override
	public Rectangle createRectangle(Point a, Point b) {
		return new LineRectangle(a, b);
	}

	@Override
	public Circle createCircle(Point center, int length) {
		return new LineCircle(center, length);
	}

	private LineShapeFactory() {}
	
	public static LineShapeFactory getInstance() {
		if(instance == null) instance = new LineShapeFactory();
		return instance;
	}
}
