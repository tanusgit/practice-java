package linklist;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.*;

public class GuiJava implements ActionListener{
	
	
	static JFrame frame = new JFrame();
	static JButton button = new JButton("click");
	
	static JButton button1 = new JButton("login");
	static JButton button2 = new JButton("log out");
	static JMenuItem menu = new JMenuItem("login");
	
	public void show() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add button to the frame's content pane
		frame.getContentPane().add(button);
		button.setBackground(Color.red);
		button.setPreferredSize(new Dimension(40, 40));
		//frame.getContentPane().add(button1);
		//frame.getContentPane().add(button2);
		frame.setSize(1000,800);
		frame.setVisible(true);
		button.addActionListener(this);
		frame.getContentPane().add(menu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setText("I have been clicked");
		
		/*PopupMenu pop = new PopupMenu();
		pop.add(new MenuItem ("milk"));
		pop.add(new MenuItem ("banana"));
		pop.add(new MenuItem ("apple"));
		button.add(pop);
		pop.show((Component) (e).getSource(), 0, 0);*/
	}

}
