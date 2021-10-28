package shape;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class CreateTrianglePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public CreateTrianglePanel() {
		JLabel firstPntLabel = new JLabel("Inserisci il primo punto del triangolo");
		JLabel secondPntLable = new JLabel("Inserisci il secondo punto del triangolo");
		JLabel thirdPntLabel = new JLabel("Inserisci il terzo punto del triangolo");
		JSpinner firstXSpinner = new JSpinner();
		JSpinner firstYSpinner = new JSpinner();
		JSpinner secondXSpinner = new JSpinner();
		JSpinner secondYSpinner = new JSpinner();
		JSpinner thirdXSpinner = new JSpinner();
		JSpinner thirdYSPinner = new JSpinner();
		JPanel firstPanel = new JPanel();
		JPanel secondPanel = new JPanel();
		JPanel thirdPanel = new JPanel();
		firstPanel.add(firstPntLabel);
		firstPanel.add(firstXSpinner);
		firstPanel.add(firstYSpinner);
		secondPanel.add(secondPntLable);
		secondPanel.add(secondXSpinner);
		secondPanel.add(secondYSpinner);
		thirdPanel.add(thirdPntLabel);
		thirdPanel.add(thirdXSpinner);
		thirdPanel.add(thirdYSPinner);
		add(firstPanel);
		add(secondPanel);
		add(thirdPanel);
	}
}
