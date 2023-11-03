//output: emoclew ot sbaltib
class Reverse
  {
    public static void main(String args[])
    {
      String s="Welcome to bitlabs";
      String split[]=s.split(" ");
      for(int i=0;i<split.length;i++)
        {
          String temp=split[i];
          String rev="";
          for(int j=temp.length()-1;j>=0;j--)
            {
              char ch=temp.charAt(j);
              rev=rev+ch;
            }
          System.out.println("Reverse string is :"+rev+" ");
        }
    }
  }