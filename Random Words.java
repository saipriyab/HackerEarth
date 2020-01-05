import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       ArrayList<String> list=new ArrayList<String>();
       for(int i=0;i<n;i++)
       list.add(s.next());
       Collections.sort(list,new A());
       list.forEach(System.out::println);

    }
   
  }

class A implements Comparator<String>
{
     public int compare(String o1, String o2) {
        if(o1.length()==o2.length())
    {
        return o1.compareTo(o2);
    }
    else if (o1.length() > o2.length()) {
      return 1;
    } else if (o1.length() < o2.length()) {
      return -1;
    } 
   
    
    else {
      return 0;
    }
}
}
