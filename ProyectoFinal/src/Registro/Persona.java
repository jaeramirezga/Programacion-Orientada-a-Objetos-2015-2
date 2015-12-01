package Registro;

import java.io.FileOutputStream;
import java.util.Date;

public class Persona {
	private String Nombre, Apellido;
	private int ID, Edad, Fallas = 0;
	private Date HoraMaxEntrada, HoraMinSalida;
	private boolean Estado;
	private String Password;
	private String fichero;
	
	
	
	public Persona(String Nombre, String Apellido, int ID,int Edad, String Password){
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.ID = ID;
		this.Edad = Edad;
		this.Password = Password;
	}
	public void setNombre(String xNombre){
		Nombre = xNombre;
	}
	public void setApellido(String xApellido){
		Apellido = xApellido;
	}
	public void setID(int xID){
		ID = xID;
	}
	public void setEdad(int xEdad){
		Edad = xEdad;
	}
	public void setPassword(String xPassword){
		Password = xPassword;
	}
	public String getNombre(){
		return Nombre;
	}
	public String getApellido(){
		return Apellido;
	}
	public int getID(){
		return ID;
	}
	public int getEdad(){
		return Edad;
	}
	public String getPassword(){
		return Password;
	}
	
}

public class Jefe extends Persona {
	public Jefe(String JNombre, String JApellido, int JID, int JEdad, String JPassword){
		super(JNombre, JApellido, JID, JEdad, JPassword);
	}
	
}

public class Trabajador extends Persona {
	public Trabajador(String TNombre, String TApellido, int TID, int TEdad, String TPassword){
		super(TNombre, TApellido, TID, TEdad, TPassword);
	}
	
}
public class Empleado extends Persona {
	public Empleado
	(String ENombre, String EApellido, int EID, int EEdad, String EPassword){
		super(ENombre, EApellido, EID, EEdad, EPassword);
	}
	
}