package Controlador;

public class Usuario{
	
	String id;
	String password;
	String tipo;
	
	public Usuario(String id, String password) {
		super();
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

}

class Secretaria extends Usuario{
			
	public Secretaria(String id, String password) {
			super(id, password);
			tipo = "Secretaria";
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

class Contador extends Usuario{
		
		public Contador(String id, String password) {
			super(id, password);
			tipo = "Contador";
		}
		public void CalcularTrabajo(){
			
		}

		public void Pagar(){
			
		}

		public void HistorialPagos(){
			
		}
}

