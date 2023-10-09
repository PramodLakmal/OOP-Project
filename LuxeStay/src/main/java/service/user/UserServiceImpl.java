
package service.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.user.User;
import util.DBConnect;


public class UserServiceImpl implements UserService {
	
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	@Override
	public ArrayList<User> getUsers() {
		
		ArrayList<User> users = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM User";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3); 
				String email = rs.getString(4);
				String password = rs.getString(5);
				String role = rs.getString(10);
				
				User u = new User(id, fname, lname, email, password, role);
				
				users.add(u);
			}
		}
		catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public boolean checkUserExist(String email) {
		
		boolean isExist = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM User WHERE email = '" + email + "'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next() == true) {
				isExist = true;
			}
		}
		catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}
		return isExist;
	}

	@Override
	public User getUserByEmail(String em) {
		User user = new User();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM user WHERE email = '" + em + "'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setFname(rs.getString("fname"));
				user.setLname(rs.getString("lname"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
			}
		}
		catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public void addUser(User user) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "INSERT INTO `user` (`fname`, `lname`, `email`, `password`,`role`) VALUES ('" + user.getFname() + "', '" + user.getLname() + "', '" + user.getEmail() + "', '" + user.getPassword() + "', '" + user.getRole() + "');";
			stmt.executeUpdate(sql);
		}
		catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}
		
	}

	@Override
	public User getUserByID(int user_id) {
		
		User user = new User();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM user WHERE id = '" + user_id + "'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setFname(rs.getString("fname"));
				user.setLname(rs.getString("lname"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
			}
		}
		catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}
		
		return user;
	}
	
	
	@Override
	public void updateUser(User user) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE `user` SET `fname`='" + user.getFname() + "', `lname`='" + user.getLname() + "', `email`='" + user.getEmail() + "' WHERE `id`='" + user.getId() + "';";
			stmt.executeUpdate(sql);
		}
		catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteUser(int user_id) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "DELETE FROM `user` WHERE `id`='" + user_id + "';";
			stmt.executeUpdate(sql);
		}
		catch (Exception e) {
			System.out.print(e);
			e.printStackTrace();
		}
	}
}
