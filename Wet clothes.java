import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int g=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c=0;
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int j=0;j<m;j++)
        b[j]=s.nextInt();
        for(int p=0;p<m;p++)
        {
            if(b[p]<a[p])
            {
                if(c<g)
                c++;
            }
        }
        System.out.println(c);
    }
}
