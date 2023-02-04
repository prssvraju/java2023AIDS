
public class Ex10_1 {
	public static void main(String args[])
	{
		Ex10_1A threada = new Ex10_1A();
		Ex10_1B threadb = new Ex10_1B();
		Ex10_1C threadc = new Ex10_1C();
		threada.start();
		threadb.start();
		threadc.start();
		
	}
	

}

class Ex10_1A extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				sleep(1000);
				System.out.println("good morning");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Ex10_1B extends Thread {
	public void run() {
		try {
			for (int j = 1; j <= 10; j++) {
				sleep(2000);
				System.out.println("hello");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Ex10_1C extends Thread {
	public void run() {
		try {
			for (int k = 1; k <= 10; k++) {
				sleep(3000);
				System.out.println("welcome");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
	