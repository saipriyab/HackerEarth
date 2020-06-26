import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      String str="";
      for(int i=0;i<t;i++)
      {
          str=s.next();
          BigInteger b1=new BigInteger(str);
          if(b1.isProbablePrime(1))
          System.out.println("YES");
          else
          System.out.println("NO");
      }

    }
}
