//Write a JAVA program that describes exception handlingmechanism
public class Ex7_1 {
	public static void main(String args[])
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("After the catch statement");
	}

}
