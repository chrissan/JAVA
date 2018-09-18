public class tarea1 {
	private String direccion;
	private float dinero;
	private static int cont_prod;
	private static int cont_empl;

	public class producto
	{
		public String nombre_prod;
		public int precio_prod;

		public producto(String nombre, int precio)
		{
			this.nombre_prod = nombre;
			this.precio_prod = precio;
			cont_prod++;
		}

		public int getCont()
		{
			return cont_prod;
		}
	}

	public class empleado
	{
		public String nombre_emp;
		public int precio_emp;
		public empleado(String nombre, int precio)
		{
			this.nombre_emp = nombre;
			this.precio_emp = precio;
			cont_empl++;
		}
		public int getCont()
		{
			return cont_empl;
		}
	}


	public tarea1(String direccion, float dinero)
	{
		this.direccion=direccion;
		this.dinero=dinero;
		producto p1 = new producto("leche",15);
		producto p2 = new producto("agua",10);
		producto p3 = new producto("chile",25);
		producto p4 = new producto("cerveza",35);

		empleado e1 = new pro

	}

}