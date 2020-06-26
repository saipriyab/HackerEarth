import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int op=s.nextInt();
        if(op==1)
        System.out.println(num1-num2);
        else if(op==2)
        System.out.println(num1*num2);
        else if(op==3)
        System.out.println(num1/num2);

    }
}
