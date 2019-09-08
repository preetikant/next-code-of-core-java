class GiftTaker
{
	public void acceptGift()
	{
		System.out.println("Hello");
	}
}
class Box
{
	int l,b,h;
	public void setDimension(int l,int b,int h)
		{
			this.l=l;
			this.b=b;
			this.h=h;
			System.out.println("this.l,this.b,this.h"+this.l);	
			System.out.println("this.l,this.b,this.h"+this.b);
			System.out.println("this.l,this.b,this.h"+this.h);
		}	
}
public class A
{
	public static void main(String args[])
	{
		Box b1=new Box();
		//fb1.acceptGift();
		b1.setDimension(8,4,3 );
	}
}