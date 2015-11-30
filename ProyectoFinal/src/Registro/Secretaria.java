import java.util.Date;
package Registro;

public class Secretaria {
	
	public EvaluarInorOut(){
		if (Usuario.estado == 0){
			System.out.println("El usuario saldra");
			Usuario.estado = 1;
			Date Salida = new Date();
			break;
			
		}
		else if(Usuario.estado == 1){
			System.out.println(" El usuario entrara");
			Usurario.estado = 0;
			Date Entrada = new Date();
			
		} 
	}
	
	public EvaluarTardanza(){
		
		if (Entrada < Usuario.horamax){
			
		}
		
	}
	public Registrar Fallas(){
		
		Usuarios.fallas++
		
	}
}
