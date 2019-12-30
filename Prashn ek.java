import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        char a[]={'Q','W','E','R','T','Y','U','I','O','P'};
        char b[]={'A','S','D','F','G','H','J','K','L'};
        char c[]={'Z','X','C','V','B','N','M'};
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        String g1=new String(a);
        String g2=new String(b);
        String g3=new String(c);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            String g=s.next();
            char a1[]=g.toCharArray();
            Set<Character> s1=new TreeSet<Character>();
            for(int j=0;j<a1.length;j++)
                s1.add(a1[j]);
                String g4="";
                for(Character c6:s1)
                g4=g4+c6;
            //System.out.println(g4);
            if(g1.contains(g4)||g2.contains(g4)||g3.contains(g4))
            System.out.println("NO");
            else
            System.out.println("YES");
        }
    }
}
