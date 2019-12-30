import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        int a[]=new int[10];
       Scanner s=new Scanner(System.in);
       int seventh_number=0;
       for(int i=0;i<10;i++)
       {
           a[i]=s.nextInt();
           if(i==6)
           {
           seventh_number=a[i];
           break;
           }
       }
       float f=0f;
            /*  if(seventh_number==44)
              {
                f=seventh_number*2.75f;
                f=121.00f;
              }
       else*/
       f=2.75f*seventh_number;

       System.out.print("The multiplier is "+seventh_number+"! ");
       System.out.print("Lulu's allowance is $ ");
       System.out.printf("%.02f",f);
       System.out.print("!");
    }
}
