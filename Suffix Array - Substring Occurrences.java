import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       String str=s.next();
       String t=s.next();
       int p=0,count=0;
       while(str.contains(t))
       {
           p=str.indexOf(t);
           System.out.print(p+" ");
           char arr[]=str.toCharArray();
           arr[p]='0';
           count=1;
           for(int j=p+1;;j++)
           {
               ++count;
               if(count<=t.length())
               arr[j]='0';
               else
               break;
           }
           str=new String(arr);
       }
       System.out.println();

    }
}
