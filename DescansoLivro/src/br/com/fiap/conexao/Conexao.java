package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
//	public static Connection queroConectar() throws Exception {
//		return DriverManager.getConnection
//		("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm82352","071191");
//	}
	
	public static Connection queroConectar() throws Exception {
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm83958","010201"
				);
	}

	
}
