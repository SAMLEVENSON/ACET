import java.io.*;
import java.util.*;
public class Hello
{
public static void main(String args[])
{
int i , n;
System.out.println("How many times you want the word Hello to print");
Scanner sc= new Scanner(System.in);
n = sc.nextInt();
for(i=0;i<n;i++)
{
System.out.println("Hello");
}
}
}
