import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      char a[]=s.next().toCharArray();
      char b[]=s.next().toCharArray();
      Arrays.sort(a);Arrays.sort(b);
      if(Arrays.equals(a,b))
      System.out.println("YES");
      else
      System.out.println("NO");
}
}
