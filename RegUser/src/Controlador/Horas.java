package Controlador;
 

public class Horas {
	double horadeingreso;
	double horadesalida;
	double tiempotrabajado;
	
	public Horas (double horadeingreso, double horadesalida ){
		this.horadeingreso = horadeingreso;
		this.horadesalida = horadesalida;
	}
	
	public double tiempoaldia( double horadeingreso, double horadesalida){
		tiempotrabajado = horadesalida - horadeingreso;		
		return tiempotrabajado;
		
	}
		
	
}
