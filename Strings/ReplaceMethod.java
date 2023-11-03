import java.util.Scanner;

class Replace {
  public static void main(String args[]) {
    Scanner vikas = new Scanner(System.in);
    System.out.println("Enter the string");
    String st = vikas.nextLine();
    System.out.println("Enter the oid character to be change");
    char old = vikas.next().charAt(0);
    System.out.println("Enter the new character to be replaced");
    char ne = vikas.next().charAt(0);

    System.out.println(st.replace(old, ne));
  }

}