import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       String str="",str1="",str2="";
       int mid=0,first=0,end=0;
       for(int i=0;i<t;i++)
       {
           first=0;end=0;
           str=s.next();
           mid=str.length()/2;
           str1=str.substring(0,mid);
           str2=str.substring(mid);
         //  System.out.println("str1"+str1+" "+"str2"+str2);
           char a[]=str1.toCharArray();
           char b[]=str2.toCharArray();
           for(int j=0;j<a.length;j++)
           first=first+Character.getNumericValue(a[j]);
           for(int k=0;k<b.length;k++)
           end=end+Character.getNumericValue(b[k]);
           if(first==end)
           System.out.println("lucky");
           else
           System.out.println("unlucky");
       }

    }
}
