import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String g="";
       while((g=br.readLine())!=null)
       {
           g=g.toLowerCase();
           char a1=g.charAt(0);
           if(a1!='a'&&a1!='e'&&a1!='i'&&a1!='o'&&a1!='u')
           {
               char a2=g.charAt(g.length()-1);
               if(a2!='a'&&a2!='e'&&a2!='i'&&a2!='o'&&a2!='u')
               {
                   System.out.println("golden");
               }
               else
               System.out.println("not golden");
           }
           else
           System.out.println("not golden");
       }
    }
}
