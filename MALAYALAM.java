import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int sum=0;
        String str="";
        String rev="";
        for(int i=num1;i<=num2;i++)
        {
            str=String.valueOf(i);
            rev=new StringBuffer(str).reverse().toString();
            if(str.equals(rev))
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
