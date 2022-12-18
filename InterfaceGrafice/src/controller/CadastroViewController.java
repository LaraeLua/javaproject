package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import Connection.Conexao;
import Connection.UsuarioConec;
import View.CadastroView;
import model.Usuario;

public class CadastroViewController {
	

	private CadastroView view;
	
	public CadastroViewController(CadastroView view) {
		this.view = view;
	}
	
	public void salvaUsuario() {
		
		
		
		String usuario = view.getUsuario1().getText();
		String senha = view.getSenha1().getText();
		
		Usuario usuarioC = new Usuario(usuario, senha);
		
		try {
			Connection conexao = new Conexao().getConnection();
			UsuarioConec usuarioConec = new UsuarioConec(conexao);
			usuarioConec.insert(usuarioC);
			
			JOptionPane.showMessageDialog(null, "Usuario Salvo com Sucesso!");
			
		} catch (SQLException e1) {
			Logger.getLogger(CadastroView.class.getName()).log(Level.SEVERE, null, e1);
		}
		
		
	}
}
