
public class Empleado {
	
	private String nombre;
	private String apellido;
	private double salario;
	private int cont = 0;
	
	public Empleado ( String nombre , String apellido , double salario ){
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}
	
	public void setNombre(String xNombre){
		nombre = xNombre;
	}
	
	public void setApellido(String xApellido){
		apellido = xApellido;
	}
	
	public void setSalario(double xSalario){
		if( xSalario < 0){
			xSalario = 0;
		}
		salario = xSalario;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public void setCont(int xCont){
		cont = xCont;
	}
	
	public double Salario(){
		if (cont == 1){
			return salario;
		}
		salario = (salario + salario*0.10);
		return salario;
	}
	
}
