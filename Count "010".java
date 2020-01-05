import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            String str=s.next();
            int l=str.length();
            int count=0;
            for(int j=0;j<l;j++)
            {
                for(int k=j+1;k<=l;k++)
                {
                    if(str.substring(j,k).equals("010"))
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
