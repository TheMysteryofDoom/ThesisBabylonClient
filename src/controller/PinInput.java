package controller;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import controller.MainDisplay;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PinInput extends JPanel {
	private JPasswordField pinField;
	private String pinInput = "";

	/**
	 * Create the panel.
	 */
	public PinInput() {
		
		setBounds(0, 0, 960, 768);
		setLayout(null);
		
		pinField = new JPasswordField();
		pinField.setFont(new Font("Tahoma", Font.PLAIN, 80));
		pinField.setBounds(75, 319, 344, 127);
		add(pinField);
		
		JButton btnNum3 = new JButton("");
		btnNum3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//lblresponseDummy.setText("Response Detected");
				pinInput = pinInput+"3";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		
		JButton btnNum1 = new JButton("");
		btnNum1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//lblresponseDummy.setText("Response Detected");
				pinInput = pinInput+"1";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		
		JButton btnBackspace = new JButton("");
		btnBackspace.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(pinInput.length()!=0){
					pinInput = pinInput.substring(0, (pinInput.length()-1));
					pinField.setText(pinInput);
					MainDisplay.PinWriter(pinInput);
				}
			}
		});
		btnBackspace.setOpaque(false);
		btnBackspace.setContentAreaFilled(false);
		btnBackspace.setBorderPainted(false);
		btnBackspace.setBorder(null);
		btnBackspace.setBounds(810, 586, 134, 136);
		add(btnBackspace);
		btnNum1.setOpaque(false);
		btnNum1.setContentAreaFilled(false);
		btnNum1.setBorderPainted(false);
		btnNum1.setBorder(null);
		btnNum1.setBounds(538, 182, 134, 136);
		add(btnNum1);
		
		JButton btnNum2 = new JButton("");
		btnNum2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//lblresponseDummy.setText("Response Detected");
				pinInput = pinInput+"2";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		btnNum2.setOpaque(false);
		btnNum2.setContentAreaFilled(false);
		btnNum2.setBorderPainted(false);
		btnNum2.setBorder(null);
		btnNum2.setBounds(673, 182, 134, 136);
		add(btnNum2);
		btnNum3.setBounds(810, 182, 134, 136);
		BtnFormat(btnNum3);
		add(btnNum3);
		
		final JButton btnNum4 = new JButton("");
		btnNum4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pinInput = pinInput+"4";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		btnNum4.setOpaque(false);
		btnNum4.setContentAreaFilled(false);
		btnNum4.setBorderPainted(false);
		btnNum4.setBorder(null);
		btnNum4.setBounds(538, 319, 134, 136);
		add(btnNum4);
		
		JButton btnNum5 = new JButton("");
		btnNum5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pinInput = pinInput+"5";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		btnNum5.setOpaque(false);
		btnNum5.setContentAreaFilled(false);
		btnNum5.setBorderPainted(false);
		btnNum5.setBorder(null);
		btnNum5.setBounds(673, 319, 134, 136);
		add(btnNum5);
		
		JButton btnNum7 = new JButton("");
		btnNum7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pinInput = pinInput+"7";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		
		JButton btnNum6 = new JButton("");
		btnNum6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pinInput = pinInput+"6";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		btnNum6.setOpaque(false);
		btnNum6.setContentAreaFilled(false);
		btnNum6.setBorderPainted(false);
		btnNum6.setBorder(null);
		btnNum6.setBounds(810, 319, 134, 136);
		add(btnNum6);
		btnNum7.setOpaque(false);
		btnNum7.setContentAreaFilled(false);
		btnNum7.setBorderPainted(false);
		btnNum7.setBorder(null);
		btnNum7.setBounds(538, 452, 134, 136);
		add(btnNum7);
		
		JButton btnNum8 = new JButton("");
		btnNum8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pinInput = pinInput+"8";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		btnNum8.setOpaque(false);
		btnNum8.setContentAreaFilled(false);
		btnNum8.setBorderPainted(false);
		btnNum8.setBorder(null);
		btnNum8.setBounds(673, 452, 134, 136);
		add(btnNum8);
		
		JButton btnNum0 = new JButton("");
		btnNum0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pinInput = pinInput+"0";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		
		JButton btnNum9 = new JButton("");
		btnNum9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				pinInput = pinInput+"9";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
				PinCheck(pinInput);
			}
		});
		btnNum9.setOpaque(false);
		btnNum9.setContentAreaFilled(false);
		btnNum9.setBorderPainted(false);
		btnNum9.setBorder(null);
		btnNum9.setBounds(810, 452, 134, 136);
		add(btnNum9);
		btnNum0.setOpaque(false);
		btnNum0.setContentAreaFilled(false);
		btnNum0.setBorderPainted(false);
		btnNum0.setBorder(null);
		btnNum0.setBounds(673, 586, 134, 136);
		add(btnNum0);
		
		JButton btnClear = new JButton("");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pinInput = "";
				pinField.setText(pinInput);
				MainDisplay.PinWriter(pinInput);
			}
		});
		btnClear.setOpaque(false);
		btnClear.setContentAreaFilled(false);
		btnClear.setBorderPainted(false);
		btnClear.setBorder(null);
		btnClear.setBounds(538, 586, 134, 136);
		add(btnClear);
		
		JLabel Background = new JLabel("");
		
		Background.setIcon(new ImageIcon(PinInput.class.getResource("/assets/Screen2.png")));
		Background.setBounds(0, 0, 960, 768);
		add(Background);

	}
	
	public void BtnFormat(JButton button){
		//==========================================
		button.setBorder(null);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setOpaque(false);
		//==========================================
		
	}
	
	public static void PinCheck(String Pin){
		if (Pin.length()==4){
		//You can convert the PIN into INT or something before running it through database check
		//Place Database Checking for Pin here. When successful, run the below line.
			MainDisplay.gotoPortal();
		}
	}
}
