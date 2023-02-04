
public class Ex9_4 {
	public static void main(String args[]) {
		try {
			throw new Ex9_4A("Custom Exception ");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
class Ex9_4A extends Exception {
	Ex9_4A(String s1) {
		super(s1);
	}
}
