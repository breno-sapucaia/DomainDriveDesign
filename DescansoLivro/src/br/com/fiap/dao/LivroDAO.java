package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Editora;
import br.com.fiap.beans.Livro;
import br.com.fiap.conexao.Conexao;

public class LivroDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public LivroDAO() throws Exception{
		con = Conexao.queroConectar();
	}
	
	public int add(Livro l) throws Exception {
		stmt = con.prepareStatement("INSERT INTO RW_T_LIVROS(NR_ISBN,NM_LIVRO,NM_AUTOR,VL_LIVRO, ID_EDITORA) VALUES (?,?,?,?,?)");
		stmt.setInt(1, l.getIsbn());
		stmt.setString(2, l.getNome());
		stmt.setString(3, l.getAutor());
		stmt.setDouble(4, l.getEditora().getId());
		return stmt.executeUpdate();
	}
	
//	public Livro get(int lsbn) throws Exception{
//		stmt = con.prepareStatement("SELECT * FROM RW_T_LIVROS WHERE NR_ISBN = ?");
//		stmt.setInt(1, lsbn);
//		rs = stmt.executeQuery();
//		if(rs.next()) {
//			EditoraDAO daoE = new EditoraDAO();
//			Editora e = daoE.getById(rs.getInt("ID_EDITORA"));
//			daoE.encerrar();
//			//return new Livro(rs.getInt("NR_ISBN"),rs.getString(""));
//		}
//}		

		
}


