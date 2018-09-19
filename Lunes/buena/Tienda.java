public class Tienda {
	public String dir;
	public String nom;
	public int dinero;
	static int num_prod;
	static int num_empl;


	public Tienda(String dir, int dinero)
	{
		this.dir = dir;
		this.dinero = dinero;
	}


		public void setEmpleado(Persona empleado)
	{
		
		num_empl++;	
	}

	public static int getEmpl(){
		return num_empl;
	}

}