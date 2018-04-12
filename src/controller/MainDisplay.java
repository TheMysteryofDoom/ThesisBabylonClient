package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainDisplay {

	private JFrame frame;
	private JTextField InputAreaHidden;
	public String rFInput;

	/**
	 * Launch the application.
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
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 576);
		frame.setAlwaysOnTop(true);
		frame.setUndecorated(true);
		//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		//frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		InputAreaHidden = new JTextField();
		InputAreaHidden.setBounds(0, 0, 200, 50);
		frame.getContentPane().add(InputAreaHidden);
		InputAreaHidden.setColumns(10);
		
		//=======================TestBar
		JPanel panelDisplay = new PinInput();
		panelDisplay.setBounds(0, 0, 720, 576);
		frame.getContentPane().add(panelDisplay);
		frame.setVisible(true);
		
	}
}
