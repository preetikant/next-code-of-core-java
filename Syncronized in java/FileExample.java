import java.io.*;
class FileExample
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("F:/my important things/my Html Css and java Script study/Core java learning/File Handling/Preeti.txt");
		f.createNewFile();
		System.out.println("Is Exist: "+f.exists());
				System.out.println("Name: "+f.getName());
						System.out.println("Length: "+f.length());
								//System.out.println("Is Exist: "+f.getSize());
								System.out.println("Can Write: "+f.canWrite());
		
	}
}