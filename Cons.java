package L12Constructor;
public class Cons
{
	int l,b,h;
	public Cons()
	{
		l=10;
		b=90;
		h=21;
	}
	public Cons(int L, int B, int H)
	{
		
		L=l;
		B=b;
		H=h;
	}
	
	
public static void main(String args[])
{
 Cons l1=new Cons();
 Cons l3=new Cons(34,45,34);
 
 System.out.println("Argument in Constuctor="+l3);
}
}
