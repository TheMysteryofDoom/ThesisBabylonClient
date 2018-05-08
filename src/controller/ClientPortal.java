package controller;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class ClientPortal extends JPanel {

	/**
	 * Create the panel.
	 */
	public ClientPortal() {
		setBounds(0, 0, 720, 576);
		setLayout(null);
		
		JTextPane medicalDisplay = new JTextPane();
		medicalDisplay.setBounds(20, 118, 443, 416);
		add(medicalDisplay);
		
		JButton buttonPrint = new JButton("");
		buttonPrint.setBounds(531, 86, 148, 147);
		add(buttonPrint);
		
		JButton buttonEmail = new JButton("");
		buttonEmail.setBounds(531, 238, 148, 147);
		add(buttonEmail);
		
		JButton buttonOther = new JButton("");
		buttonOther.setBounds(531, 390, 148, 147);
		add(buttonOther);
		
		BtnFormat2(buttonEmail);
		BtnFormat(buttonPrint);
		BtnFormat3(buttonOther);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(ClientPortal.class.getResource("/assets/OnlyPic.png")));
		background.setBounds(0, 0, 720, 576);
		add(background);
	}
	
	public void BtnFormat(JButton button){
		//==========================================
		button.setBorder(null);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setOpaque(false);
		//==========================================
		
	}
	public void BtnFormat2(JButton button){
		//==========================================
		button.setBorder(null);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setOpaque(false);
		//==========================================
		
	}
	public void BtnFormat3(JButton button){
		//==========================================
		button.setBorder(null);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setOpaque(false);
		//==========================================
		
	}
}
