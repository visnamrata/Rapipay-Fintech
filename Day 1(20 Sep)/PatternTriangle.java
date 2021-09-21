import java.util.Scanner;
class PatternTriangle
{
public static void main(String arg[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number to which pattern is to be printed: ");

  int n=sc.nextInt();
  int space=n-1;
int star=1;
  for(int i=1;i<=n;i++)
  {
	
    for(int j=1;j<=space;j++)
    System.out.print(" ");
    for(int k=1;k<=star;++k)
    System.out.print("*");
   space--;
   star+=2; 
   System.out.println();
  }
  
}
}

//1
//1 2
//1 2 3
//1 2 3 4
//