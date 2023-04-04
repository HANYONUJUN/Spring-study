package com.inhatc.cs;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";  //cj -> mysql 6.0 이하 버전임
	private static final String UAL=
	"jdbc:mysql://127.0.01:3306/basicboard?serverTimezone=UTC&characterEncoding=UTF-8&useSSL=false";
	private static final String USER ="root";
	private static final String PW ="root";
	
	@Test
	public void testConnection() throws Exception{
		
		
		Class.forName(DRIVER);
		try(Connection con= DriverManager.getConnection(UAL, USER, PW)){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
