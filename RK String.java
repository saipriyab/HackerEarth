import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int m=0,n=0,l=0,c1=0,c2=0;
        String str="",sub="",res="";
        for(int i=0;i<t;i++)
        {
            m=s.nextInt();
            n=s.nextInt();
            str=s.next();
            l=str.length();
            c1=0;c2=0;
            for(int j=0;j<l;j++)
            {
                for(int k=j+1;k<=l;k++)
                {
                    sub=str.substring(j,k);
                    res=sub.replaceAll("[^R]","");
                    if(res.length()==m)
                    c1++;
                    res=sub.replaceAll("[^K]","");
                     if(res.length()==n)
                    c2++;

                }
            }
            System.out.println(c1+" "+c2);
        }
    }
}
