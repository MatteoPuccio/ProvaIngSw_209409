package shape;

public abstract class Rectangle implements Shape{
	protected Point a,b;
	protected Rectangle(Point a, Point b) {
		this.a = a;
		this.b = b;
	}
}
