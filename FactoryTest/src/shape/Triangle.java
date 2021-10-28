package shape;

public abstract class Triangle implements Shape{
	protected Point a,b,c;
	protected Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
