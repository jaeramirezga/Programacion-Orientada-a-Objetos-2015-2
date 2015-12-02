package Controlador;

import Controlador.Horas;

public class Funcionario {	

	String nombre;
	String apellido;
	double ID;
	int edad;
	int tipo;
	int fallas = 0;
	double horamaxin;
	double horaminout; 
	double numhoras;
	boolean estado;
	double horadeentrada;
	double horadesalida;
	double salarioporhoras;
	double horastrabajadas;
	
	public Funcionario(String nombre, String apellido, double iD, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		ID = iD;
		this.edad = edad;
		estado = false;
	}
	
	public void sethoradeentrada(double horaen){
		this.horadeentrada = horaen;
	}
	
	public double gethoradeentrada(){
		return horadeentrada;
	}
	
	public void sethoradesalida(double horadesal){
		this.horadesalida = horadesal;
	}
	
	public double gethoradesalida(){
		return horadesalida;
	}
	
	
	public void setestado(boolean estado){
		this.estado = estado;
	}
	
	public boolean getestado(){
		return estado;
	}
	
	public double horastrabajadas(){
		Horas horas = new Horas(horadeentrada,horadesalida);
		if (horadeentrada > horamaxin){
			fallas++;
		}
		if (horadeentrada< horaminout){
			fallas++;
		}
		if(horas.tiempoaldia(horadeentrada,horadesalida)<numhoras){
			fallas++;
		}
		horastrabajadas = horadesalida - horadeentrada;
		return horastrabajadas;
	}
	
}

class Empleado extends Funcionario {

	public Empleado(String nombre, String apellido, double iD, int edad, int tipo ) {
		super(nombre, apellido, iD, edad);
		horamaxin = 8.00;
		horaminout = 15.00;
		fallas = 0;
		estado = false;
		tipo = 1;
		numhoras = 7;
		salarioporhoras = 7000 ;
	}
	
}

class Trabajador extends Funcionario {

	public Trabajador(String nombre, String apellido, double iD, int edad, int tipo){
		super(nombre, apellido, iD, edad);
		horamaxin = 7.00;
		horaminout = 16.00;
		fallas = 0;
		estado = false;
		tipo = 2;
		numhoras = 9;
		salarioporhoras = 3500; 
		}



}


