import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      String g=s.next();
      int l=g.length();
      int max=0,f=0;
      for(int i=0;i<l;i++)
      {
          for(int j=i+1;j<=l;j++)
          {
              f=0;
              String g1=g.substring(i,j);
              char a[]=g1.toCharArray();
              for(int k=0;k<a.length-2;k++)
              {
                  if(a[k]==a[k+1])
                  {
                      f=1;
                  break;
                  }
              }
              if(f==0)
              {
                  if(g1.length()>max)
                  max=g1.length();
              }
          }
      }
      System.out.println(max);

    }
}
