package Controlador;
import Controlador.Funcionario;

class Secretaria {
	String id;
	String password;
	
	public Secretaria(String id, String password) {
		this.id = id;
		this.password = password;
		
		}
	public void setid(String Id){
		id = Id;
	}
	
	public void setpassword(String Password){
		password = Password;
	}
	
	
	public String getid(){
		return id;
	}
	public String getpassword(){
		return password;
	}
		
	public void RegistroDeEntrada(Funcionario x, double horadeentrada){
		x.sethoradeentrada(horadeentrada);
	}
	public void RegistroDeSalida(Funcionario x, double horadesalida){
		x.sethoradesalida(horadesalida);
	}
	
	public void NuevoUsurio(){
		
	}
	public void BorrarUsurio(){
		
	}
	public void HistorialEntrada(){
		
	}
	public void HistorialSalida(){
		
	}
	public void CalcularTrabajo(){
		
	}

	public void Pagar(){
		
	}

	public void HistorialPagos(){
		
	}
	
}

