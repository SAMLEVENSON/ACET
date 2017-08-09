                                  //To find largest number among three entered numbers//
import java.io.*;
import java.util.Scanner;
 
public class Lot
{
   public static void main(String args[])
   {
      int f, s, t;
      System.out.println("Enter the number to check which is largest !!! : ");
      Scanner sa = new Scanner(System.in);
 
      f = sa.nextInt();
      s = sa.nextInt();
      t = sa.nextInt();
 
      if ( f > s && f > t )
         System.out.println(  +f+  "is the Largest number.");
      else if ( s > f && s > t )
         System.out.println( +s+  " is the largest number.");
      else if ( t > f && t > s )
         System.out.println( +t+  "is the largest number.");
      else   
         System.out.println("The input you have given is not a number.");
   }
}
