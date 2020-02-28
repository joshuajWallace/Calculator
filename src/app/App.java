package app;
import java.awt.*;
import javax.swing.*;

public class App {
	private static double memory;
	private static boolean inMemory;
    public static void main(String[] args) throws Exception {
    	JFrame frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
    	final Numbers num = new Numbers();
    	frame.add(new Display(20));
    	frame.add(num);
    	frame.pack();
    	frame.setBackground(Color.DARK_GRAY);
    	frame.setVisible(true);    	
    }
    public static  boolean inMemory() {
    	return inMemory;
    }
    public static void setMemory(double value) {
    	memory = value;
    }
    public static void updateMemory(boolean set) {
    	inMemory = set;
    }
	public static double getMemory() {
		// TODO Auto-generated method stub
		return memory;
	}
}