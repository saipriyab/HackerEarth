import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      String str=s.next();
      LinkedHashSet<Character> set=new LinkedHashSet<Character>();
      for(int i=0;i<str.length();i++)
      set.add(str.charAt(i));
      for(Character ch:set)
      System.out.print(ch);
      System.out.println();
        

    }
}
