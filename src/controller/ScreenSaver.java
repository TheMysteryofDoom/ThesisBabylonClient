package controller;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ScreenSaver extends JPanel {

	/**
	 * Create the panel.
	 */
	public ScreenSaver() {
		setBounds(0, 0, 960, 768);
		setLayout(null);
		
		JLabel background = new JLabel("");

		background.setIcon(new ImageIcon(ScreenSaver.class.getResource("/assets/Screen3.png")));
		background.setBounds(0, 0, 960, 768);
		add(background);
	}
	
	public static void cardChecker(String card){
		
	}

}
