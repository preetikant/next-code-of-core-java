import javax.swing.*;
class Example extends JFrame
{
	Example(String s)
	{
		super(s);
	}
	public static void main(String []args)
	{
		Example jf=new Example("Swing Example");
		jf.setSize(300,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}