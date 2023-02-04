//Write a JAVA program to implement Multi-level Inheritance
public class Ex5_2 {
	public static void main(String args[])
	{
		Ex5_2C obj = new Ex5_2C();
	}

}
class Ex5_2A
{
	Ex5_2A()
	{
		System.out.println("Inside Class A");
	}
}
class Ex5_2B extends Ex5_2A
{
	Ex5_2B()
	{
		System.out.println("Inside Class B");
	}
}
class Ex5_2C extends Ex5_2B
{
	Ex5_2C()
	{
		System.out.println("Inside Class C");
	}
}

