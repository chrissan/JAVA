import java.util.Scanner;
public class Matriz {
	public int m1[][] = new int[50][50];
	//public int matriz_2[][] = new int[50][50];
	//public int matriz_3[][] = new int[50][50];
	public int i;
	public int j;
	public int n;
	public static Scanner llenar=new Scanner(System.in);


	public static void llenar (Matriz m){

		for (m.i=0; m.i<m.n ; m.i++)
		{
			for (m.j=0; m.j<m.n ; m.j++) 
			{
				System.out.printf("Ingrese el elemento[%d][%d]: ", m.i,m.j);
				m.m1[m.i][m.j]=llenar.nextInt();
			}
		}
	}

	public static void imprimir (Matriz m)
	{

	for (m.i=0; m.i<m.n ; m.i++) 
	{
		for (m.j=0; m.j<m.n ; m.j++) 
		{
			System.out.printf("%d ", m.m1[m.i][m.j]);			
		}
		System.out.println();
	}

	}

	public static void sumar (Matriz a, Matriz b)
	{
		Matriz c = new Matriz();
		for (a.i=0; a.i<a.n ; a.i++) 
		{
			for (a.j=0; a.j<a.n ; a.j++) 
			{
				c.m1[a.i][a.j] = a.m1[a.i][a.j] + b.m1[a.i][a.j];
				System.out.printf("%d ", c.m1[a.i][a.j]);			
			}
			System.out.println();
		}				
	}

	public static void restar (Matriz a, Matriz b)
	{
		Matriz c = new Matriz();
		for (a.i=0; a.i<a.n ; a.i++) 
		{
			for (a.j=0; a.j<a.n ; a.j++) 
			{
				c.m1[a.i][a.j] = a.m1[a.i][a.j] - b.m1[a.i][a.j];
				System.out.printf("%d ", c.m1[a.i][a.j]);			
			}
			System.out.println();
		}				
	}


	public static void multi (Matriz a, Matriz b)
	{
		Matriz c = new Matriz();
		c.n = a.n;
		int k = 0;
	
		for(a.i=0; a.i<a.n ; a.i++)
		{
			for(a.j=0; a.j<a.n ; a.j++)
			{
				for(k=0;k<a.n;k++)
				{
					c.m1[a.i][a.j]+=a.m1[a.i][k]*b.m1[k][a.j];
				}
			}
		}
		Matriz.imprimir(c);
	}

	public static void trans (Matriz a)
	{
		for (a.i=0; a.i<a.n ; a.i++) 
		{
			for (a.j=0;a.j<a.n; a.j++) 
			{
				System.out.printf("%d ", a.m1[a.j][a.i]);			
			}
			System.out.println();
		}
	}
	

}