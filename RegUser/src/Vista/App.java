package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class App extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					
				try {
					App f = new App();
					f.setSize(800,550);
					f.setVisible(true);
					Panel p= new Panel("/Vista/logo.jpg");
					f.getContentPane().add(p);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App() {
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(0, 153, 255));
		setTitle("RegUser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(102, 204, 204));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(64, 224, 208));
		panel.setBounds(261, 135, 258, 330);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUsuario.setBounds(24, 31, 77, 21);
		panel.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(24, 52, 211, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblContrasea.setBounds(24, 89, 105, 21);
		panel.add(lblContrasea);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(130, 161, 105, 34);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(24, 121, 211, 26);
		panel.add(passwordField);
		
		JLabel lblReguser_1 = new JLabel("RegUser");
		lblReguser_1.setForeground(new Color(255, 255, 255));
		lblReguser_1.setFont(new Font("Impact", Font.BOLD, 94));
		lblReguser_1.setBounds(213, 31, 360, 103);
		getContentPane().add(lblReguser_1);
		
		JLabel lblReguser = new JLabel("RegUser");
		lblReguser.setBounds(208, 32, 365, 103);
		getContentPane().add(lblReguser);
		lblReguser.setForeground(new Color(0, 0, 0));
		lblReguser.setFont(new Font("Impact", Font.BOLD, 92));
	}
}
