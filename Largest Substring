import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       String g=s.next();
       ArrayList<String> a1=new ArrayList<String>();
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<=n;j++)
           {
               a1.add(g.substring(i,j));
           }
       }
      long max=0,m1=0,m2=0,max1=0;
       for(String a2:a1)
       {
           String g3=a2;
           m1=0;m2=0;
           char b[]=g3.toCharArray();
           for(int k=0;k<b.length;k++)
           {
               if(b[k]=='0')
               m1++;
               else
               m2++;
           }
           if(m1>m2)
           {
               max=g3.length();
               if(max>max1)
               {
                   max1=max;
               }
           }
       }
       System.out.println(max1);

    }
}
