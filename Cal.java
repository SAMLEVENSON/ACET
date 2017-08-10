import java.io.*;
import java.util.*;
public class Cal 
{
    public static void main(String args[])
    {
        int n, i = 1 ;
        int sum = 0;
        System.out.println("Enter the Natural number you want to calculate :");
        Scanner c = new Scanner(System.in);
        n = c.nextInt();
        while(i <= n)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+n+" numbers is :"+sum);
    } 
}
