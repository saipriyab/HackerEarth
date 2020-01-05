import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       String str="";
       int sum=0;
       for(int i=0;i<t;i++)
       {
           str=s.next();
           sum=0;
           char arr[]=str.toCharArray();
           for(int j=0;j<arr.length;j++)
           {
               switch(arr[j])
               {
                   case '1':sum=sum+2;
                            break;
                   case '2':sum=sum+5;
                            break;
                   case '3':sum=sum+5;
                            break;
                   case '4':sum=sum+4;
                            break;
                   case '5':sum=sum+5;
                            break;
                   case '6':sum=sum+6;
                            break;
                   case '7':sum=sum+3;
                            break;
                   case '8':sum=sum+7;
                            break;
                   case '9':sum=sum+6;
                            break;
                   case '0':sum=sum+6;
                            break;
               }
           }
           System.out.println(sum);
       }
    }
}
