import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       ArrayList<String> a1=new ArrayList<String>();
       int p=0;
       TreeMap<String,Integer> t1=new TreeMap<String,Integer>();
       for(int i=0;i<n;i++)
       {
           String g=s.next();
           a1.add(g);
       }
       for(String p8:a1)
       {
           p=Collections.frequency(a1,p8);
           t1.put(p8,p);
       }
       for(Map.Entry p9:t1.entrySet())
       {
           System.out.println(p9.getKey()+" "+p9.getValue());
       }

    }
}
