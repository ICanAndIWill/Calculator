/**
 * @author Rudrik Joshi
 * @version 01/27/2015
 * 
 * Simple calculator program for demonstration.
 */


package calculator;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Calculator 
{
/**
 *  @param args
 */		    
	public static void main(String[] args) 
	{        
		JFrame frame= new JFrame("Rudrik Joshi's Calculator");
		frame.setVisible(true); //makes frame visible
		frame.setSize(400,400);//setting frame size
		frame.setLocationRelativeTo(null);//putting frame in center of the screen
		           
		GridLayout gl = new GridLayout(4,4);//number of rows and columns
		frame.setLayout(gl);
		gl.setHgap(15);//space between each buttons horizontally
		gl.setVgap(10);//space between each buttons vertically
		                 
		JTextField displayScreen = new JTextField("");//empty string
		       
		displayScreen.setSize(400,50);//screen size
		frame.add(displayScreen);//screen display

		      
		String buttons = "789/456*123-0+=";
		for(int i=0; i<buttons.length(); i++)
		{
			String button = buttons.substring(i,i+1);//reading buttons using substring
		    JButton b = new JButton(button);
		    frame.add(b);
		}	        
	}
}
