import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Matriz matriz_1 = new Matriz();
		Matriz matriz_2 = new Matriz();
		
		System.out.println("----->>>>>Bienvenido a su calculadora de matrizes<<<<<-----");
		int n=0;
		while (n != 6) {
		System.out.println("Digite el NUMERO deseado:");
		System.out.println("1.SUMA");
		System.out.println("2.RESTA");
		System.out.println("3.MULTIPLICACION");
		System.out.println("4.TRANSPOSICION");
		System.out.println("5.CAMBIAR VALORESK DE LA MATRIZ");
		System.out.println("6.Salir");
		n = entrada.nextInt();

		if (n!=6) 	
			{
				
			System.out.println("Desea ingrear valores a la tabla?\n[1]SI [2]NO");
			int m = entrada.nextInt();
				switch (m) 
				{
				case 1:	
					System.out.println("Indique el tamanno de la matriz (cuadrada)");

					matriz_1.n = entrada.nextInt();
					matriz_2.n = matriz_1.n;

					System.out.println("Llene la matriz 1");
					Matriz.llenar(matriz_1);
					
					System.out.println();

					System.out.println("Llene la matriz 2");
					Matriz.llenar(matriz_2);
				break;
				}

			
			}

		switch (n) 
			{
			case 1:
				Matriz.sumar(matriz_1,matriz_2);
				break;
			case 2:
				Matriz.restar(matriz_1,matriz_2);
				break;
			case 3:
				Matriz.multi(matriz_1,matriz_2);
				break;
			case 4:
				System.out.println("Indique que matriz quiere transponer [1] o [2]:");
				int p = entrada.nextInt();
				switch (p) {
					case 1:
						Matriz.trans(matriz_1);
					case 2:
						Matriz.trans(matriz_2);
					default:
						System.out.println("Ingrese una opcion correcta");
				}
				break;
			case 5:
				System.out.println("Indique que matriz quiere modificar [1] o [2]:");
				int o = entrada.nextInt();
				switch (o) 
				{
					case 1:
						Matriz.llenar(matriz_1);
					case 2:
						Matriz.llenar(matriz_2);
					default:
						System.out.println("Ingrese una opcion correcta");
				}
				break;
			case 6:
				n=6;
				break;

			default:
				System.out.println("Ingrese una opcion corecta");



			}


		}
	}
}
