package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Display extends JTextField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1616259315941638640L;
	private static String display = "0";
	public Display(int length) {
	    super(display, length);
		setSize(150, 20);
		setEditable(false);
	}
	public static void setDisplay(String number) {
		display = number;
	}
	public static double getDisplay() {
		return Double.valueOf(display);
	}
	public void update() {
		setText(display);
	}
}
