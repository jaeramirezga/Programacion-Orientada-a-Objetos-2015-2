package Banquitas;

public class Jugadores {

		String nombre;
		String equipo;
		String posicion;
		int edad;
		int dorsal;
		int goles;		
		String habilidad = ""; 		


public String getNombre(){
	return nombre;
}
public void setNombre(String nombre){
	this.nombre= nombre;
}
public String getEquipo(){
	return equipo;
}
public void setEquipo(String nombre){
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
	System.out.println("Su equipo es: "+ equipo);
	System.out.println("Su posicion es: "+ posicion);
	System.out.println("Su edad es: "+ edad);
	System.out.println("Su dorsal es: "+ dorsal);
	System.out.println("Su goles es: "+ goles);
	System.out.println("Su habilidad es: "+ habilidad);
}

public Jugadores(){
	
	this.nombre= nombre;
	this.equipo= equipo;
	this.posicion= posicion;
	this.edad=edad;
	this.dorsal=dorsal;
	this.goles= goles;	
	this.habilidad= habilidad;

}
}

