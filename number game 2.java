import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String str="";
        BigInteger b2=new BigInteger("3");
        for(int i=0;i<t;i++)
        {
            str=s.next();
            BigInteger b1=new BigInteger(str);
            if(b1.mod(b2).toString().equals("0"))
            System.out.println("yes");
            else
            System.out.println(b1.mod(b2));
        }
    }
}
