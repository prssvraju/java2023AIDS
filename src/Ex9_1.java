//Write a JAVA program for creation of Illustratingthrow
public class Ex9_1 {
	public static void main(String args[]) {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}