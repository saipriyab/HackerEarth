import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      String str1="",str2="";
      int flag=0;
      for(int i=0;i<t;i++)
      {
          str1=s.next();
          str2=s.next();
          char arr1[]=str1.toCharArray();
          char arr2[]=str2.toCharArray();
          ArrayList<Character> list=new ArrayList<Character>();
          for(int j=0;j<arr2.length;j++)
          list.add(arr2[j]);
          flag=0;
          for(int k=0;k<arr1.length;k++)
          {
              if(list.contains(arr1[k]))
              {
                  flag=1;
                  break;
              }
          }
          if(flag==1)
          System.out.println("Yes");
          else
          System.out.println("No");
          
      }

    }
}
