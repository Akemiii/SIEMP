package br.gov.caixa.siemp.utils;

import java.sql.*;

public class DB {

	
	String urlTQS = "jdbc:db2://10.1.14.11:5023/CSD2";
    String urlDES = "jdbc:db2://10.1.14.11:5021/CSD1";
	String user = "f799508";
    String password = "mai2020";
    String empNo;                                                             
    Connection con;
    Statement stmt;
    ResultSet rs;
	
	public void CreateConnection() {
		
		try {
			
			//Carregar o driver
			
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			System.out.println("Driver JDBC carregado!");
			
			//Criar conexão
			con = DriverManager.getConnection(urlDES, user, password);
			con.setAutoCommit(false);
			System.out.println("Conexão criada com sucesso!");
			
			//Criar o statement
			stmt = con.createStatement();		
		}catch(SQLException  e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void Select(String query) {
		
		try {
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				empNo = rs.getString(1);
				System.out.println("resultado: " + empNo);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void Insert(String query) {
		try {
			
			stmt.execute(query);
			con.commit();
			System.out.println("Insert executada com sucesso!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void Update(String query) {
		try {
			
			stmt.executeUpdate(query);
			con.commit();
			System.out.println("Update executada com sucesso!");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void CloseConnection()  {
		
		try{
			if(rs != null) {
				rs.close();
			}
			System.out.println("rs fechada com sucesso");
			if(con != null) {
				con.close();
			}
			System.out.println("con fechada com sucesso");
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	
}
