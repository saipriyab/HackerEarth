import java.io.*;
import java.math.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        String arr[]=st.split(" ");
        int t=Integer.parseInt(arr[0]);
        int n=Integer.parseInt(arr[1]);
        String teachers[]=new String[t];
        for(int i=0;i<t;i++)
        teachers[i]=br.readLine();
        Arrays.sort(teachers);
        Map<String,TreeMap<Integer,String>> studentsMap=new LinkedHashMap<>();
        String student="";
        int age=0;
        for(int j=0;j<n;j++)
        {
            student=br.readLine();
            String stArr[]=student.split(" ");
            if(!studentsMap.containsKey(stArr[0]))
            {
               TreeMap<Integer,String> stTree=new TreeMap<>();
               age=Integer.parseInt(stArr[2]);
               stTree.put(age,stArr[1]);
               studentsMap.put(stArr[0],stTree);
            }
            else
            {
                TreeMap stTree= studentsMap.get(stArr[0]);
                  age=Integer.parseInt(stArr[2]);
               stTree.put(age,stArr[1]);
                studentsMap.put(stArr[0],stTree);
            }
        }
        for(int p=0;p<t;p++)
        {
            System.out.println(teachers[p]);
              TreeMap studentMap=studentsMap.get(teachers[p]);
              studentMap.forEach((k,v)->{
                  System.out.println(v+" "+k);
              });

        }

        
       

    }
}
