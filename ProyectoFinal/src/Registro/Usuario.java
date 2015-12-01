package Registro;

import java.util.Date;

public class Usuario {
	private String Nombre, Apellido;
	private int ID, Edad, Fallas = 0;
	private Date HoraMaxEntrada, HoraMinSalida;
	private boolean Estado;
	private String Login;
	private String Password;
	private String fichero;
	
	public Usuario(){
		
	}
	
	public Usuario(String Nombre, String Apellido, int ID,int Edad,String Login, String Password){
		
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.ID = ID;
		this.Edad = Edad;
		this.Login = Login;
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
	public void setLogin(String xLogin){
		Login = xLogin;
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
	public String getLogin(){
		return Login;
	}
}

public class Secretaria extends Usuario{
	public Secretaria(String SNombre, String SApellido, int SID,int SEdad, String SPassword, String SLogin){
		super (SNombre,SApellido,SID,SEdad,SPassword, SLogin);
	}
	
	public void RegistroDeEntrada(){
		
	}
	public void RegistroDeSalida(){
		
	}
	public void NuevoUsurio(){
		
	}
	public void BorrarUsurio(){
		
	}
	public void HistorialEntrada(){
		
	}
	public void HistorialSalida(){
		
	}
		
}
public class Contador extends Usuario{
	public Contador(String CNombre, String CApellido, int CID,int CEdad, String CPassword, String CLogin){
		super (CNombre,CApellido,CID,CEdad,CPassword, CLogin);
	}
	

	public void CalcularTrabajo(){
		
	}

	public void Pagar(){
		
	}

	public void HistorialPagos(){
		
	}
}

