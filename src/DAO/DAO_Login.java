package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Beans.Account;
import GUI.Dashboard_Frame;
import connectDB.ConnectDB;

public class DAO_Login {
	public boolean getAccount(String username, String password) {
		Connection con = ConnectDB.getInstance().getConnect();
		String sql = "Select *  from Account where username = '"+username+"'and password = '"+password+"'";
		PreparedStatement ptmt;
		try {
 		   Statement ps = con.createStatement();
 		   ResultSet rs=ps.executeQuery(sql);
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		

	
	}
}
