import java.io.*;
import java.util.*;
public class Vc
{
public static void main( String[] args)
{
char a;
System.out.println(" Enter an Alphabet : ");
Scanner sc = new Scanner(System.in);
a = sc.next() . charAt(0);
if( a== 'a' || a== 'A' || a== 'e' || a== 'E' || a== 'i' || a== 'I' || a== 'o' || a== 'O' || a== 'u' || a== 'U' )
{
 System.out.println(" Entered alphabet " +a+ " is Vowel" );
}
else
{
 System.out.println(" Entered alphabet" +a+ " is Consonant" );
}
}
}
