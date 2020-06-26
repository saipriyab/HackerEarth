import java.util.*;
import java.text.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String str="";
         long MILLIS_IN_A_DAY = 1000 * 60 * 60 * 24;
        for(int i=0;i<t;i++)
        {
            str=s.next();
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(str); 
            Date date2= new Date(date1.getTime() + MILLIS_IN_A_DAY);
            String date3=new SimpleDateFormat("dd/MM/yyyy").format(date2);
            String arr[]=date3.split("/");
             if(arr[0].contains("0"))
            arr[0]=arr[0].replaceAll("^0","");
            if(arr[1].contains("0"))
            arr[1]=arr[1].replaceAll("^0","");
            for(int j=0;j<arr.length;j++)
            {
                if(j!=arr.length-1)
            System.out.print(arr[j]+"/");
            else
            System.out.print(arr[j]);
            }
            System.out.println();

        }
       

    }
}
