package app;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.awt.font.TextLayout;

public class calButton extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5292794102429142604L;
	private char value;
	
	public calButton(char value) {
		this.value = value;
		this.setText(Character.toString(value));		
		this.addActionListener(new NumberListener());
		setSize(50, 50);
		setBorder(BorderFactory.createEtchedBorder(getForeground(), getBackground()));
	}
	public String toString() {
		return Character.toString(value);
	}
	public class NumberListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			if(App.inMemory()) {
				Display.setDisplay(Double.toString((App.getMemory()*Display.getDisplay())));
			}
			switch(value) {
			case '*':
				App.setMemory(Display.getDisplay());
				App.updateMemory(true);
				
				
			
			default: Display.setDisplay(Character.toString(value));
			break;
			}
		}
	}

}