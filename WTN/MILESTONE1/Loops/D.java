class D
{
 public static void main(String args[])
  {
     int a;
     a=Integer.parseInt(args[0]);
     if(a==0)
      System.out.println(a + " is Zero");
    else if(a>0)
      System.out.println(a + " is Positive");
    else 
      System.out.println(a + " is Negative");
}
}