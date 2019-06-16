import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String g="";
        int min=0,max=0;
        for(int i=0;i<n;i++)
        {
            int k=s.nextInt();
            g=g+k;
            BigInteger b1=new BigInteger(g);
            if(b1.isProbablePrime(1))
            {
               // System.out.println(k);
                if(min==0)
                min=k;
                 if(k<min)
                min=k;
                 if(k>max)
                max=k;
            }
            g="";
        }
       // System.out.println(min+" "+max);
        System.out.println(Math.abs(min-max));
    }
}
