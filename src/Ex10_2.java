
public class Ex10_2 {
	
	public static void main(String args[])
	{
		Ex10_2A a =new Ex10_2A();
		Ex10_2B b =new Ex10_2B();
		Ex10_2C c =new Ex10_2C();
		
		a.start();
		b.start();
		c.start();
		
		System.out.println (a.isAlive());
		System.out.println (b.isAlive());
		System.out.println (c.isAlive());
		
		try
		{
		a.join();
		b.join();
		c.join();
		}
		catch(InterruptedException e) {
		System.out.println(e);
		}
		
		System.out.println (a.isAlive());
		System.out.println (b.isAlive());
		System.out.println (c.isAlive());
		
	}
	

}

class Ex10_2A extends Thread {
	public void run() {

		try {
			for (int i = 1; i <= 10; i++) {
				sleep(1000);
				System.out.println("go od morning");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Ex10_2B extends Thread {
	public void run() {
		try {
			for (int j = 1; j <= 10; j++) {
				sleep(2000);
				System.out.println("he llo");
			}
		} catch (Exception e) {

			System.out.println(e);
		}
	}
}

class Ex10_2C extends Thread {
	public void run() {
		try {
			for (int k = 1; k <= 10; k++) {
				sleep(3000);
				System.out.println("we lcome");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}