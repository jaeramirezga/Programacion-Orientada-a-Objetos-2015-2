
public class Empleado {
	// Creamos una Clase llamada empleado
	
	private String nombre;
	// Creamos una variable privada para el nombre del empleado
	private String apellido;
	// Creamos una variable privada para el apellido del empleado
	private double salario;
	// Creamos una variable privada para el salario del empleado
	private int cont = 0;
	// Creamos una variable privada para el conteo del año
	
	public Empleado ( String nombre , String apellido , double salario ){
		// Crearemos un constructor , y recibira 3 tipos de datos
		this.nombre = nombre;
		// Le pasaremos los valores recibidos, a la variable de la clase
		this.apellido = apellido;
		// Le pasaremos los valores recibidos, a la variable de la clase
		this.salario = salario;
		// Le pasaremos los valores recibidos, a la variable de la clase
	}
	
	public void setNombre(String xNombre){
		// Creamos un metodo de tipo Set, con el cual podremos modificar los valores de nombre
		nombre = xNombre;
		// Le pasaremos los valores recibidos, a la variable de la clase
	}
	
	public void setApellido(String xApellido){
		// Creamos un metodo de tipo Set, con el cual podremos modificar los valores de apellido
		apellido = xApellido;
		// Le pasaremos los valores recibidos, a la variable de la clase
	}
	
	public void setSalario(double xSalario){
		// Creamos un metodo de tipo Set, con el cual podremos modificar los valores de salario
		if( xSalario < 0){
			// Pondremos un condicional, por si nos dan un valor negativo, coloque el valor a salario como 0
			xSalario = 0;
		}
		salario = xSalario;
		// Le pasaremos los valores recibidos, a la variable de la clase
	}
	
	public String getNombre(){
		// Creamos un metodo de tipo Get, con el cual podremos devolver los valores de nombre
		return nombre;
		// Retornaremos los valores de nombre
	}
	
	public String getApellido(){
		// Creamos un metodo de tipo Get, con el cual podremos devolver los valores de apellido
		return apellido;
		// Retornaremos los valores de nombre
	}
	
	public void setCont(int xCont){
		// Creamos un metodo de tipo Set, con el cual podremos modificar los valores de Cont
		cont = xCont;
		// Le pasaremos los valores recibidos, a la variable de la clase
	}
	
	public double Salario(){
		// Crearemos un metodo publico en el cual debolveremos el valor del salario
		if (cont == 1){
			// Crearemos un condicional en el cual miraremos si cont es igual a uno
			return salario;
			// Retornaremos los valores de salario original si cont es 1
		}
		salario = (salario + salario*0.10);
	    // Al valor de salario lo modificaremos, sumandole el 10% por cada año
		return salario;
		// Retornaremos los valores del salario
	}
	
}
