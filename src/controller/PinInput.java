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

public class PinInput extends JPanel {
	private JPasswordField pinField;
	private String pinInput = "";

	/**
	 * Create the panel.
	 */
	public PinInput() {
		
		setBounds(0, 0, 720, 576);
		setLayout(null);
		
		JButton btnPageFlowDummy = new JButton("Page Flow Dummy Button");
		btnPageFlowDummy.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnPageFlowDummy.setBounds(61, 468, 178, 23);
		add(btnPageFlowDummy);
		
		final JLabel lblresponseDummy = new JLabel("Response Dummy");
		lblresponseDummy.setBounds(191, 99, 142, 64);
		add(lblresponseDummy);
		
		pinField = new JPasswordField();
		pinField.setFont(new Font("Tahoma", Font.PLAIN, 50));
		pinField.setBounds(61, 243, 215, 81);
		add(pinField);
		
		JButton btnNum3 = new JButton("");
		btnNum3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblresponseDummy.setText("Response Detected");
				pinInput = pinInput+"3";
				pinField.setText(pinInput);
				MainDisplay.PinWriter("3");
			}
		});
		
		JButton btnNum1 = new JButton("");
		btnNum1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblresponseDummy.setText("Response Detected");
				pinInput = pinInput+"1";
				pinField.setText(pinInput);
				MainDisplay.PinWriter("1");
			}
		});
		btnNum1.setOpaque(false);
		btnNum1.setContentAreaFilled(false);
		btnNum1.setBorderPainted(false);
		btnNum1.setBorder(null);
		btnNum1.setBounds(408, 146, 95, 91);
		add(btnNum1);
		
		JButton btnNum2 = new JButton("");
		btnNum2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblresponseDummy.setText("Response Detected");
				pinInput = pinInput+"2";
				pinField.setText(pinInput);
				MainDisplay.PinWriter("2");
			}
		});
		btnNum2.setOpaque(false);
		btnNum2.setContentAreaFilled(false);
		btnNum2.setBorderPainted(false);
		btnNum2.setBorder(null);
		btnNum2.setBounds(501, 146, 95, 91);
		add(btnNum2);
		btnNum3.setBounds(597, 146, 95, 91);
		BtnFormat(btnNum3);
		add(btnNum3);
		
		final JButton btnNum4 = new JButton("");
		btnNum4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblresponseDummy.setText("Response Detected");
				pinInput = pinInput+"4";
				pinField.setText(pinInput);
				MainDisplay.PinWriter("4");
			}
		});
		btnNum4.setOpaque(false);
		btnNum4.setContentAreaFilled(false);
		btnNum4.setBorderPainted(false);
		btnNum4.setBorder(null);
		btnNum4.setBounds(408, 241, 95, 91);
		add(btnNum4);
		
		JButton btnNum5 = new JButton("");
		btnNum5.setOpaque(false);
		btnNum5.setContentAreaFilled(false);
		btnNum5.setBorderPainted(false);
		btnNum5.setBorder(null);
		btnNum5.setBounds(501, 241, 95, 91);
		add(btnNum5);
		
		JButton btnNum6 = new JButton("");
		btnNum6.setOpaque(false);
		btnNum6.setContentAreaFilled(false);
		btnNum6.setBorderPainted(false);
		btnNum6.setBorder(null);
		btnNum6.setBounds(597, 241, 95, 91);
		add(btnNum6);
		
		JButton btnNum7 = new JButton("");
		btnNum7.setOpaque(false);
		btnNum7.setContentAreaFilled(false);
		btnNum7.setBorderPainted(false);
		btnNum7.setBorder(null);
		btnNum7.setBounds(408, 334, 95, 91);
		add(btnNum7);
		
		JLabel Background = new JLabel("");
		
		Background.setIcon(new ImageIcon(PinInput.class.getResource("/assets/Pinput.png")));
		Background.setBounds(0, 0, 720, 576);
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
	
	public static void getNumInput(JButton button){
	}
}
