package app;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Display extends JScrollPane {
	private static final long serialVersionUID = 1616259315941638640L;
    private static JTextArea text = new JTextArea("", 20, 20);
	public Display() {
		super(text);
		text.setEditable(false);
		setPreferredSize(new Dimension(150,150));
		
	}
	public String getDisplay() {
		return text.getText();
	}
	public void append(String string) {
		// TODO Auto-generated method stub
		text.append(string);
		
	}
	public void setText(String copyValueOf) {
		// TODO Auto-generated method stub
		text.setText(copyValueOf);
	}
}

