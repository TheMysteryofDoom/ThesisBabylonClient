package controller;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ClientPortal extends JPanel {

	/**
	 * Create the panel.
	 */
	public ClientPortal() {
		setBounds(0, 0, 720, 576);
		setLayout(null);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(ClientPortal.class.getResource("/assets/OnlyPic.png")));
		background.setBounds(0, 0, 720, 576);
		add(background);
	}
}
