import java.io.*;
import java.util.Scanner;
import javax.swing.*;

class First
{
    public static void main(String args[])throws IOException
    {
        System.out.println("Enter your Name");
        //Scanner sc = new Scanner(System.in);
        //String  name=sc.nextLine();
        
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String name = br.readLine();

        String name = JOptionPane.showInputDialog("Enter Name");
        System.out.println("Welcome :"+name);
    }
}
