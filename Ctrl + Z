import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String g="";
       int p=0;
       ArrayList<String> a1=new ArrayList<>();
       while((g=br.readLine())!=null)
       {
          // System.out.println(g);
           if(!g.contains("Ctrl+Z"))
           {
           a1.add(g);
           p++;
           }
           else
           {
               if(a1.size()!=0)
               {
               a1.remove(p-1);
               p--;
               }
           }
       }
       if(a1.size()!=0)
       System.out.println(a1.get(p-1));
       else
       System.out.println("No actions in clipboard.");
    }
}
