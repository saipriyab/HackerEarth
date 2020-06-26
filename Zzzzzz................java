import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int mid=0;
       mid=n-1;
       for(int i=0;i<n;i++)
       System.out.print('*');
       System.out.println();
       for(int j=0;j<mid;j++)
       {
           while(mid>1)
           {
           for(int k=0;k<mid-1;k++)
           {
           System.out.print(" ");
           }
           System.out.print("*");
           System.out.println();
           mid--;
           }
       }
        for(int k=0;k<n;k++)
       System.out.print('*');
       System.out.println();
    }
}
