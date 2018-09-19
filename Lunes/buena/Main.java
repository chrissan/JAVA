public class Main {
	public static void main(String[] args) {
		Tienda Electra = new Tienda("Ermita", 15000);
		Persona e1 = new Persona();
		e1.nombre = "luis";
		Persona e2 = new Persona("nombre", "puesto", 1500);
		Persona e3 = new Persona("nombre", "puesto", 1500);
		Persona e4 = new Persona("nombre", "puesto", 1500);

		Electra.setEmpleado(e1);
		Electra.setEmpleado(e2);
		Electra.setEmpleado(e3);
		Electra.setEmpleado(e4);

		System.out.println(Electra.getEmpl());
	}
}