import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        String str=s.next();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            count++;
        }
        System.out.println(count);

    }
}
