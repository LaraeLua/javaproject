package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Connection.Conexao;
import Connection.UsuarioConec;
import View.MenuView;
import View.View;
import model.Usuario;

public class ViewController {

	private View view;

	public ViewController(View view) {
		this.view = view;
	}


		public void autenticar() throws SQLException {
			
			//ter usuario da view, verificar se tem no bd, se existir abra o login
			
			//Usuario da view:
			
			String Usuario = view.getUsuario().getText();
			String Senha = view.getSenha().getText();
			
			Usuario usuarioAutenticar = new Usuario(Usuario, Senha);
			
			
			//Verificar se tem no bd
			
			Connection conexao = new Conexao().getConnection();
			UsuarioConec usuarioCone = new UsuarioConec(conexao);
					
			boolean existe = usuarioCone.existePorUsuarioESenha(usuarioAutenticar);
			
			//abrir menu
			if(existe) {
				MenuView telaDeMenu = new MenuView();
				telaDeMenu.setVisible(true);
			
			}else {
				JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos");
			}
					
					
		
		
	}

	
	
	
	
	
}
