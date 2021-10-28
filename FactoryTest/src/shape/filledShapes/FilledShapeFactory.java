package shape.filledShapes;

import shape.Circle;
import shape.Point;
import shape.Rectangle;
import shape.ShapeFactory;
import shape.Triangle;

public class FilledShapeFactory extends ShapeFactory{

	private static FilledShapeFactory instance = null;
	
	@Override
	public Triangle createTriangle(Point a, Point b, Point c) {
		return new FilledTriangle(a,b,c);
	}

	@Override
	public Rectangle createRectangle(Point a, Point d) {
		return new FilledRectangle(a,d);
	}

	@Override
	public Circle createCircle(Point center, int radius) {
		return new FilledCircle(center,radius);
	}

	private FilledShapeFactory() {}
	
	public static FilledShapeFactory getInstance() {
		if(instance == null) instance = new FilledShapeFactory();
		return instance;
	}

}
