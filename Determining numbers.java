import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       ArrayList<Long> list=new ArrayList<Long>();
       for(int i=0;i<n;i++)
       list.add(s.nextLong());
       LinkedHashSet<Long> set=new LinkedHashSet<Long>(list);
       TreeSet<Long> tree=new TreeSet<Long>();
       for(Long in:set)
       {
           if(Collections.frequency(list,in)==1)
           tree.add(in);
       }
       for(Long value:tree)
       System.out.print(value+" ");
       System.out.println();

    }
}
