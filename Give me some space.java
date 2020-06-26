import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        str=str.replaceAll(" ","  ");
        System.out.println(str);
        

    }
}
