
//Write a JAVA program to sort for an element in a given list of elements using mergesort.
import java.util.Scanner;

public class Ex2_3 {
	public static void main(String args[]) {
		int n1, n2, i, j, k;
		int a[] = new int[20];
		int b[] = new int[20];
		int c[] = new int[20];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements in first array:");
		n1 = s.nextInt();
		System.out.println("Enter sorted elements of first array:");
		for (i = 0; i < n1; i++)
			a[i] = s.nextInt();
		System.out.println("Enter number of elements in second array:");
		n2 = s.nextInt();
		System.out.println("Enter sorted elements of second array:");
		for (j = 0; j < n2; j++)
			b[j] = s.nextInt();
		i = 0;
		j = 0;
		k = 0;
		while ((i < n1) && (j < n2)) {
			if (a[i] > b[j])
				c[k++] = b[j++];
			else
				c[k++] = a[i++];
		}
		while (i < n1)
			c[k++] = a[i++];
		while (j < n2)
			c[k++] = b[j++];
		System.out.println("After merging the elements are:\n");
		for (i = 0; i < (n1 + n2); i++)
			System.out.print("\t" + c[i]);
	}
}

