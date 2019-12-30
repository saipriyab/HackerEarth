import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       for(int i1=0;i1<n;i1++)
       {
           String g=s.next();
           char a[]=g.toCharArray();
           TreeSet<Character> s2=new TreeSet<Character>();
           for(int i=0;i<a.length;i++)
           s2.add(a[i]);
           int f=0,c=0;
           for(Character s3:s2)
           {
               char p5=s3;
               c=0;
               for(int k=0;k<a.length;k++)
               {
                   if(a[k]==p5)
                   c++;
               }
               if(c>2)
               {
                   f=1;
                   break;
               }
           }
           if(f==1)
           System.out.println("0");
           else
           System.out.println("1");
       }
    }
}
