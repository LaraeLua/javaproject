package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ViewController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField Usuario;
	private JPasswordField Senha;
	private ViewController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		
		controller = new ViewController(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 345);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel.setBounds(27, 75, 72, 14);
		contentPane.add(lblNewLabel);
		
		Usuario = new JTextField();
		Usuario.setForeground(SystemColor.windowText);
		Usuario.setFont(new Font("Verdana", Font.PLAIN, 11));
		Usuario.setBackground(SystemColor.window);
		Usuario.setBounds(41, 100, 195, 20);
		contentPane.add(Usuario);
		Usuario.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					controller.autenticar();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(SystemColor.windowText);
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setBounds(178, 253, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 22));
		lblNewLabel_1.setBounds(178, 11, 98, 28);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroView telaDeCadastro = new CadastroView();
				telaDeCadastro.setVisible(true);
				
			}
		});
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.setToolTipText("");
		btnNewButton_1.setBounds(293, 253, 110, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_2.setBounds(27, 131, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		Senha = new JPasswordField();
		Senha.setFont(new Font("Verdana", Font.PLAIN, 11));
		Senha.setBounds(41, 159, 195, 20);
		contentPane.add(Senha);
	}

	public JTextField getUsuario() {
		return Usuario;
	}

	public void setUsuario(JTextField usuario) {
		Usuario = usuario;
	}

	public JPasswordField getSenha() {
		return Senha;
	}

	public void setSenha(JPasswordField senha) {
		Senha = senha;
	}
	
	
	
}
