package array;

public class MatrixOperation 
{
	void addition()
	{
		int a[][]= {{1,2},
			    	{2,3}};
		
		int b[][]= {{1,2},
					{2,3}};
		int c[][]= new int[3][2];
		
		//Addition
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}System.out.println();
		
		//Subtraction
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]= a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}System.out.println();
		
		//Multiplication
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				for(int k=0;k<a[i].length;k++)
				{
					c[i][j]= c[i][j]+(a[i][k]*b[k][j]);
				}//System.out.println();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}System.out.println();
//		for(int k[]: c)
//		{
//			for(int j: k)
//			System.out.print(j+" ");
//		}
		//Scalar Multiplication
		double d[][]= {{1,2,4},
		    		   {2,3,6},
		    		   {2,3,5}};
		double e[][]= new double[3][3];
		double scalarValue= 16/8;
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				e[i][j]= (scalarValue)*d[i][j];
				System.out.print(e[i][j]+" | ");
			}System.out.println();
		}
	} 
	public static void main(String[] args) 
	{
		MatrixOperation obj= new MatrixOperation();
		obj.addition();
	}

}