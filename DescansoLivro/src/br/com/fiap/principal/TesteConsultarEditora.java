package br.com.fiap.principal;

import br.com.fiap.beans.Editora;
import br.com.fiap.dao.EditoraDAO;

public class TesteConsultarEditora {
	public static void main(String[] args) {
		EditoraDAO dao = null;
		try {
			dao = new EditoraDAO();
			Editora e = dao.getById(5);

			if(e.getId() == 0) {
				System.out.println("Nenhuma editora encontrada");
			}else {
				System.out.println(e.getNome());
				System.out.println(e.getTelefone());
				System.out.println(e.getEmail());				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dao.encerrar();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
