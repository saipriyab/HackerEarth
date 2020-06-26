import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
       String str=s.next();
       int sum=0;
       char arr[]=str.toCharArray();
       for(int i=0;i<arr.length;i++)
       {
           switch(arr[i])
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
