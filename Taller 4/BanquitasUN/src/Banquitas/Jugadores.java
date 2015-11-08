package Banquitas;

public class Jugadores {

		String nombre;
		String posicion;
		int edad;
		int dorsal;
		int goles;		
		String habilidad; 		


public String getNombre(){
	return nombre;
}
public void setNombre(String nombre){
	this.nombre= nombre;
}
public String getPosicion(){
	return posicion;
}
public void setPosicion(String posicion){
	this.posicion= posicion;
}
public int getEdad(){
	return edad;
}
public void setEdad(int edad){
	this.edad=edad;
}
public int getDorsal(){
	return dorsal;
}
public void setDorsal(int dorsal){
	this.dorsal= dorsal;
}
public int getGoles(){
	return goles;
}
public void setGoles(int goles){
	this.goles= goles;
}
public String getHabilidad(){
	return habilidad;
}
public void setHabilidad(String habilidad){
	this.habilidad= habilidad;
}

public void mostrarJugador(){
	
	System.out.println("Su nombre es: "+ nombre);
	System.out.println("Su posicion es: "+ posicion);
	System.out.println("Su edad es: "+ edad+" años");
	System.out.println("Su dorsal es el numero: "+ dorsal);
	System.out.println("Su habilidad es: "+ habilidad);
	System.out.println("Sus goles son: "+ goles);
	
}

public Jugadores(String nombre, String posicion, int edad, int dorsal, int goles, String habilidad){
	
	this.nombre= nombre;
	this.posicion= posicion;
	this.edad=edad;
	this.dorsal=dorsal;
	this.goles= goles;	
	this.habilidad= habilidad;

}
public Jugadores(){
	
}
}

