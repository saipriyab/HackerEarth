import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      String g=s.next();
      char a[]=g.toCharArray();
      int p1=Character.getNumericValue(a[0]);
      int p2=Character.getNumericValue(a[2]);
      if(a[1]=='+')
         System.out.println(p1+p2);
         else if(a[1]=='-')
         System.out.println(p1-p2);

    }
}
