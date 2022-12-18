package View;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connection.Conexao;
import Connection.UsuarioConec;
import controller.CadastroViewController;
import model.Usuario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class CadastroView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField Usuario1;
	private JPasswordField Senha1;
	private CadastroViewController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroView frame = new CadastroView();
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
	public CadastroView() {
		
		controller = new CadastroViewController(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 345);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(44, 96, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Usuario1 = new JTextField();
		Usuario1.setBounds(44, 156, 164, 20);
		contentPane.add(Usuario1);
		Usuario1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel.setBounds(34, 71, 19, 14);
		contentPane.add(lblNewLabel);
		
		JLabel LabelUsu = new JLabel("Usuario");
		LabelUsu.setForeground(SystemColor.window);
		LabelUsu.setFont(new Font("Verdana", Font.BOLD, 11));
		LabelUsu.setBounds(34, 131, 80, 14);
		contentPane.add(LabelUsu);
		
		JLabel LabelSenha = new JLabel("Senha");
		LabelSenha.setForeground(SystemColor.window);
		LabelSenha.setFont(new Font("Verdana", Font.BOLD, 11));
		LabelSenha.setBounds(34, 187, 46, 14);
		contentPane.add(LabelSenha);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.salvaUsuario();
				
			}
		});
		btnNewButton.setBounds(310, 272, 89, 23);
		contentPane.add(btnNewButton);
		
		Senha1 = new JPasswordField();
		Senha1.setBounds(44, 212, 164, 20);
		contentPane.add(Senha1);
		
		JLabel lblNewLabel_1 = new JLabel("CADASTRO");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel_1.setBounds(163, 11, 110, 20);
		contentPane.add(lblNewLabel_1);
	}

	public JTextField getUsuario1() {
		return Usuario1;
	}

	public void setUsuario1(JTextField usuario1) {
		Usuario1 = usuario1;
	}

	public JPasswordField getSenha1() {
		return Senha1;
	}

	public void setSenha1(JPasswordField senha1) {
		Senha1 = senha1;
	}
}

