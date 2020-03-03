package app;

import java.awt.event.*;

public  class CalListener implements KeyListener {

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		char value = event.getKeyChar();
		if(event.getKeyChar() == '\n')
			value = '=';
		if(value > 41 && value < 58 && value != 44 || value == '=')
			App.pressButton(value);
		return;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
