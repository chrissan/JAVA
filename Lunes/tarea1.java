public class tarea1 {
	private String direccion;
	private float dinero;
	private static int cont_prod;
	private static int cont_empl;

	public static class producto
	{
		public String nombre_prod;
		public int precio_prod;

		public producto(String nombre, int precio)
		{
			this.nombre_prod = nombre;
			this.precio_prod = precio;
			cont_prod++;
		}

	}

	public static class empleado
	{
		public String nombre_emp;
		public int precio_emp;
		public empleado(String nombre, int precio)
		{
			this.nombre_emp = nombre;
			this.precio_emp = precio;
			cont_empl++;
		}
	}




}