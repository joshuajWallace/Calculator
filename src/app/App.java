package app;
import java.awt.*;
import javax.swing.*;

public class App {
	private static char[] display = new char[20];
	private static int inputCounter = 0;
	private final static Display screen = new Display();
	private final static Numbers num = new Numbers();
	private static double memoryNumber = 0;
	private static double inputNumber = 0;
	private static char operation = ' ';
    public static void main(String[] args) throws Exception {
    	JFrame frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
    	frame.add(screen);
    	frame.add(num);
    	frame.pack();
    	frame.setBackground(Color.DARK_GRAY);
    	frame.setVisible(true);
    	frame.setPreferredSize(new Dimension(400, 200));
    	frame.setMaximumSize(new Dimension(400, 200));
    	frame.setResizable(false);
    	
    }
    public static void pressButton(char value) {
    	char[] operators = {'-', '+' , '*', '/'};
    	for(char test : operators) {
    		if(value == test) {
    			if(operation == ' ' && inputNumber != 0){
    				memoryNumber(value);
    				screen.append(" " + String.valueOf(value) + " ");
    				return;
    			}
    			else if(inputNumber != 0) {
    				equals();
    				memoryNumber(value);
    				screen.append(" " + String.valueOf(value) + " ");
    				return;
    			}
		    	else
		    		return;	
	        }
    	}
    	if(value == '=') {//perform math function
			equals();	
		}
		else if(value == 'c') {
			clearDisplay();
		}
		else {//record numbers pushed
			if(inputCounter == 0 && operation == ' ') {
				screen.append("\n");
			}
			display[inputCounter]  = value;
			inputCounter++;
			screen.append(String.valueOf(value));
			inputNumber = Double.valueOf(String.copyValueOf(display));
		}
    }
	public static void memoryNumber(char value) {
		// TODO Auto-generated method stub
		if(operation == ' ') {
		memoryNumber = inputNumber;
		operation = value;
		inputNumber = 0;
		inputCounter = 0;
		display = new char[20];
		}
	}
	public static void equals() {
		switch(operation) {
		case '+':
			inputNumber += memoryNumber;
			displayVal();
			break;
		case '-':
			inputNumber = memoryNumber - inputNumber;
			displayVal();
			break;
		case '*':
			inputNumber *= memoryNumber;
			displayVal();
			break;
		case '/':
			inputNumber = memoryNumber / inputNumber;
			displayVal();
			break;
		default:
			break;
		
		}
	}
	private static void displayVal() {
		// TODO Auto-generated method stub
		screen.append(" = \n" + Double.toString(inputNumber));
		inputCounter = 0;
		display = new char[20];
		operation = ' ';
		memoryNumber = 0;
		
	}
	public static void clearDisplay() {
		// TODO Auto-generated method stub
		screen.setText("");
		inputCounter = 0;
		display = new char[20];
		inputNumber = 0;
		memoryNumber = 0;
	}
}