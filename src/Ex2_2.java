import java.util.Scanner;

//Write a JAVA program to sort for an element in a given list of elements using bubblesort
public class Ex2_2 {
	public static void main(String args[]) {
		int n, i, j, temp;
		int a[] = new int[20];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total number of elements:");
		n = s.nextInt();
		System.out.println("Enter elements:");
		for (i = 0; i < n; i++)
			a[i] = s.nextInt();
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("The sorted elements are:");
		for (i = 0; i < n; i++)
			System.out.print("\t" + a[i]);
	}
}