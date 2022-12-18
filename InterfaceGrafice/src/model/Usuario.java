package model;

public class Usuario {
	private int id;
	private String Usuario;
	private String senha;
	
	
	
	public Usuario(int id, String usuario, String senha) {
		this.id = id;
		Usuario = usuario;
		this.senha = senha;
	}

	public Usuario(String usuario, String senha) {
		Usuario = usuario;
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getUsuario() {
		return Usuario;
	}
	
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
