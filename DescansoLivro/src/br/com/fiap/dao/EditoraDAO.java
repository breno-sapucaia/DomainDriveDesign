package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Editora;
import br.com.fiap.conexao.Conexao;


public class EditoraDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public EditoraDAO() throws Exception{
		con = Conexao.queroConectar();
	}
	
	
	public int add(Editora e) throws Exception {
		stmt = con.prepareStatement("INSERT INTO RM_T_EDITORA(ID_EDITORA,NM_EDITORA,NR_TELEFONE,NM_EMAIL) VALUES (?,?,?,?)");
		stmt.setInt(1, e.getId());
		stmt.setString(2, e.getNome());
		stmt.setString(3, e.getTelefone());
		stmt.setString(4, e.getEmail());
		return stmt.executeUpdate();
	}
	
	public Editora getById(int cod) throws Exception {
		stmt = con.prepareStatement("SELECT * FROM RM_T_EDITORA WHERE ID_EDITORA = ?");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		if(rs.next()) {
			return new Editora(rs.getInt("ID_EDITORA"),rs.getString("NM_EDITORA"),rs.getString("NR_TELEFONE"),rs.getString("NM_EMAIL"));
		}else {
			return new Editora();
		}
	}
	public int deleteById(int cod) throws Exception {
		stmt = con.prepareStatement("DELETE FROM RM_T_EDITORA WHERE ID_EDITORA = ?");
		stmt.setInt(1, cod);
		return stmt.executeUpdate();
	}
	
	public void encerrar() throws Exception {
		con.close();
	}
}
