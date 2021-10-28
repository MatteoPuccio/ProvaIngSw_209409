package shape;

public abstract class ShapeFactory {
	public abstract Triangle createTriangle(Point a, Point b, Point c);
	public abstract Rectangle createRectangle(Point a, Point d);
	public abstract Circle createCircle(Point center, int radius);
}
