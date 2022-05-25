package com.ddv.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.User;

import com.ddv.connection.MySQLConnection;
import com.ddv.pojo.UserPojo;
import com.mysql.cj.xdevapi.PreparableStatement;

public class UserModel {
	
	public UserPojo login(String email, String password) {
		
		Connection connect = MySQLConnection.getConnection();
		String query = "select * from tb_users where email = ? and password = ?";
		UserPojo user = null;
		try {
			
			PreparedStatement stament = connect.prepareStatement(query);
			stament.setString(1, email);
			stament.setString(2, password);
			ResultSet result = stament.executeQuery();
			while(result.next()) {
				user = new UserPojo();
				user.setEmail(result.getString("email"));
				
			}
			connect.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return user;
	}
	
}
