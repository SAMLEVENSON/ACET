import java.io.*;
import java.util.Scanner;
public class Dlye 
{
    public static void main(String[] args)
 {
     int x;
  System.out.println("Enter the year to check whether its leap year or not:");
  Scanner sa= new Scanner(System.in);
  x =sa.nextInt();
    if((x % 400 == 0) || ((x% 4 == 0) && (x% 100 != 0)))
{
       System.out.println("The Year " + x + " is a leap year");
}
     else
{
    System.out.println("The Year " + x + " is not a leap year");
}
}
}
