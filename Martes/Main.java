import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		System.out.println("---->>>>>Bienvenido a su calcu<<<<<-----");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite el NUMERO deseado:");
		System.out.println("1.SUMA");
		System.out.println("2.RESTA");
		System.out.println("3.MULTIPLICACION");
		System.out.println("4.DIVISION");
		System.out.println("5.Salir");
		int n;
		n = entrada.nextInt();
	

	while (n != 5) {
		NumCompl n1 = new NumCompl();
		NumCompl n2 = new NumCompl();
		NumCompl aux = new NumCompl();
		System.out.println("Ingrese el primer numero real");
		n1.real = entrada.nextInt();
		System.out.println("Ingrese el primer numero imaginario");
		n1.img = entrada.nextInt();
		System.out.println("Ingrese el segundo numero real");
		n2.real = entrada.nextInt();
		System.out.println("Ingrese el segundo numero imaginario");
		n2.img = entrada.nextInt();

		switch (n) {
			case 1:
				System.out.print("La suma es igual a: ");
				aux = NumCompl.sumar(n1,n2);
				System.out.printf("%2f, %2f", aux.real,aux.img);
			case 2:
				System.out.println("LA resta es igual a: ");
				aux = NumCompl.restar(n1,n2);
				System.out.printf("%2f, %2f", aux.real,aux.img);


		}
		

	}
}
}