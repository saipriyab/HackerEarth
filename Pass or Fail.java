import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       String str="";
       int k=0,count=0;
       for(int i=0;i<t;i++){
           count=0;
           str=s.next();
           k=s.nextInt();
           char arr[]=str.toCharArray();
           for(int j=0;j<arr.length;j++)
           {
           if(arr[j]=='e')
           count++;
           }
           int p=count%(k+1);
           System.out.println(p);
       }

    }
}
