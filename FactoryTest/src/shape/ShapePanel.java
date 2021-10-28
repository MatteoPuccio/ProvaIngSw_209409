package shape;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ShapePanel extends JPanel{
	private ArrayList<Shape> shapes;
	private static final long serialVersionUID = 1L;
	public ShapePanel() {
		shapes = new ArrayList<Shape>();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Shape s:shapes) {
			s.draw(g);
		}
	}

	public void add(Shape s) {
		shapes.add(s);
	}
	
	
}
