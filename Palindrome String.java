import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       String str=s.next();
       String rev=new StringBuffer(str).reverse().toString();
       if(str.equals(rev))
       System.out.println("Palindrome");
       else
       System.out.println("Not Palindrome");

    }
}
