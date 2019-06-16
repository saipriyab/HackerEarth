import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       for(int i=0;i<n;i++)
       {
           int p=s.nextInt();
           String g=s.next();
           int l=g.length();
           char a[]=g.toCharArray();
           ArrayList<String> a1=new ArrayList<String>();
           for(int j=0;j<l;j++)
           {
               for(int k=j+1;k<=l;k++)
           {
               a1.add(g.substring(j,k));
           }
           }
           long c=0,c1=0,c2=0,c3=0,m=0;
           for(String p6:a1)
           {
               String p4=p6;
               char a2[]=p4.toCharArray();
               c1=p4.length();
               c3=c1/2;
               c=0;
               c2=0;
               TreeSet<Character> s9=new TreeSet<Character>();
               for(int k5=0;k5<a2.length;k5++)
                   s9.add(a2[k5]);
               for(Character s7:s9)
               {
                   char s8=s7;
                   c=0;
                   for(int k3=0;k3<a2.length;k3++)
                   {
                       if(a2[k3]==s8)
                       c++;
                   }
               
               if(c>=c3)
               {
                 c2=1;
                 break;
                 
               }
               }
               if(c2==1)
               {
                   if(c1>=m)
                 m=c1;
               }
           }
           System.out.println(m);
           
       }

    }
}
