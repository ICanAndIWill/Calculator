package calculator;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Calculator {

	

		    /**
		     * @param args
		     */
		    public static void main(String[] args) {
		        
		        JFrame frame= new JFrame("Rudrik Joshi's Calculator");
		        frame.setVisible(true);
		        
		        frame.setSize(400,400);
		        frame.setLocationRelativeTo(null);
		       
		        
		        
		        
		        GridLayout gl = new GridLayout(4,4);
		        frame.setLayout(gl);
		        gl.setHgap(15);
		        gl.setVgap(10);
		        
		         
		        JTextField displayScreen = new JTextField("");
		       
		        
		        //displayScreen.setSize(20,78);
		        frame.add(displayScreen);
		        displayScreen.setSize(400,50);
		      
		        
		        String buttons = "789/456*123-0+=";
		        		
		        		for(int i=0; i<buttons.length(); i++)
		        		{
		        			String keyTop = buttons.substring(i, i+1);
		                    JButton b = new JButton(keyTop);
		                    frame.add(b);
		        		}
		        
		        
		    }

	}

