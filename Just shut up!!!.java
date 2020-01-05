import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int num=0;
       String str="";
       for(int i=0;i<n;i++)
       {
           num=s.nextInt();
           if(num==0||num==1)
           System.out.println("1");
           else
           {
               BigInteger sum=new BigInteger("1");
               for(int j=2;j<=num;j++)
               sum=sum.multiply(BigInteger.valueOf(j));
               str=sum.toString();
               str=str.replaceAll("0","");
               System.out.println(str.charAt(str.length()-1));
           }
       }

    }
}
