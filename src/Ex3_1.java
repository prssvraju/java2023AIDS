//Write a JAVA program to implement class mechanism. – Create a class, methods and invoke them inside main method.
public class Ex3_1 {
	public static void main(String args[])
	{
		A obj = new A();
		obj.display(20, 10);
	}

}

class A 
{
	void display(int l, int b) 
	{
		System.out.println(l);
		System.out.println(b);
	}
}