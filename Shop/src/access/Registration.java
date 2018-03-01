package access;

import database.Database;
import database.SqlCreator;

public class Registration {
	
	Database db = new Database();
	SqlCreator sqlCreator = new SqlCreator();
	
	public boolean creatUser(String userName, String password) 
	{
		if(db.selectOneUser(sqlCreator.selectQuery("USERS", "USER_NAME = '" + userName + "'", null, null)).getUserName().equals(userName))
		{
			return false;
		}
		db.insert(sqlCreator.insertUserQuery(userName, password, "normal"));
		return true;
	}
	
	
}
