public class MyClass {
    public static void main(String args[]) {
        int n=5;
      for(int i=1;i<=n;i++)
      {
          for(int j=n-i;j>=0;j--)
          {
              System.out.print(" ");
          }
          for(int k=1;k<=(2*i)-1;k++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
      for(int i=1;i<=n-1;i++)
      {
        for(int j=0;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=2*(n-i)-1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
