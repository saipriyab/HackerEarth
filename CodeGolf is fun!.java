class TestClass {
    public static void main(String args[] ) throws Exception {
        String g="CodeGolf is fun!";
        if(new java.util.Scanner(System.in).nextInt()==0)
            for(int i=0;i<16;i++)
                    System.out.println(g.substring(0,g.length()-i));
        else
            for(int  j=0;j<=16;j++)
                System.out.println(g.substring(0,j));
    }
}
