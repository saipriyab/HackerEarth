import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner s=new Scanner(System.in);
     String str=s.next();
     Stack<Character> stack=new Stack<Character>();
     char ch='0';
     char arr[]=str.toCharArray();
     for(int j=0;j<arr.length;j++)
     {
         if(stack.isEmpty())
         stack.push(arr[j]);
         else
         {
             ch=stack.peek();
             if(ch==arr[j])
             {
                 if(!stack.isEmpty())
                 stack.pop();
             }
                 else
                 stack.push(arr[j]);
             
         }
     }
     if(stack.size()>0)
     {
     for(Character c:stack)
     System.out.print(c); 
     System.out.println();
     }
     else
     System.out.println("Empty String");
    }
}
