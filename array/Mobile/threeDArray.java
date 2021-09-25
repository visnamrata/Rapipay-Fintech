package com.array.Mobile;
import java.util.Random;
public class threeDArray 
{
  public static void main(String arg[])
  {
	  Random random=new Random();
	  
	  int arr[][][]=new int[2][2][3];
	  
	  for(int i=0;i<2;++i)
	  {
		  for(int j=0;j<2;++j)
		  {
			  for(int k=0;k<3;++k)
			  {
				  arr[i][j][k]=random.nextInt(100);
			  }
		  }
	  }
	  
	  for(int i=0;i<2;++i)
	  {
		  for(int j=0;j<2;++j)
		  {
			  for(int k=0;k<3;++k)
			  {
				 System.out.println(arr[i][j][k]+" ");
			  }
		  }
	  }
  }
}
