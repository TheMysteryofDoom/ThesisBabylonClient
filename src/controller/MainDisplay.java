package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainDisplay {

	private JFrame frame;
	private static JPanel panel;
	private static String state = "1";
	private static JTextField hiddenInputField = new JTextField();
	private String rfIDInput;

	/**
	 * Launch the application.
	 * This version of the client program uses cards to shuffle through
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDisplay window = new MainDisplay();
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
	public MainDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//=====================================================
		frame = new JFrame();
		frame.setBounds(100, 100, 960, 768);
		frame.setAlwaysOnTop(true);
		frame.setUndecorated(true);
		//frame.setExtendedState(frame.MAXIMIZED_BOTH);
		//frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		hiddenInputField.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(hiddenInputField);
		hiddenInputField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(state.equals("1")){
					System.out.println(hiddenInputField.getText());
					rfIDInput = hiddenInputField.getText();
					state = "2";
					hiddenInputField.setText("");
					screenChanger();
				} else if (state.equals("2")){
					System.out.println(hiddenInputField.getText());
					rfIDInput = hiddenInputField.getText();
					state = "2";
					screenChanger();
				}
			}
		});
		hiddenInputField.setColumns(10);
		
		panel = new JPanel();
		//========================Declare Cards
		JPanel screenSaver = new ScreenSaver();
		JPanel pinInput = new PinInput();
		JPanel clientPortal = new ClientPortal();
		//========================
		panel.setBounds(0, 0, 960, 768);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout());
		//Assign Cards to state
		panel.add(screenSaver, "1");
		panel.add(pinInput, "2");
		panel.add(clientPortal, "3");
	}
	
	private static void screenChanger(){
		CardLayout cl = (CardLayout)(panel.getLayout());
        cl.show(panel, state);
	}
	
	public static void PinWriter(String input){
		hiddenInputField.setText(input);
		//System.out.println(input);
		System.out.println(hiddenInputField.getText());
	}
	
	public static void gotoPortal(){
		state = "3";
		screenChanger();
	}

}
