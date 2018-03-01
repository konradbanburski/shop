package access;

import java.util.ArrayList;

import database.Database;
import database.SqlCreator;

public class Login {

	Database db = new Database();
	SqlCreator sqlCreator = new SqlCreator();
	
	
	public boolean authorization (String userName, String password)
	{		
		if(db.selectOneUser(sqlCreator.selectQuery("USERS", "USER_NAME = '" + userName + "'", null, null)).getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
	
	
	
}
