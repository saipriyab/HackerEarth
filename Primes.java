import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      long a[]=new long[n];
      long f=0,count=0,k=0;
      for(int i=0;i<n;i++)
      {
          a[i]=s.nextLong();
          count=0;
          // System.out.println("value"+a[i]);
          for(int j=1;j<=a[i];j++)
          {
             
              if(a[i]%j==0)
              count++;
          }
             //System.out.println("count"+count);
          if(count==2)
          f++;
      }
      System.out.println(f);

    }
}
