package controller;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PinInput extends JPanel {
	private JTextField pinField;

	/**
	 * Create the panel.
	 */
	public PinInput() {
		
		setBounds(0, 0, 720, 576); //This is the size of this panel
		//===========================
		pinField = new JTextField();
		pinField.setBounds(26, 233, 330, 142);
		setLayout(null);
		add(pinField);
		pinField.setColumns(10);
		
		final JLabel lblresponseDummy = new JLabel("Response Dummy");
		lblresponseDummy.setBounds(191, 99, 142, 64);
		add(lblresponseDummy);
		
		JLabel btnNum1 = new JLabel("");
		btnNum1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				lblresponseDummy.setText("Response Detected");
				pinField.setText("1");
			}
		});
		btnNum1.setBounds(403, 173, 95, 91);
		add(btnNum1);
		
		JLabel Background = new JLabel("New label");
		Background.setIcon(new ImageIcon(PinInput.class.getResource("/assets/Pinput.png")));
		Background.setBounds(0, 0, 720, 576);
		add(Background);

	}
}
