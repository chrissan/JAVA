import java.util.Random;

public class Arreglo {
	
	public static void main(String[] args) {
	Random al = new Random(System.currentTimeMillis());
	int arre1[] = {1,2,3,4,5};
	int arre2[][] = new int [3][3];
	int n=10;
	int suma = 0;
	
	for (int i=0; i<3 ; i++) {
		for (int j=0;j<3; j++) 
		{
			arre2[i][j]=al.nextInt(100);			
		}
	}

	for (int i=0; i<3 ; i++) {
		for (int j=0;j<3; j++) 
		{
			System.out.printf("%d ", arre2[i][j]);			
		}
		System.out.println();
	}

	System.out.println();

	for (int i=0; i<3 ; i++) {
		for (int j=0;j<3; j++) 
		{
			System.out.printf("%d ", arre2[j][i]);			
		}
		System.out.println();
	}
/*
	for (int i=0; i<n ; i++) {
		System.out.println(arre2[i]);
	}	

	for ( int e:arre2 ) // e va a tomar el valor y no puede tener un valor inicializado. 
	{	
		suma = suma + e;	
	}
		System.out.println(suma);
		System.out.println(arre2.length);
	*/
	}
}