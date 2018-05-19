package controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Printing extends JPanel {

	/**
	 * Create the panel.
	 */
	public Printing() {
		setBounds(0, 0, 960, 768);
		setLayout(null);
		
		JLabel background = new JLabel("");

		background.setIcon(new ImageIcon(ScreenSaver.class.getResource("/assets/Screen4.png")));
		background.setBounds(0, 0, 960, 768);
		add(background);
	}

}
