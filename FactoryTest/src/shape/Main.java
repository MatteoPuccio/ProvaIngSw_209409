package shape;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Object[] options = {"Linea", "Riempito"};
		int style = JOptionPane.showOptionDialog(MainWindow.getInstance(), "Scegli lo stile delle forme.", "Stile", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		ChooserWindow.getInstance().setStyle(style);
		ChooserWindow.getInstance().setVisible(true);
//		Triangle triangle = FilledShapeFactory.getInstance().createTriangle(new Point(50,20), new Point(150,20), new Point(100,200));
//		Rectangle rectangle = LineShapeFactory.getInstance().createRectangle(new Point(100,100), new Point(200,200));
//		Circle circle = FilledShapeFactory.getInstance().createCircle(new Point(100,100), 150);
//		MainWindow.getInstance().addShape(rectangle);
//		MainWindow.getInstance().addShape(triangle);
//		MainWindow.getInstance().addShape(circle);
	}

}
