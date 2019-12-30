import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int p=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      a[i]=s.nextInt();
      for(int j=p; j<a.length;j++){

System.out.print(a[j]+" ");
}
for(int i=0;i<p;i++ ) {
System.out.print(a[i]+" ");
}

    }
}
