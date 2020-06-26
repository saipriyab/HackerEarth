import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=n;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n1;j++)
            {
            System.out.print(j+" ");
            }
            n1=n1-1;
            System.out.println();
        }

    }
}
