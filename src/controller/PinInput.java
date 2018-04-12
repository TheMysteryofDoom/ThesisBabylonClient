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

public class PinInput extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PinInput() {
		
		setBounds(10, 136, 700, 429); //This is the size of this panel
		//===========================
		textField = new JTextField();
		textField.setBounds(32, 173, 330, 142);
		setLayout(null);
		add(textField);
		textField.setColumns(10);

	}
}
