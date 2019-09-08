class StringExample
{
	public static void main(String args[])
	{
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		System.out.println("Result1: "+(s1==s2));
		System.out.println("Result2: "+s1.equals(s2));
		System.out.println("Result3: "+(s1==s3));
		System.out.println("Result4: "+s1.equals(s3));
	}
}
