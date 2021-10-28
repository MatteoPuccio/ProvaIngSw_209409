package shape;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MainWindow extends JFrame{
	private static final long serialVersionUID = 1L;
	private static MainWindow instance = null;
	private ShapePanel shapePanel;
	private MainWindow() {
		super("Shape Factory");
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shapePanel = new ShapePanel();
		add(shapePanel);
	}
	
	public static MainWindow getInstance() {
		if(instance == null)
			instance = new MainWindow();
		return instance;
	}
	
	public void addShape(Shape s) {
		setVisible(true);
		shapePanel.add(s);
		shapePanel.repaint();
	}
}
