package Controlador;


public class Funcionario {	

	String nombre;
	String apellido;
	double ID;
	int edad;
	int tipo;
	int fallas = 0;
	double horain = 7.35;
	boolean estado = false;
	
	public Funcionario(String nombre, String apellido, double iD, int edad, int tipo, int fallas, double horain,
			boolean estado) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		ID = iD;
		this.edad = edad;
		this.tipo = tipo;
		this.fallas = fallas;
		this.horain = horain;
		this.estado = estado;
	}

	
	
}

class Empleado extends Funcionario {

	public Empleado(String nombre, String apellido, double iD, int edad, int tipo, int fallas, double horain,
			boolean estado) {
		super(nombre, apellido, iD, edad, tipo, fallas, horain, estado);
		
	}

	

}

class Trabajador extends Funcionario {

	public Trabajador(String nombre, String apellido, double iD, int edad, int tipo, int fallas, double horain,
			boolean estado) {
		super(nombre, apellido, iD, edad, tipo, fallas, horain, estado);
	
	}

	

}


