import java.util.Scanner;
class Pattern
{
public static void main(String arg[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number to which pattern is to be printed: ");

  int n=sc.nextInt();
  for(int i=1;i<=n;++i)
  {
    for(int j=1;j<=i;++j)
    System.out.print(j+"  ");
    System.out.println();
  }
  
}
}

//1
//1 2
//1 2 3
//1 2 3 4
//