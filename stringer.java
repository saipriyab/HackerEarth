import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       String str="";
       for(int i=0;i<t;i++)
       {
           str=s.next();
           ArrayList<Character> list=new ArrayList<Character>();
           for(int j=0;j<str.length();j++)
           list.add(str.charAt(j));
           System.out.print(Collections.frequency(list,'0')+" "+Collections.frequency(list,'1')+" ");
           System.out.print(Collections.frequency(list,'2')+" "+Collections.frequency(list,'3')+" ");
            System.out.print(Collections.frequency(list,'4')+" "+Collections.frequency(list,'5')+" ");
             System.out.print(Collections.frequency(list,'6')+" "+Collections.frequency(list,'7')+" ");
              System.out.print(Collections.frequency(list,'8')+" "+Collections.frequency(list,'9')+" ");
              System.out.println();
       }

    }
}
