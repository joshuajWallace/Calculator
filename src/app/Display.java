package app;

import java.awt.Dimension;

import javax.swing.JTextArea;

public class Display extends JTextArea {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1616259315941638640L;
	public Display() {
	    super("", 10, 10);
		setEditable(false);
	}
	public String getDisplay() {
		return getText();
	}
}
