import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        char a[][]=new char[m][n];
        String g3[]=new String[m];
        for(int k=0;k<m;k++)
        g3[k]=s.next();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                g3[i]=g3[i].toLowerCase();
                a[i][j]=g3[i].charAt(j);
            }
        }
        int count=0;
        if(n>4)
        {
        if(a[0][0]=='s'&&a[0][1]=='a'&&a[0][2]=='b'&&a[0][3]=='a')
        count++;
        }
        if(n>4)
        {
            if(a[0][0]=='s'&&a[1][0]=='a'&&a[2][0]=='b'&&a[3][0]=='a')
        count++;
        }
        if(m>4)
        {
            if(a[0][0]=='s'&&a[1][1]=='a'&&a[2][2]=='b'&&a[3][3]=='a')
        count++;
        if(n>4)
        {
        int p=n-1;
        if(a[p][0]=='s'&&a[p-1][1]=='a'&&a[p-2][2]=='b'&&a[p-3][3]=='a')
                 count++;
        }
        
        }
        
System.out.println(count);
    }
}
