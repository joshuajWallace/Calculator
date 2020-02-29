package app;

import java.awt.Dimension;
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
			if(i == 4)
				add(new calButton('+'));
			if(i == 7)	
				add(new calButton('-'));		
			add(new calButton(Character.forDigit(i, 10)));
		}
		Dimension two = new Dimension(106, 50);
		calButton zero = new calButton('0');
		zero.setPreferredSize(two);
		add(new calButton('*'));
		add(zero);
		add(new calButton('.'));
		add(new calButton('/'));
		calButton c = new calButton('c');
		calButton equals = new calButton('=');
		c.setPreferredSize(two);
		equals.setPreferredSize(two);
		add(c);
		add(equals);
		//setLayout(new GridLayout(5,4));
		setPreferredSize(new Dimension(250, 300));
	}
}
