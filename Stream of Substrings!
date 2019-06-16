import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        String g=s.next();
        int l=g.length();
        ArrayList<String> a1=new ArrayList<String>();
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<=l;j++)
            {
                a1.add(g.substring(i,j));
            }
        }
        Collections.sort(a1,new StringComparator());
        for(String k:a1)
        System.out.println(k);

    }
}
class StringComparator implements Comparator<String>
{
public int compare(String str1, String str2) {
            return str1.length() - str2.length();
        }
}
