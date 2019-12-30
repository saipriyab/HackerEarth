import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       LinkedHashSet<Integer> s1=new LinkedHashSet<Integer>();
       for(int i=0;i<n;i++)
       {
       a[i]=s.nextInt();
       s1.add(a[i]);
       }
       int c1=0,c2=0;
   //    System.out.println("size"+s1.size());
       for(Integer p5:s1)
       {
           int p6=p5;
           c1=0;
       for(int j=0;j<n;j++)
       {
           if(p6==a[j])
           c1++;
       }
       if(c1==1)
       {
           c2=p6;
           break;
       }
       }
       System.out.println(c2);
    }
}
