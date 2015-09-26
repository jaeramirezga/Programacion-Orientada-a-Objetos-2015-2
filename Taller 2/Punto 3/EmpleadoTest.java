

public class EmpleadoTest {
	// Crearemos una clase llamada EmpleadoTest
    
	public static void main(String[] args) {
		// Crearemos nuestro main
		
		Empleado No1 = new Empleado( "Juan" , "Ramirez" , 12300);
		// Crearemos un objeto llamado No1, y le pasaremos unos valores con los cuales lo instanciaremos
		Empleado No2 = new Empleado( "Daniela" , "Ramirez" , 5432);
		// Crearemos un objeto llamado No2, y le pasaremos unos valores con los cuales lo instanciaremos
		Empleado No3 = new Empleado( "Juan" , "Contreras" , 1000000);
		// Crearemos un objeto llamado No3, y le pasaremos unos valores con los cuales lo instanciaremos
		Empleado No4 = new Empleado( "Andres" , "Corson" , 5000000);
		// Crearemos un objeto llamado No4, y le pasaremos unos valores con los cuales lo instanciaremos
		Empleado No5 = new Empleado( "Augusto" , "Ramirez" , 3000000);
		// Crearemos un objeto llamado No5, y le pasaremos unos valores con los cuales lo instanciaremos
		
		for (int i = 1 ; i < 5 ; i++){
			// Crearemos un ciclo de tipo for, el cual utilizaremos para pasar los valores a Cont en la clase empleado
			No1.setCont(i);
			// Le pasaremos a No1 los valores de i, variable del for
			No2.setCont(i);
			// Le pasaremos a No2 los valores de i, variable del for
			No3.setCont(i);
			// Le pasaremos a No3 los valores de i, variable del for
			No4.setCont(i);
			// Le pasaremos a No4 los valores de i, variable del for
			No5.setCont(i);
			// Le pasaremos a No5 los valores de i, variable del for
			
			System.out.println("Año: " + i);
			// Imprimiremos el numero del año
			System.out.println("Empleado 1: "+ No1.getNombre() + " " + No1.getApellido() + ", Salario anual: " + No1.Salario() );
			// Imprimimos el Empleado No1, con su nombre, su apellido y el valor del salario
			System.out.println("Empleado 2: "+ No2.getNombre() + " " + No2.getApellido() + ", Salario anual: " + No2.Salario() );
			// Imprimimos el Empleado No2, con su nombre, su apellido y el valor del salario
			System.out.println("Empleado 3: "+ No3.getNombre() + " " + No3.getApellido() + ", Salario anual: " + No3.Salario() );
			// Imprimimos el Empleado No3, con su nombre, su apellido y el valor del salario
			System.out.println("Empleado 4: "+ No4.getNombre() + " " + No4.getApellido() + ", Salario anual: " + No4.Salario() );
			// Imprimimos el Empleado No4, con su nombre, su apellido y el valor del salario
			System.out.println("Empleado 5: "+ No5.getNombre() + " " + No5.getApellido() + ", Salario anual: " + No5.Salario() );
			// Imprimimos el Empleado No5, con su nombre, su apellido y el valor del salario
			System.out.println();
			// Imprimiremos una linea en blanco
		}
	}

}