import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int num=0;
        for(int i1=0;i1<t;i1++)
        {
            num=s.nextInt();
            ArrayList<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<num;i++)
            list.add(s.nextInt());
            Collections.sort(list);
            for(Integer in:list)
            System.out.print(in+" ");
            System.out.println();
        }

    }
}
