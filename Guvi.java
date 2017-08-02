import java.io.*;
import java.util.Scanner;

public class Guvi
{
    public static void main(String args[])
    {
        char s;
      System.out.print("Enter a Character to check whether its is alphabet or not: ");
       Scanner sc = new Scanner(System.in);
        s = sc.next().charAt(0);
		
        if((s>='a' && s<='z') || (s>='A' && s<='Z'))
        {
            System.out.print("The character you have entered is an Alphabet");
        }
        else
        {
            System.out.print("The character you have entered is not an Alphabet");
        }
    }
}
