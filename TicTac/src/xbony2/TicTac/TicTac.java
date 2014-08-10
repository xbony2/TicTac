package xbony2.TicTac;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class TicTac extends JFrame{
	
	public TicTac(){
		super("Behold, our new frame! :p");
		
	}

	public static void main(String[] args) {
		consoleOut("Startup!", 0);
		TicTac window = new TicTac();
		window.setSize(500, 500);
		window.setTitle("Tic Tac v1.0.0a");
		window.setLayout(new FlowLayout());
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setBackground(Color.white);
		
	}
	
	/**
	 * Instead of system.out.println, use this instead.
	 * 
	 * @param output is the string you want to be outputed.
	 * 
	 * @param type is the type.
	 * Type 0: normal output
	 * Type 1: error output
	 * Type 2: major error, basically a corrupted state. Will terminate program.
	 * 
	 * @author xbony2
	 */
	protected static void consoleOut(String output, int type){
		if(type == 0){
			System.out.println("[TicTac] " + output);
		}
		
		if(type == 1){
			System.out.println("[TicTac][ERROR] " + output);
		}
		
		if(type == 2){
			System.out.println("[TicTac][CORRUPTED] " + output + ", SHUTING DOWN PROGRAM");
			System.exit(0);
		}
	}

	
}
