

public class EmpleadoTest {
    
	public static void main(String[] args) {
		
		Empleado No1 = new Empleado( "Juan" , "Ramirez" , 12300);
		Empleado No2 = new Empleado( "Daniela" , "Ramirez" , 5432);
		Empleado No3 = new Empleado( "Juan" , "Contreras" , 1000000);
		Empleado No4 = new Empleado( "Andres" , "Corson" , 5000000);
		Empleado No5 = new Empleado( "Augusto" , "Ramirez" , 3000000);
		
		for (int i = 1 ; i < 5 ; i++){
			No1.setCont(i);
			No2.setCont(i);
			No3.setCont(i);
			No4.setCont(i);
			No5.setCont(i);
			
			System.out.println("Año: " + i);
			System.out.println("Empleado 1: "+ No1.getNombre() + " " + No1.getApellido() + ", Salario anual: " + No1.Salario() );
			System.out.println("Empleado 2: "+ No2.getNombre() + " " + No2.getApellido() + ", Salario anual: " + No2.Salario() );
			System.out.println("Empleado 3: "+ No3.getNombre() + " " + No3.getApellido() + ", Salario anual: " + No3.Salario() );
			System.out.println("Empleado 4: "+ No4.getNombre() + " " + No4.getApellido() + ", Salario anual: " + No4.Salario() );
			System.out.println("Empleado 5: "+ No5.getNombre() + " " + No5.getApellido() + ", Salario anual: " + No5.Salario() );
			System.out.println();
		}
	}

}