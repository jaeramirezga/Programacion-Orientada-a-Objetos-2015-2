package Modelo;

import Controlador.Funcionario;

public class Evaluador{
	
	
	public boolean EvaluarInorOut(Funcionario x){
		
		if (x.getestado() == false){
			return false;
			x.setestado(true);
			break;
		}
		
		if(x.getestado() == true){
			return true;
			x.setestado(false);
		}
	} 	
	
	public double EvaluarTardanza(){
		
	}
	
	public void RegistrarFallas(){
			
	}
}
