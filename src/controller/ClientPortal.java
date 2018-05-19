package controller;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClientPortal extends JPanel {

	/**
	 * Create the panel.
	 */
	public ClientPortal() {
		setBounds(0, 0, 960, 768);
		setLayout(null);
		
		JTextPane medicalDisplay = new JTextPane();
		medicalDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		medicalDisplay.setText("Name: Dela Cruz, Juan Zero\r\n\r\nDate of Birth: 12/12/1997\r\nNationality: Filipino\r\nBlood: O\r\nHeight: 170\r\nWeight: 60.3 KG\r\n\r\nYour Medical Data is ready to be transferred.\r\nOriginal Hospital: RIZAL MEDICAL CENTER, Pasig City ");
		medicalDisplay.setBounds(39, 185, 544, 525);
		add(medicalDisplay);
		
		JButton buttonPrint = new JButton("");
		buttonPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					MainDisplay.printArea();
			}
		});
		buttonPrint.setBounds(711, 141, 194, 194);
		add(buttonPrint);
		
		JButton buttonEmail = new JButton("");
		buttonEmail.setBounds(711, 342, 194, 192);
		add(buttonEmail);
		
		JButton buttonOther = new JButton("");
		buttonOther.setBounds(711, 540, 194, 198);
		add(buttonOther);
		
		BtnFormat2(buttonEmail);
		BtnFormat(buttonPrint);
		BtnFormat3(buttonOther);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(ClientPortal.class.getResource("/assets/Screen1.png")));
		background.setBounds(0, 0, 960, 768);
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
