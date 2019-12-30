import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      for(int i=0;i<t;i++)
      {
          String g=s.next();
          int l=g.length()/2;
          String g1=g.substring(0,l);
          String g2=g.substring(l);
          ArrayList<Character> a1=new ArrayList<Character>();
          ArrayList<Character> a2=new ArrayList<Character>();
          char a[]=g1.toCharArray();
          char b[]=g2.toCharArray();
          for(int j=0;j<a.length;j++)
          a1.add(a[j]);
          for(int k=0;k<b.length;k++)
          a2.add(b[k]);
          int c=0,p=0;
         // System.out.println(g1);
          //System.out.println(g2);
          for(Character p7:a1)
          {
              int p2=Collections.frequency(a1,p7);
              int p3=Collections.frequency(a2,p7);
              if(p2!=p3)
              {
                  p=1;
                  break;
              }
          }
          if(p==1)
          System.out.println("NO");
          else
          System.out.println("YES");
      }
    }
}
