package users;

import java.util.ArrayList;

import database.Database;
import database.SqlCreator;


public class UserList {

	private ArrayList<User> userList = new ArrayList<User>();
	Database db = new Database();
	SqlCreator sqlCreator = new SqlCreator();
	
	UserList()
	{		
		DbToList(sqlCreator.selectQuery("USERS", null, null, null));
	}
	
	public void DbToList(String sql)
	{
		userList.clear();
		setUserList(db.selectAllUsers(sql));
	}
	
	public void setUserList(ArrayList<User> arrayList)
	{
		this.userList = arrayList;
	}
	
	public ArrayList<User> getUserList()
	{
		return userList; 
	}
		
}
