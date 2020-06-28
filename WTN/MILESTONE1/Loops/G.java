class G
{
 public static void main (String[] args)
 {
  char item1,item2;
  item1=args[0].charAt(0);
  item2=args[1].charAt(0);
        if (item1>item2)
            System.out.println(item2+" , "+item1);
       
        else
            System.out.println(item1+" , "+item2);
  }
 }