import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(new StringBuffer(arr[i]).reverse()+" ");

        }
        System.out.println();

    }
}
