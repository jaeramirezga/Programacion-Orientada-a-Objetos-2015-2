package Controlador;

public class Usuario{
	
	int id;
	String password;
	String tipo;
	
	public Usuario(int id, String password, String tipo) {
		super();
		this.id = id;
		this.password = password;
		this.tipo = tipo;
	}

}

	class Secretaria extends Usuario{
			
	public Secretaria(int id, String password, String tipo) {
			super(id, password,tipo);
		}

	class Contador extends Usuario{

		public Contador(int id, String password, String tipo) {
			super(id, password, tipo);
		}


	}
}
