package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuario;

public class UsuarioConec {
	private final Connection connection;
	
	
	public UsuarioConec(Connection connection) {
		this.connection = connection;
	}
	
	public void insert(Usuario usuario) throws SQLException {

		String sql = "insert into usuario(usuario, senha) values ('"+ usuario.getUsuario() +"', '"+usuario.getSenha()+"')";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.execute();	
	}

	public boolean existePorUsuarioESenha(Usuario usuario) throws SQLException {
		String sql = "select * from usuario where usuario = '"+usuario.getUsuario()+"' and senha = '"+usuario.getSenha()+"'";
		PreparedStatement statement = connection.prepareStatement(sql);
	    statement.execute();
	    
	   ResultSet resultSet = statement.getResultSet();
		return resultSet.next();
	}
}
