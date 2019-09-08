import javax.swing.*;
import java.awt.event.*;
class Sum extends JFrame
{
	JLabel l1,l2,l3,l4;
	JButton b1;
	JTextField t1,t2;
	
	Sum(String s)
	{
		super(s);
	}
	public void setComponent()
	{
		l1=new JLabel("Sum of two Numbers");
		l2=new JLabel("First Number");
		l3=new JLabel("Second Number");
		t1=new JTextField();
		t2=new JTextField();
		l4=new JLabel();
		b1=new JButton("Add");
		setLayout(null);
		l1.setBounds(60,50,200,20);
		l2.setBounds(30,80,100,20);
		l3.setBounds(30,120,100,20);
		t1.setBounds(150,80,100,20);
		t2.setBounds(150,120,100,20);
		b1.setBounds(110,160,60,20);
		l4.setBounds(50,200,150,20);
		b1.addActionListener(new Handler());
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(b1);
		
		
	}
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a+b;
			l4.setText("Result is "+c);
		}
	}
	public static void main(String args[])
	{
		Sum sm=new Sum("Addition Program");
		sm.setComponent();
		sm.setVisible(true);
		sm.setSize(300,300);
		sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}