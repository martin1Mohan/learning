package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.User;

public class UserDaoImpl implements UserDao {

	private int bool;

	@Override
	public User createUser(User user) {

		String insertquery= "INSERT INTO user (user_name, password) VALUES ( ? , ? )";
		String userIdQuery= "SELECT * FROM user WHERE user_name like \""+user.getUserName()+"\";";
		Connection connection= MySQLConnection.getConnection();
		PreparedStatement statement= null;
		Statement statement2= null;
		bool = 0;
		try {
			statement= connection.prepareStatement(insertquery);
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());
			bool= statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (bool==1) {
			try {
				statement2= connection.createStatement();
				ResultSet resultSet=statement2.executeQuery(userIdQuery);
				
				while(resultSet.next()) {
					int userId = resultSet.getInt("user_id");
					if (userId != 0) {
					user.setUserId(userId);
					} else {
						continue;
					}
					//break;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return user;
		} else {
			System.out.println("check query again");
			return user;
		}
	}

	@Override
	public List<User> readAllUser() {

		Connection connection =MySQLConnection.getConnection();
		String sqlQuery= "SELECT * FROM user";
		Statement statement= null;
		List<User> users= new ArrayList<User>();
		try {
			statement= connection.createStatement();
			ResultSet resultSet=  statement.executeQuery(sqlQuery);
			//iterate
			while(resultSet.next()) {
				//System.out.println(resultSet.getInt("user_id") + "  " + resultSet.getString("user_name"));
				User user= new User(resultSet.getInt("user_id"), resultSet.getString("user_name"), resultSet.getString("password")); 
				users.add(user);
			}
//			for (User user : users) {
//				System.out.println(user);
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return users;
	}

	@Override
	public User readByUserId(int userId) {

		Connection connection = MySQLConnection.getConnection();
		String sqlQuery = "select * from user where user_id = \"" + userId + "\"";
		Statement statement = null;
		ResultSet resultSet = null;
		// PreparedStatement preparedStatement = null;
		User user = new User();

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				if (resultSet.getInt(1) == userId) {
					user.setUserId(resultSet.getInt(1));
					user.setUserName(resultSet.getString(2));
					user.setPassword(resultSet.getString(3));
				}
			}
		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}
		return user;
	}

	@Override
	public User readByUserName(String userName) {

		Connection connection = MySQLConnection.getConnection();
		String sqlQuery = "select * from user where user_id = \"" + userName + "\"";
		Statement statement = null;
		ResultSet resultSet = null;
		// PreparedStatement preparedStatement = null;
		User user = new User();

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			
			while (resultSet.next()) {
				user.setUserId(resultSet.getInt(1));
				user.setUserName(resultSet.getString("user_name"));
				user.setPassword(resultSet.getString("password"));
			}
		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}
		return user;
	}

	@Override
	public User validateUserId(int userId, String password) {
		boolean isValid = false;
		Connection connection = MySQLConnection.getConnection();
		String sqlQuery = "select * from user where user_id = \"" + userId + "\"";
		Statement statement = null;
		ResultSet resultSet = null;
		// PreparedStatement preparedStatement = null;
		User user = new User();

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);
			while (resultSet.next()) {
				if (resultSet.getInt(1) == userId) {
					user.setUserId(resultSet.getInt(1));
					user.setUserName(resultSet.getString(2));
					user.setPassword(resultSet.getString(3));
					if (user.getPassword()== password) {
						isValid= true;
					}
				}
			}
		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}
		if (isValid) {
			return user;
		} else {
			return null;
		}
		
	}

	@Override
	public User updateByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
