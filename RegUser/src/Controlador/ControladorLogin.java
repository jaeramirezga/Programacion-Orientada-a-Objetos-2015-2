package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorLogin {
	private VistaLogin theView;
	private ModeloLogin theModel;
	public ControladorLogin(VistaLogin theView,	ModeloLogin theModel)
	{
		this.theView = theView;
		this.theModel = theModel;
		this.theView.enviar(new MyListener());
	
	}
	public class MyListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			theView.setVisible(false);
			VistaSecretaria vs = new VistaSecretaria();
			vs.setVisible(true);
			ModeloSecretaria model = new ModeloSecretaria(); //Model.getInstance(); 
			ControladorSecretaria control = new ControladorSecretaria(vs, model);
			
		}
	}
	
}
