import java.util.Scanner;

public class IntToString {

public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the integer");
    long a=sc.nextLong();
    System.out.println("Enter the index position to print");
      int b=sc.nextInt();
    String s=String.valueOf(a);
      System.out.println("Converted to string :"+s);
      System.out.println("char at given index is :"+(s.charAt(b)));
  }
}