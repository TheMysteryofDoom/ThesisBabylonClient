package utility;

import javax.swing.ImageIcon;

import controller.MainDisplay;

public interface Backgrounds {
	ImageIcon screenSaver = new ImageIcon(MainDisplay.class.getResource("/assets/ScreenSaver.png"));
	ImageIcon pinInput = new ImageIcon(MainDisplay.class.getResource("/assets/Pinput.png"));
	ImageIcon clientPortal = new ImageIcon(MainDisplay.class.getResource("/assets/OnlyPic.png"));
	
}
