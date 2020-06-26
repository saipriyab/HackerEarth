import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         a[i]=s.nextInt();
         Arrays.sort(a);
         int q=s.nextInt();
         int num=0,count=0;
         for(int j=0;j<q;j++)
         {
             num=s.nextInt();
             count=0;
             for(int k=0;k<n;k++)
             {
                 if(a[k]<num)
                 count++;
                 else
                 break;
             }
             System.out.println(count);
         }

    }
}
