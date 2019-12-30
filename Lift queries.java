import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner s=new Scanner(System.in);
     int t=s.nextInt();
     int l=0,u=7,p=0,p1=0;
     int j=0;
     for(int i=0;i<t;i++)
     {
         
          
         j=s.nextInt();
             p=Math.abs(j-l);
             p1=Math.abs(j-u);
             if(p1>p)
             {
                 System.out.println("A");
                 l=j;
             }
             else if(p>p1)
             {
                 System.out.println("B");
                 u=j;
             }
             else
             {
                  System.out.println("A");
                 l=j;
             }
        
     }

    }
}
