package shape;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import shape.filledShapes.FilledShapeFactory;
import shape.lineShapes.LineShapeFactory;

public class ChooserWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private static int style;
	private static ChooserWindow instance = null;
	private JPanel activePanel;
	private ChooserWindow() {
		super("Choose the Shapes!");
		setSize(400, 400);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
		JPanel bttnPanel = new JPanel();
		activePanel = new JPanel();
		JButton triangleBttn = new JButton("Triangolo");
		JButton rectBttn = new JButton("Rettangolo");
		JButton circleBttn = new JButton("Cerchio");
		triangleBttn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Shape s;
				switch (style) {
				case 0:
					s = LineShapeFactory.getInstance().createTriangle(new Point(100, 100), new Point(100, 200),
							new Point(200, 200));
					break;
				case 1:
					s = FilledShapeFactory.getInstance().createTriangle(new Point(100, 100), new Point(100, 200),
							new Point(200, 200));
					break;
				default:
					s = LineShapeFactory.getInstance().createTriangle(new Point(100, 100), new Point(100, 200),
							new Point(200, 200));
				}
//				MainWindow.getInstance().addShape(s);
//				setVisible(false);
				remove(activePanel);
				activePanel = new CreateTrianglePanel();
				add(activePanel);
			}
		});
		rectBttn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Shape s;
				switch (style) {
				case 0:
					s = LineShapeFactory.getInstance().createRectangle(new Point(100, 100), new Point(200, 200));
					break;
				case 1:
					s = FilledShapeFactory.getInstance().createRectangle(new Point(100, 100), new Point(200, 200));
					break;
				default:
					s = LineShapeFactory.getInstance().createRectangle(new Point(100,100), new Point(200,200));
				}
				MainWindow.getInstance().addShape(s);
				setVisible(false);
			}
		});
		circleBttn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Shape s;
				switch (style) {
				case 0:
					s = LineShapeFactory.getInstance().createCircle(new Point(100, 100), 100);
					break;
				case 1:
					s = FilledShapeFactory.getInstance().createCircle(new Point(100, 100), 100);
					break;
				default:
					s =  LineShapeFactory.getInstance().createCircle(new Point(100, 100), 100);
				}
				MainWindow.getInstance().addShape(s);
				setVisible(false);
			}
		});
		bttnPanel.add(circleBttn);
		bttnPanel.add(rectBttn);
		bttnPanel.add(triangleBttn);
		add(bttnPanel);
		add(activePanel);
	}

	public static ChooserWindow getInstance() {
		if (instance == null)
			instance = new ChooserWindow();
		return instance;
	}

	public void setStyle(int n) {
		style = n;
	}
}
