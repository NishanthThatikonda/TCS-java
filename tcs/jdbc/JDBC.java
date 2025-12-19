package com.tcs.jdbc;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class JDBC {
public static void main(String[] args) {
	try {
		Driver d=new  com.mysql.cj.jdbc.Driver();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Root123$");
		Statement st=con.createStatement();
		//ResultSet rs=st.executeQuery("select * from employee");
//		while(rs.next()) {
//			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//		}
		st.executeUpdate(" insert into employee values('sai',500,17000,'hyderabad')");
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
	}
		System.out.println(rs);
	}
	catch(SQLException e){
	}
}
}
