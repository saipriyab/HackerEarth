import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            String g=s.next();
            g=g.toLowerCase();
            int l=g.length();
            long sum=0;
            for(int j=0;j<l;j++)
            {
                for(int k=j+1;k<=l;k++)
                {
                    String h=g.substring(j,k);
                    long c=0;
                    char b[]=h.toCharArray();
                    for(int p2=0;p2<b.length;p2++)
                    {
                        if(b[p2]=='a'||b[p2]=='e'||b[p2]=='i'||b[p2]=='o'||b[p2]=='u')
                        c++;
                    }
                    sum=sum+c;
                }
            }
            System.out.println(sum);
        }

    }
}

