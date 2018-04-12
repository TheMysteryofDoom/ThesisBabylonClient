package controller;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JTextArea;

import java.awt.Panel;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.ImageIcon;

public class ClientPortalTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientPortalTest window = new ClientPortalTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClientPortalTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 576);
		frame.setAlwaysOnTop(true);
		frame.setUndecorated(true);
		//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		//frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		final JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 109, 700, 429);
		panelMain.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		JTextPane txtpnSampleText = new JTextPane();
		txtpnSampleText.setEditable(false);
		txtpnSampleText.setBounds(10, 74, 382, 279);
		panelMain.add(txtpnSampleText);
		txtpnSampleText.setText("Sample Text");
		
		JLabel clientPortalBackdrop = new JLabel("");
		clientPortalBackdrop.setIcon(new ImageIcon(ClientPortalTest.class.getResource("/assets/OnlyPic.png")));
		clientPortalBackdrop.setBounds(0, 0, 720, 576);
		frame.getContentPane().add(clientPortalBackdrop);
		//==================================================
	}
}
