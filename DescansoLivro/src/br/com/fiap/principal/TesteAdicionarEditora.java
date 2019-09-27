package br.com.fiap.principal;

import br.com.fiap.beans.Editora;
import br.com.fiap.dao.EditoraDAO;

public class TesteAdicionarEditora {

	public static void main(String[] args) {
		EditoraDAO dao = null;
		try {
			dao = new EditoraDAO();
			Editora e = new Editora(5,"teste","teste","teste");
			dao.add(e);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				dao.encerrar();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
