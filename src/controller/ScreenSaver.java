package controller;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ScreenSaver extends JPanel {

	/**
	 * Create the panel.
	 */
	public ScreenSaver() {
		setBounds(0, 0, 720, 576);
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ScreenSaver.class.getResource("/assets/ScreenSaver.png")));
		label.setBounds(0, 0, 720, 576);
		add(label);
	}

}
