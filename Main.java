//three buttons, two labels, two text field, array list, image
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main
{
	public static void main (String args[])
	{
		JFrame frame1 = new JFrame("This is a JFrame");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(500,500);
		frame1.setVisible(true);
		//---Button 1---
		JButton useless = new JButton("Test1");
		frame1.add(useless);
		useless.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("This is a useless button.");
			}
		});
	}
}//end main class