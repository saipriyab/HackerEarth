import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=0;i<=n;i++)
      {
          if(i!=n)
          {
          System.out.println("*"+"   "+"*");
          System.out.println("*"+"   "+"*");
          System.out.println("*****");
          }
          else
          {
               System.out.println("*"+"   "+"*");
          System.out.println("*"+"   "+"*");
          }
      }
    }
}
