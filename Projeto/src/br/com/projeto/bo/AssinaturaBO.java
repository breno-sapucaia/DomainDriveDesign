package br.com.projeto.bo;

import br.com.projeto.beans.Assinatura;
import br.com.projeto.beans.Usuario;
import br.com.projeto.dao.AssinaturaDAO;
import br.com.projeto.dao.UsuarioDAO;

public class AssinaturaBO {
	
	public static String novaAssinatura(Assinatura objeto) throws Exception {
		//Regra de Negocio
		if (objeto.getCodigo() <= 0) {
			return "Codigo inv�lido";
		} 
		if(objeto.getValor() < 0) {
			return "Valor n�o pode ser negativo";
		} 
		//Requisito Funcional
		if(objeto.getTipo().length() > 15) {
			return "Tipo excedeu qtde de caracteres";
		} 
		// verificando se a FK existe 
		UsuarioDAO usuDAO = new UsuarioDAO(); 
		Usuario objUsuario = 
				usuDAO.getUser(objeto.getUsuario().getCodigo()); 
		usuDAO.encerrar();
		if(objUsuario.getCodigo() == 0) {
			return "Usuario n�o existe";
		}
		
		//verificar se a PK n�o existe 
		AssinaturaDAO assDAO = new AssinaturaDAO(); 
		Assinatura objAssinatura = 
				assDAO.getAssinatura(objeto.getCodigo());
		if(objAssinatura.getCodigo() > 0) {
			return "Codigo da assinatura j� existe"; 
		} 
		
		//Padroniza��o 
		objeto.setTipo(objeto.getTipo().toUpperCase()); 
		
		//Finaliza��o
		int x = assDAO.addAssinatura(objeto);  
		assDAO.encerrar();
		if(x == 0) {
			return "Assinatura n�o cadastrada";
		} else {
			return "Assinatura Cadastrada";
		}
	}
}
