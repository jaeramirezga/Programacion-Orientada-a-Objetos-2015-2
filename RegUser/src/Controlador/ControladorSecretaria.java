package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorSecretaria {
	
	private VistaSecretaria theView;
	private ModeloSecretaria theModel;
	public ControladorSecretaria(VistaSecretaria theView,ModeloSecretaria theModel)
	{
		this.theView = theView;
		this.theModel = theModel;
		this.theView.botonRegEntra(new RegEntraListener());
		this.theView.botonRegsalida(new RegSalidaListener());
		this.theView.botonHisEntra(new HisEntradaListener());
		this.theView.botonHisSalida(new HisSalidaListener());
	}	
		public class RegEntraListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				theView.CambioRegEntra();
				
			}
		}
		public class RegSalidaListener implements ActionListener {
				
			public void actionPerformed(ActionEvent e) {
					
				theView.CambioRegSalida();
					
			}
		}
		public class HisEntradaListener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
					
				theView.CambioHisEntrada();
					
			}
		}
		public class HisSalidaListener implements ActionListener {
					
					public void actionPerformed(ActionEvent e) {
							
						theView.CambioHisSalida();
							
					}
				}
	
}

