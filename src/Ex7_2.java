
public class Ex7_2 {
	public static void main(String args[])
	{
		try
		{
			int a=10;
			int b=5;
			int c=a/b;
			int d[]={0,1}; 
			System.out.println(c);
			System.out.println(d[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);

		}
			
		System.out.println("After the catch statement");
	}
}
