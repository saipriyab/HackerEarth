import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      int num=0;
      for(int i=0;i<t;i++)
      {
          num=s.nextInt();
          System.out.println(num%40);
      }

    }
}
