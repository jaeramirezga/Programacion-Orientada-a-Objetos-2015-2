package Controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class VistaSecretaria extends JFrame {
	
	//Secretaria Inicio
	private JPanel SecrePanel = new JPanel();
	private JLabel reguser = new JLabel("RegUser");
	private JLabel reguser2 = new JLabel("RegUser");
	private JButton botonRegEntra = new JButton("Registro Entrada");
	private JButton botonRegSalida = new JButton("Registro Salida");
	private JButton botonHisEntra = new JButton("Historial Entrada");
	private JButton botonHisSalida = new JButton("Historial Salida");
	private JButton botonHisPago = new JButton("Historial Pago");
	//Registro Entrada
	private JButton RegBoton = new JButton("Registrar");
	private JLabel RegistroTitle = new JLabel("Registro de Entrada");
	private JLabel RegistroTitle2 = new JLabel("Registro de Entrada");
	private JTextField TextID = new JTextField();
	private JTextField TextHora = new JTextField();
	private JLabel labelID = new JLabel("Identificacion");
	private JLabel labelHEntrada = new JLabel("Hora de Entrada");
	//Registro Salida
	private JLabel labelRegSalida = new JLabel("Registro de Salida");
	private JLabel labelRegSalida1 = new JLabel("Registro de Salida");
	private JTextField TextIDSalida = new JTextField();
	private JTextField TextHoraSalida = new JTextField();
	private JLabel labelIDSalida = new JLabel("Identificacion");
	private JLabel labelHSalida = new JLabel("Hora de Salida");
	private JButton RegBotonSalida = new JButton("Registrar");
	//Historial Entrada
	private JTable TablaRegistroEntrada = new JTable();
	private JLabel LabelHisEntrada = new JLabel("Historial de Salida");
	private JLabel LabelHisEntrada2 = new JLabel("Historial de Salida");
	//Historial Salida
	private JTable TablaRegistroSalida = new JTable();
	private JLabel LabelHisSalida = new JLabel("Historial de Salida");
	private JLabel LabelHisSalida2 = new JLabel("Historial de Salida");
	//
	public VistaSecretaria() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(15, 5, 800, 600);
		setTitle("RegUser | Secretaria");
		SecrePanel.setLayout(null);
		SecrePanel.setBackground(new Color(51, 51, 255));
		SecrePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Botones Ventana Principal Secretaria
		SecrePanel.add(reguser);
		reguser.setForeground(Color.WHITE);
		reguser.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 83));
		reguser.setBounds(234, 12, 351, 97);
		
		SecrePanel.add(reguser2);
		reguser2.setForeground(Color.BLACK);
		reguser2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 85));
		reguser2.setBounds(224, 11, 351, 97);
		
		SecrePanel.add(botonRegEntra);
		botonRegEntra.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonRegEntra.setBounds(104, 131, 186, 40);
		
		SecrePanel.add(botonRegSalida);	
		botonRegSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonRegSalida.setBounds(104, 182, 186, 40);
		
		SecrePanel.add(botonHisEntra);
		botonHisEntra.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonHisEntra.setBounds(300, 131, 186, 40);
		
		SecrePanel.add(botonHisSalida);
		botonHisSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonHisSalida.setBounds(300, 182, 186, 40);
		
		SecrePanel.add(botonHisPago);
		botonHisPago.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		botonHisPago.setBounds(496, 131, 186, 40);
		
		
		//Botones Ventana Registro Entrada
		SecrePanel.add(RegBoton);		
		RegBoton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		RegBoton.setBounds(488, 313, 177, 34);
		RegBoton.setVisible(false);
		
		SecrePanel.add(RegistroTitle);
		RegistroTitle.setForeground(Color.WHITE);
		RegistroTitle.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		RegistroTitle.setBounds(244, 120, 351, 97);
		RegistroTitle.setVisible(false);
		
		SecrePanel.add(RegistroTitle2);
		RegistroTitle2.setForeground(Color.BLACK);
		RegistroTitle2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		RegistroTitle2.setBounds(238, 120, 351, 97);
		RegistroTitle2.setVisible(false);
		
		SecrePanel.add(TextID);
		TextID.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		TextID.setBounds(124, 243, 340, 34);
		TextID.setVisible(false);
			
		SecrePanel.add(TextHora);
		TextHora.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		TextHora.setBounds(125, 313, 340, 34);
		TextHora.setVisible(false);
		
		SecrePanel.add(labelID);
		labelID.setForeground(new Color(0, 0, 0));
		labelID.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		labelID.setBounds(125, 218, 130, 14);
		labelID.setVisible(false);		
		
		SecrePanel.add(labelHEntrada);
		labelHEntrada.setForeground(new Color(0, 0, 0));
		labelHEntrada.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		labelHEntrada.setBounds(126, 288, 159, 14);
		labelHEntrada.setVisible(false);
		
		//Botones Ventana Registro Salida
		
		SecrePanel.add(labelRegSalida);
		labelRegSalida.setForeground(Color.WHITE);
		labelRegSalida.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		labelRegSalida.setBounds(244, 120, 351, 97);
		labelRegSalida.setVisible(false);
		
		SecrePanel.add(labelRegSalida1);		
		labelRegSalida1.setForeground(Color.BLACK);
		labelRegSalida1.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		labelRegSalida1.setBounds(238, 120, 351, 97);
		labelRegSalida1.setVisible(false);
		
		SecrePanel.add(TextIDSalida);
		TextIDSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		TextIDSalida.setBounds(124, 243, 340, 34);
		TextIDSalida.setVisible(false);
			
		SecrePanel.add(TextHoraSalida);
		TextHoraSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		TextHoraSalida.setBounds(125, 313, 340, 34);
		TextHoraSalida.setVisible(false);
		
		SecrePanel.add(labelIDSalida);
		labelIDSalida.setForeground(new Color(0, 0, 0));
		labelIDSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		labelIDSalida.setBounds(125, 218, 130, 14);
		labelIDSalida.setVisible(false);		
		
		SecrePanel.add(labelHSalida);
		labelHSalida.setForeground(new Color(0, 0, 0));
		labelHSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		labelHSalida.setBounds(126, 288, 159, 14);
		labelHSalida.setVisible(false);
		
		SecrePanel.add(RegBotonSalida);		
		RegBotonSalida.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		RegBotonSalida.setBounds(488, 313, 177, 34);
		RegBotonSalida.setVisible(false);
		
		// Historial Entrada
		
		SecrePanel.add(TablaRegistroEntrada);
		TablaRegistroEntrada.setModel(new DefaultTableModel(
			new Object[][] {
				{"No.", "Nombre", "Apellido", "Identificacion", "Tipo Empleado", "Hora de Entrada"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Nombre", "Apellido", "Identificacion", "Tipo Empleado", "Hora de Entrada"
			}
		));
		TablaRegistroEntrada.getColumnModel().getColumn(0).setPreferredWidth(29);
		TablaRegistroEntrada.getColumnModel().getColumn(1).setPreferredWidth(123);
		TablaRegistroEntrada.getColumnModel().getColumn(2).setPreferredWidth(138);
		TablaRegistroEntrada.getColumnModel().getColumn(3).setPreferredWidth(88);
		TablaRegistroEntrada.getColumnModel().getColumn(4).setPreferredWidth(86);
		TablaRegistroEntrada.getColumnModel().getColumn(5).setPreferredWidth(94);
		TablaRegistroEntrada.setToolTipText("");
		TablaRegistroEntrada.setBounds(74, 213, 637, 320);
		TablaRegistroEntrada.setVisible(false);
		
		SecrePanel.add(LabelHisEntrada);
		LabelHisEntrada.setForeground(Color.WHITE);
		LabelHisEntrada.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		LabelHisEntrada.setBounds(244, 120, 351, 97);
		LabelHisEntrada.setVisible(false);
		
		SecrePanel.add(LabelHisEntrada2);
		LabelHisEntrada2.setForeground(Color.BLACK);
		LabelHisEntrada2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		LabelHisEntrada2.setBounds(238, 120, 351, 97);		
		LabelHisEntrada2.setVisible(false);
		
		//Historial Salida
		
		SecrePanel.add(TablaRegistroSalida);
		TablaRegistroSalida.setModel(new DefaultTableModel(
			new Object[][] {
				{"No.", "Nombre", "Apellido", "Identificacion", "Tipo Empleado", "Hora de Salida"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"No.", "Nombre", "Apellido", "Identificacion", "Tipo Empleado", "Hora de Salida"
			}
		));
		TablaRegistroSalida.getColumnModel().getColumn(0).setPreferredWidth(29);
		TablaRegistroSalida.getColumnModel().getColumn(1).setPreferredWidth(123);
		TablaRegistroSalida.getColumnModel().getColumn(2).setPreferredWidth(138);
		TablaRegistroSalida.getColumnModel().getColumn(3).setPreferredWidth(88);
		TablaRegistroSalida.getColumnModel().getColumn(4).setPreferredWidth(86);
		TablaRegistroSalida.getColumnModel().getColumn(5).setPreferredWidth(94);
		TablaRegistroSalida.setToolTipText("");
		TablaRegistroSalida.setBounds(74, 213, 637, 320);
		TablaRegistroSalida.setVisible(false);
		
		SecrePanel.add(LabelHisSalida);
		LabelHisSalida.setForeground(Color.WHITE);
		LabelHisSalida.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 32));
		LabelHisSalida.setBounds(244, 120, 351, 97);
		LabelHisSalida.setVisible(false);
		
		SecrePanel.add(LabelHisSalida2);
		LabelHisSalida2.setForeground(Color.BLACK);
		LabelHisSalida2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 33));
		LabelHisSalida2.setBounds(238, 120, 351, 97);		
		LabelHisSalida2.setVisible(false);
		
		this.add(SecrePanel);
						
	}
	
	public void CambioRegEntra(){
		
		botonRegEntra.setVisible(false);
		botonRegSalida.setVisible(false);
		botonHisEntra.setVisible(false);
		botonHisSalida.setVisible(false);
		botonHisPago.setVisible(false);
		RegBoton.setVisible(true);
		RegistroTitle.setVisible(true);
		RegistroTitle2.setVisible(true);
		TextID.setVisible(true);
		TextHora.setVisible(true);
		labelID.setVisible(true);	
		labelHEntrada.setVisible(true);
	}
	
	public void CambioRegSalida(){
		
		botonRegEntra.setVisible(false);
		botonRegSalida.setVisible(false);
		botonHisEntra.setVisible(false);
		botonHisSalida.setVisible(false);
		botonHisPago.setVisible(false);
		labelRegSalida.setVisible(true);
		labelRegSalida1.setVisible(true);
		TextIDSalida.setVisible(true);
		TextHoraSalida.setVisible(true);
		labelIDSalida.setVisible(true);	
		labelHSalida.setVisible(true);
		RegBotonSalida.setVisible(true);
	}
	
	public void CambioHisEntrada(){
			
			botonRegEntra.setVisible(false);
			botonRegSalida.setVisible(false);
			botonHisEntra.setVisible(false);
			botonHisSalida.setVisible(false);
			botonHisPago.setVisible(false);
			TablaRegistroEntrada.setVisible(true);
			LabelHisEntrada.setVisible(true);
			LabelHisEntrada2.setVisible(true);
		}
	
	public void CambioHisSalida(){
		
		botonRegEntra.setVisible(false);
		botonRegSalida.setVisible(false);
		botonHisEntra.setVisible(false);
		botonHisSalida.setVisible(false);
		botonHisPago.setVisible(false);
		TablaRegistroSalida.setVisible(true);
		LabelHisSalida.setVisible(true);
		LabelHisSalida2.setVisible(true);
	}

	void botonRegEntra( ActionListener listener )
	{
		this.botonRegEntra.addActionListener(listener);
	}
	void botonRegsalida( ActionListener listener )
	{
		this.botonRegSalida.addActionListener(listener);
	}
	void botonHisEntra( ActionListener listener )
	{
		this.botonHisEntra.addActionListener(listener);
	}
	void botonHisSalida( ActionListener listener )
	{
		this.botonHisSalida.addActionListener(listener);
	}
	void botonHisPago( ActionListener listener )
	{
		this.botonHisPago.addActionListener(listener);
	}
	void displayErrorMessage( String errorMsg )
	{
		JOptionPane.showMessageDialog(this, errorMsg);
	}
	
}