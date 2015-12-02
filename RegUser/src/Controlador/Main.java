package Controlador;

public class Main {

	public static void main(String[] args) {
		VistaLogin view = new VistaLogin();
		ModeloLogin model = new ModeloLogin(); //Model.getInstance(); 
		ControladorLogin control = new ControladorLogin (view,model);
		view.setVisible(true);

	}

}
