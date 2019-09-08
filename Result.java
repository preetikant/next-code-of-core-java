package Test;
import Ghar.*;
public class Result
{
	public static void main(String args[])
	{
		Home h=new Home();
		h.setAge(10);
		h.setName("kittu");
		h.setRelation("Naphiwe");
		
		System.out.println("Age="+h.getAge());
		System.out.println("Name="+h.getName());
		System.out.println("Relation="+h.getRelation());
	}
}