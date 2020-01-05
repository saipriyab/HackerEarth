import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       long n=0,index=0;
       for(int i=0;i<t;i++)
       {
          n=s.nextLong();index=0;
          List<Long> list=new ArrayList<Long>();
           for(int j=0;j<n;j++)
           list.add(s.nextLong());
           List<Long> list2=new ArrayList<Long>();
          for(Long in1:list)
          list2.add(in1);
           Collections.sort(list2,Collections.reverseOrder());
           for(Long in:list)
           {
               index=list2.indexOf(in);
               System.out.print((index+1)+" ");
            
           }
           
           System.out.println();
       }

    }
}
