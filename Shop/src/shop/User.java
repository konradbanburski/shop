package shop;

public class User {

	private String userName;
	private String password;
	private String type = "normal";
	
	User(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
		this.type = type;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String toString()
	{
		return userName + " " + password + " " + type;
	}
}

