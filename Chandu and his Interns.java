import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      long x=0,count=0;
      for(int i=0;i<t;i++)
      {
          x=s.nextLong();
          count=0;
          for(long j=1;j<=x;j++)
          {
              if(x%j==0)
              count++;
          }
          if(count<4)
          System.out.println("NO");
          else
          System.out.println("YES");
      }

    }
}
