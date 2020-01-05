import java.io.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        String str="";
        BigInteger b2=new BigInteger("2");
        int val=0;
        String str1="";
        for(int i1=0;i1<t;i1++)
        {
            str=br.readLine();
            String arr[]=str.split(" ");
            BigInteger b1=new BigInteger("0");
            for(int i=0;i<arr.length;i++)
            {
                b1=new BigInteger("0");
                str1=arr[i];
                for(int j=0;j<str1.length();j++)
                {
                val=Math.abs((int)(str1.charAt(j))-65);
                b1=b1.add(b2.pow(val));
                }
                System.out.print(b1+" ");
            }
            System.out.println();
            
        }

    }
}
