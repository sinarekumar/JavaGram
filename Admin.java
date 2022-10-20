class Admin 
{
	private final String UserID="Admin";
	private final String Pass="Admin@123";
	public void showAccount(Create c) 
	{
		if (c.getName()!=null && c.getUserName()!=null)
		{
			System.out.println("------------------------Show Account----------------------------");
			System.out.println(c.getName());
			System.out.println(c.getUserName());
		}
		else
		{
			System.out.println("------------------------Show Account----------------------------");
			System.out.println(" ");
			System.out.println("No Account found");
		}
	}
	public void deleteAccount(Create c)
	{
		showAccount(c);
		c.setAccount(null,null,0,null,null,null);
	}
	public String getUserID()
	{
		return UserID;
	}
	public String getPass()
	{
		return Pass;
	}
}

