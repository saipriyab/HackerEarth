import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        long t=s.nextLong();
        // long sum=0,product=1;
       //  BigInteger b1=new BigInteger("0");
         // BigInteger b2=new BigInteger("1");
        for(long i=0;i<t;i++)
        {
            long n=s.nextLong();
            
          BigInteger b2=new BigInteger("1");
          long sum=n*(n+1);
            sum=sum/2;
            for(long j=1;j<=n;j++)
            {
                BigInteger b3=new BigInteger(String.valueOf(j));
                b2=b2.multiply(b3);
            }
             String g="";
                g=g+sum;
                BigInteger b1=new BigInteger(g);
            BigInteger b3=b1.mod(b2);
            String b4="";
            b4=b4+b3;
            if(b4.equals("0"))
            System.out.println("YES");
            else
            System.out.println("NO");
            
            
            
        }
    }
}
