import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       String str=s.next();
       String result="";
       char arr[]=str.toCharArray();
       for(int i=0;i<arr.length;i++)
       {
           result=result+Math.abs(arr[i]-96);
       }
      BigInteger b1=new BigInteger(result);
      BigInteger b2=new BigInteger("6");
      if(b1.mod(b2).toString().equals("0"))
      System.out.println("YES");
      else
      System.out.println("NO");

    }
}
