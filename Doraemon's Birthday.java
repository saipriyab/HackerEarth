import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String str="";
        int count=0,d=0,o=0,r=0,a=0,c=0,k=0,e=0;
        for(int i=0;i<t;i++)
        {
            count=0;
            str=s.next();
            ArrayList<Character> list=new ArrayList<Character>();
            for(int j=0;j<str.length();j++)
            list.add(str.charAt(j));
            d=Collections.frequency(list,'d');
            o=Collections.frequency(list,'o');
            r=Collections.frequency(list,'r');
            a=Collections.frequency(list,'a');
            c=Collections.frequency(list,'c');
            k=Collections.frequency(list,'k');
            e=Collections.frequency(list,'e');
            while(d>=1&&o>=1&&r>=1&&a>=2&&c>=1&&k>=1&&e>=1)
            {
                count++;
                d=d-1;
                o=o-1;
                r=r-1;
                a=a-2;
                c=c-1;
                k=k-1;
                e=e-1;
            }
            System.out.println(count);
        }

    }
}
