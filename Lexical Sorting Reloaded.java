import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       int n=0;
     //  System.out.println("t--"+t);
       for(int i=0;i<t;i++)
       {
           n=Integer.parseInt(br.readLine());
         //     System.out.println("n--"+n);
           ArrayList<String> list=new ArrayList<>();
           for(int j=0;j<n;j++)
           list.add(br.readLine());
           Collections.sort(list,
            new Comparator<String>() {

                    @Override
                    public int compare(String o1, String o2) {
                        if(o1.equalsIgnoreCase(o2)){
                            return o1.compareTo(o2);
                        }
                        return o1.toLowerCase().compareTo(o2.toLowerCase());
                    }

                });
           for(int k=0;k<list.size();k++)
           {
               System.out.println(list.get(k));
           }
       }
    }
}
