package qlsvFinal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import qlsvFinal.util.ConnectionUtil;

public class ConnectionUtil {
	private Connection conn;
	public static ConnectionUtil connectionUtil = new ConnectionUtil();
	
	public Connection createMySQLConnection() throws ClassNotFoundException, SQLException{
		String hostName = "localhost";
		String database = "sinhvienfinal";
		String userName = "root";
		String password = "";
		
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + database;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
	
	public ConnectionUtil(){
		this.initConnection();
	}
	public void initConnection(){
		try{
			this.conn = this.createMySQLConnection();
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
	public void returnMySQLConnection(){
		try {
			if(this.conn.isClosed()){
				this.conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ConnectionUtil getInstance(){
		return connectionUtil;
	}
	public Connection getMyConnection(){
		return this.conn;
	}
}
