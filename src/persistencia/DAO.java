package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	Connection conn;
	PreparedStatement stmt;
	ResultSet rs;
	
	public void abrirConexao()throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula9", "root" , "");
	}
	
	public void fecharConexao()throws Exception{
		conn.close();
	}
	
	public static void main(String[] args) {
		try {
			DAO d = new DAO();
			d.abrirConexao();
			d.fecharConexao();
			System.out.println("Deu certo");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu ruim");
		}
	}
}
