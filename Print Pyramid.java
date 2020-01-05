import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       int n=0,num=0;
       for(int i=0;i<t;i++)
       {
           n=s.nextInt();
           ArrayList<Integer> list=new ArrayList<Integer>();
           for(int j=0;j<n;j++)
           list.add(s.nextInt());
           num=s.nextInt();
           if(list.contains(num))
           {
              for(int k=0;k<n;k++)
              {
                  if(list.get(k)==num)
                  {
                      System.out.println(k);
                      break;
                  }
              }
           }
           else
           System.out.println("-1");
       }

    }
}
