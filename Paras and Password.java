import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int count=0;
        String res="";
        if(str.length()>5)
        {
            res=str.replaceAll("[^a-z]","");
            if(res.length()<1)
            count++;
            res=str.replaceAll("[^A-Z]","");
             if(res.length()<1)
            count++;
             res=str.replaceAll("[^0-9]","");
             if(res.length()<1)
            count++;
            res=str.replaceAll("[^!@#$%^&*()-+]","");
          
             if(res.length()<1)
             { // System.out.println("special");
            count++;
             }
            
        }
        else
        count++;
        System.out.println(count);

    }
}
