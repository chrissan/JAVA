import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.ArrayList;


public class Servidor extends Thread 
{
	private String nombreCliente;
	public String ip;
	private BufferedReader entrada;
	public static ArrayList<String> direcciones = new ArrayList<String>();


	public Servidor(Socket s) throws IOException //al momento de hacer la instancia se ejecutan varios metodos 
	{
		entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
		ip = s.getInetAddress().getHostAddress();
		nombreCliente = s.getInetAddress().getCanonicalHostName();
		System.out.println("Conexion aceptada desde: "+s.getRemoteSocketAddress());
	}
	public String recibir () throws IOException
	{
		String str = entrada.readLine();
		return str;
	}

	public int eleccion () throws IOException
	{
		int sc = entrada.read();
		return sc;
	}

	public void cerrar () throws IOException
	{
		entrada.close();
	}

	//definimos las acciones del cliente para cada hilo
	@Override

	public void run ()
	{
		try{
			String str = "";
			String nombrehil;
			String nombre;
			int n = 1;
			Boolean bandera = true;
			while (bandera)
			{

				nombrehil = this.getName();
				nombre = recibir();
				str = recibir();
				if(str.equals("add"))
				{
					str = recibir();
					while (bandera)
					{
							if(str.equals("lista"))
							{
							for (int i = 0; i < 1 ; i++) 
								{
								 	System.out.println(direcciones.get(i));
								}

							}else if (str.equals("chat")) {
						
							while (!str.equals("salir"))
							{
							str = recibir();
							System.out.println(nombre+" "+ ip + " dice "+str);
							}						
							}else if (str.equals("salir")){
							bandera = false;

							}
							str = recibir();
					}
				}
				
				
			}
		}catch(IOException ex){
			System.out.println("Se cerro la conexion con "+nombreCliente);
		}finally{
			try{
				cerrar();
			}catch(IOException ex){}
		}	
	}
	public static void main(String[] args) throws IOException{
			ServerSocket ss;
			String str;
			ss = new ServerSocket(9998);
			System.out.println("Servidor aceptando conexiones en el puerto "+ss.getLocalPort());

			while(true)
			{
				Socket cliente = ss.accept();

				Servidor hilo = new Servidor (cliente);
				direcciones.add(hilo.ip);
				hilo.start();
			}

		
	}

}