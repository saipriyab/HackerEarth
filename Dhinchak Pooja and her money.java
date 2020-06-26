import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       int n=0;
      
       for(int i=0;i<t;i++)
       {
           n=s.nextInt();
            BigInteger sum=new BigInteger("0");
            for(int j=0;j<n;j++)
            {
           BigInteger b1=new BigInteger(s.next());
            BigInteger b2=new BigInteger(s.next());
            sum=sum.add(b1.multiply(b2));
            }
            System.out.println(sum);
       }

    }
}
