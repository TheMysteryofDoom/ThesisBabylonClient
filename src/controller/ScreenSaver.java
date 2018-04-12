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
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(ScreenSaver.class.getResource("/assets/ScreenSaver.png")));
		background.setBounds(0, 0, 720, 576);
		add(background);
	}

}
