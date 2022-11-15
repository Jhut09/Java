import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JTextField_Example 
{
	JFrame frame;
	JTextField txtname, txtcity;
	JLabel lblname, lblcity;
	JButton btnsave;
	
	public static void main(String[] args)
	{
		JTextField_Example j = new JTextField_Example();
		j.Draw();
	}
	
	public void Draw()
	{
		//JLabel
		lblname=new JLabel("Enter Your Name");
		
		//JTextField
		txtname=new JTextField(); //Initialize
		txtname.setText("Enter Your Name"); //Setting Text
		txtname.setColumns(20); //Setting Size
		txtname.setToolTipText("Your Name"); //Setting ToolTip
		txtname.selectAll(); //Selecting All Text
		
		btnsave = new JButton("Display Text");
		btnsave.addActionListener(actions);
		
		//Adding Component to Frame
		frame = new JFrame("Simple JTextField Example");
		frame.setSize(300, 200);
		frame.setLayout(new FlowLayout());
		
		frame.add(lblname);	
		frame.add(txtname);
		frame.add(btnsave);
		frame.setVisible(true);
	}
	
	private ActionListener actions = new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == btnsave)
			{
				String txt1;
				txt1=txtname.getText();
				JOptionPane.showMessageDialog(null, "Hello "+txt1+". How are you");
			}
		}
	};
}