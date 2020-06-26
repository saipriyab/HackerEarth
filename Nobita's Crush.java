import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner s=new Scanner(System.in);
         int t=s.nextInt();
         long n=0,k=0;
         for(int i=0;i<t;i++)
         {
             n=s.nextLong();
             k=s.nextLong();
             if((n/k)%2==0)
             System.out.println("Dekisugi");
             else
             System.out.println("Nobita");
         }

    }
}
