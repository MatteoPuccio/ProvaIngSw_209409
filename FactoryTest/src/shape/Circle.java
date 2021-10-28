package shape;

public abstract class Circle implements Shape{
	protected Point center;
	protected int radius;
	protected Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
}
