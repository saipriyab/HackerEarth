import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       int n=0;
       long sum=0,value=0;
       for(int i=0;i<t;i++)
       {
           n=s.nextInt();
           sum=0;
           for(long j=0;j<n;j++)
           {
                value=s.nextLong();
                if(value%3==0&&value%5==0)
                sum=sum+value;
           }
           System.out.println(sum);
       }

    }
}
