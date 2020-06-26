import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      ArrayList<String> list=new ArrayList<>();
      for(int i=0;i<n;i++)
      list.add(s.next());
      int t=0,l=0,r=0,count=0;
      String str1="";
      t=s.nextInt();
      for(int k=0;k<t;k++)
      {
          l=s.nextInt();
          r=s.nextInt();
          str1=s.next();
          count=0;
          for(int p=l-1;p<r;p++)
          {
              if(list.get(p).contains(str1))
              count++;
              
          }
          System.out.println(count);
      }

    }
}
