import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       String str="";
       int count=0;
       LinkedHashSet<String> set=new LinkedHashSet<String>();
       for(int i=0;i<t;i++)
       {
           str=br.readLine();
           if(str.contains("="))
           {
               String arr[]=str.split("=");
               set.add(arr[0]);
           }
         
       }
       System.out.println(set.size());

    }
}
