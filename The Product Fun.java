import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      String str=s.next();
      char arr[]=str.toCharArray();
      int product=1;
      for(int i=0;i<arr.length;i++)
          product*=Character.getNumericValue(arr[i]);
      System.out.println(product);
    }
}
