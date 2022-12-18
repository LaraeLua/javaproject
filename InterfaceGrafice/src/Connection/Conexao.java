package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public Connection getConnection() throws SQLException{
	Connection Conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bdJava", "postgres", "postgres");
	return Conexao;


	}
}
