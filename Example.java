class Box
{
	int length,breadth,height;
	public void SetDimension(int l, int b, int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	public void ShowDimension()
	{
		System.out.println("L="+length);
		System.out.println("B="+breadth);
		System.out.println("H="+height);
		
	}
}
class Example
{
	public static void main(String args[])
	{
		Box bo=new Box();
		bo.SetDimension(10,20,30);
		bo.ShowDimension();
		bo=new Box();
		bo.ShowDimension();
	}
}