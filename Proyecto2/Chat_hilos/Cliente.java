import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Cliente 
{
	private PrintStream ps;
	private String host;
	private int port;

	public void setHost(String host)
	{
		this.host = host;
	}	
	public void setPort(int port)
	{
		this.port = port;
	}
	public void conectar() throws IOException
	{
		Socket s = new Socket(host,port);
		ps = new PrintStream(s.getOutputStream());
	}

	public void enviar (String mensaje) throws IOException
	{
		ps.println(mensaje);
	}
	public void cerrar ()throws IOException
	{
		ps.close();
	}

	public void enviareleccion (char mensaje) throws IOException
	{
		ps.println(mensaje);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Cliente c = new Cliente();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Host: ");
		c.setHost(teclado.readLine());
		System.out.println("Puerto: ");
		c.setPort(Integer.parseInt(teclado.readLine()));
		c.conectar();
		String str = "";
		char ch;

		System.out.println("Ingrese su nombre: ");
		str = teclado.readLine();
		c.enviar(str);
		System.out.println("Para empezar ingrese add");
		str = teclado.readLine();
		
		if(str.equals("add"));
		{
				c.enviar(str);		

				while(!str.equals("salir"))
				{
				System.out.println("Que desea hacer?");
				System.out.println("'lista' para imprimir todos los conectados");
				System.out.println("'chat' para iniciar sesion en el chat");
				System.out.println("'salir' para salir");
				str = teclado.readLine();
				c.enviar(str);
				if(str.equals("chat"))
					{
								while(!str.equals("adios"))
								{
									System.out.println("Mensaje: ");
									str = teclado.readLine();
									c.enviar(str);
								}
					}
				}
		}

		c.cerrar();
	}
}