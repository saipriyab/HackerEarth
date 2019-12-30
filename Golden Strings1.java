import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        while(s.hasNext())
        {
            String g=s.next();
            g=g.toLowerCase();
            if(g.charAt(0)!='a'&&g.charAt(0)!='e'&&g.charAt(0)!='i'&&g.charAt(0)!='o'&&g.charAt(0)!='u')
            {
                if(g.charAt(g.length()-1)!='a'&&g.charAt(g.length()-1)!='e'&&g.charAt(g.length()-1)!='i'&&g.charAt(g.length()-1)!='o'&&g.charAt(g.length()-1)!='u')
                 System.out.println("golden");
                 else
                  System.out.println("not golden");
            }
            else
            System.out.println("not golden");
        }

    }
}
