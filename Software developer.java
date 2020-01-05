import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int p=0;
      String str="";
      int t=s.nextInt();
      for(int i=0;i<t;i++)
      {
          str=s.next();
          if(str.equals("p++")||str.equals("++p"))
          {
              p=p+1;
              System.out.println(p);
          }
          else if(str.equals("p--")||str.equals("--p"))
          {
              p=p-1;
              System.out.println(p);
          }
          else if(p==0)
          {
              p=0;
              System.out.println(p);
          }
      }

    }
}
