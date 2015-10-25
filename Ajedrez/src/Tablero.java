
public class Tablero {
   Ficha[][] nombre;
   int largo, ancho;
   
   public Tablero(int largo, int ancho) {
	   this.largo = largo;
	   this.ancho = ancho;
	   nombre = new Ficha[largo][ancho];
	   for( int i = 0 ; i < largo ; i++ ){
		   for( int j = 0 ; j < ancho ; j++ ){
			   nombre[i][j] = new Ficha( i, j , "nada","tipo" );
		   }
	   }
   }
   
   public void imprimir() {
	   for( int i = 0 ; i < largo ; i++ ){
		   for( int j = 0 ; j < ancho ; j++ ){
			    System.out.print("[");
			    System.out.print(nombre[i][j]);	   
				System.out.print("]");
		   }
		   System.out.println();
	   }
   }
   
   
   
   public void BorrarFicha ( int x, int y){
	   nombre [x][y] = new Ficha( x , y , "nada", "tipo");
   }
   
   public void MoverFicha( int x, int y, Ficha f){
	   nombre [x][y] = f;
   }
   
   public Ficha getFicha(int i, int j) {
	   return nombre[i][j];
   }
    
}
