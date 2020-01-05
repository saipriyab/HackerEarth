import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      String str="";
      for(int i=0;i<t;i++)
      {
          str=s.next();
          char arr[]=str.toCharArray();
          Arrays.sort(arr);
          System.out.println(new String(arr));
      }

    }
}
