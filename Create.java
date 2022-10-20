class Create 
{
	private String name;
	private String username;
	private long number;
	private String email;
	private String pass;
	private String bio;
	public void setAccount(String name, String username, long number, String email, String pass, String bio)
	{
		this.username=username;
		this.email=email;
		this.number=number;
		this.name=name;
		this.pass=pass;
		this.bio=bio;
	}
	public String getName()
	{
		return name;
	}
	public String getUserName()
	{
		return username;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPass()
	{
		return pass;
	}
	public String getBio()
	{
		return bio;
	}
	public long getNumber()
	{
		return number;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setUserName(String username)
	{
		this.username=username;
	}
	public void setNumber(long number)
	{
		this.number=number;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setBio(String bio)
	{
		this.bio=bio;
	}
	public void setPass(String pass)
	{
		this.pass=pass;
	}

}
