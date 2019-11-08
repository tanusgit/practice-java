package stack;
import java.awt.*; 
import javax.swing.*; 
  

public class color extends JFrame {
	  
	    // constructor 
	    color() 
	    { 
	        //super("colour"); 
	  
	        // create a new Color 
	        Color magenta = Color.blue; 
	        Color green = Color.white; 
	        Color yellow = Color.red; 
	        Color red = Color.red; 
	  
	        // creating  panels 
	        JPanel panel1 = new JPanel(); 
	        JPanel panel2 = new JPanel(); 
	        JPanel panel3 = new JPanel(); 
	        JPanel panel4 = new JPanel(); 
	  
	        // set the background of the frame  
	        // to the specified Color 
	        panel1.setBackground(magenta); 
	        panel2.setBackground(green);
	        panel3.setBackground(yellow);
	        
	        //setSize(x,y) y is height and x is width
	        setSize(200, 150); 
	        add(panel1);
	        show();
	        //second color
	        setSize(150, 200);
	        add(panel2);
	        show();
	        //500 is the whole canvas size, we can't have same width value means
	        //x value for different panels as they would cover each other
	        setSize(500, 200); 
	        add(panel3);
	        show();
	        
	       
	    } 
	  
	    // Main Method 
	    public static void main(String args[]) 
	    { 
	       color c = new color(); 
	    } 
	} 
