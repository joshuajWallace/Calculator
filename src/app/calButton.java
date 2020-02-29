package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


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
		setPreferredSize(new Dimension(50 , 50));
		setMaximumSize(new Dimension(50 , 50));
		
		
		setBorder(BorderFactory.createEtchedBorder(getForeground(), getBackground()));
	}
	public class NumberListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
				App.pressButton(value);			
			}
	}				
}
