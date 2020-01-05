import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String s = br.readLine();

         String out_ = Palindromic_Subsequence(s);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static String Palindromic_Subsequence(String s){
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        String str=String.valueOf(arr[0]);
        return str;
    
    }
}
