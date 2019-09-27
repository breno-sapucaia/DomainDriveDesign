package br.com.fiap.principal;

import br.com.fiap.beans.Editora;
import br.com.fiap.dao.EditoraDAO;

public class TesteEditoraExcluir {

	public static void main(String[] args) {
		EditoraDAO dao = null;
		try {
			dao = new EditoraDAO();
			
			if(dao.deleteById(5)>0) {
				System.out.println("Editora de id 5 deletada");
			}else {
				System.out.println("Nada a declarar");
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