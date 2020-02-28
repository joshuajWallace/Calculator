package app;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JPanel;

public class Numbers extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Numbers() {
		for(int i = 1; i <10; i++) {
			add(new calButton(Character.forDigit(i, 10)));
		}
		calButton zero = new calButton('0');
		zero.setSize(100, 50);
		add(zero);
		add(new calButton('.'));
		add(new calButton('-'));
		add(new calButton('+'));
		add(new calButton('*'));
		add(new calButton('/')); 	
		add(new calButton('='));
		setLayout(new GridLayout(4,3));
		setSize(150, 200);
	}
}
