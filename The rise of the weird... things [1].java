import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        Arrays.sort(a);
        String evensum="",oddsum="";
        int even=0,odd=0;
        for(int j=0;j<n;j++)
        {
            if(a[j]%2==0)
            {
                evensum=evensum+a[j]+" ";
                even=even+a[j];
            }
            else
            {
                oddsum=oddsum+a[j]+" ";
                odd=odd+a[j];
            }
        }
        System.out.println(evensum.trim()+" "+even+" "+oddsum.trim()+" "+odd);

    }
}
