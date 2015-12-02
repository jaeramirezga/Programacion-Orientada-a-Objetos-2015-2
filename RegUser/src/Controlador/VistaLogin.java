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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VistaLogin extends JFrame {
	
	private JPanel calcPanel = new JPanel();
	private JLabel reguser = new JLabel("RegUser");
	private JLabel reguser2 = new JLabel("RegUser");
	private JLabel usuario = new JLabel("Usuario");
	private JTextField user = new JTextField(10);
	private JLabel contrasena = new JLabel("Contraseña");
	private JPasswordField pass = new JPasswordField();
	private JButton enviar = new JButton("Enviar");
	
	
	public VistaLogin() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(15, 5, 800, 600);
		setTitle("RegUser");
		calcPanel.setLayout(null);
		calcPanel.setBackground(new Color(51, 51, 255));
		calcPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		calcPanel.add(reguser);
		reguser.setForeground(Color.WHITE);
		reguser.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 83));
		reguser.setBounds(230, 76, 351, 97);	
		
		calcPanel.add(reguser2);
		reguser2.setForeground(Color.BLACK);
		reguser2.setFont(new Font("Impact", Font.BOLD | Font.ITALIC, 85));
		reguser2.setBounds(220, 75, 351, 97);
		
		calcPanel.add(usuario);
		usuario.setForeground(Color.WHITE);
		usuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		usuario.setBounds(242, 183, 122, 28);
		
		calcPanel.add(user);
		user.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		user.setBounds(242, 222, 300, 38);
		
		calcPanel.add(contrasena);
		contrasena.setForeground(Color.WHITE);
		contrasena.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		contrasena.setBounds(242, 286, 171, 28);
		
		calcPanel.add(pass);
		pass.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		pass.setBounds(242, 325, 300, 38);
		
		calcPanel.add(enviar);
		enviar.setFont(new Font("Tahoma", Font.BOLD, 25));
		enviar.setBounds(300, 393, 186, 49);
		this.add(calcPanel);
						
	}
	public String user()
	{
		return user.getText();
	}
	public String pass()
	{
		return pass.getText();
	}
	void enviar( ActionListener listener )
	{
		this.enviar.addActionListener(listener);
	}	
	void displayErrorMessage( String errorMsg )
	{
		JOptionPane.showMessageDialog(this, errorMsg);
	}
	
}