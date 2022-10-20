class Setting 
{
	public void showDetails(Create c) 
	{
		System.out.println("---------------------Show Details---------------------------");
		System.out.println(" ");
		System.out.println("1.Name :"+c.getName());
		System.out.println("2.UserName :"+c.getUserName());
		System.out.println("3.Email :"+c.getEmail());
		System.out.println("4.Password :"+c.getPass());
		System.out.println("5.Number :"+c.getNumber());
		System.out.println("6.BIO :"+c.getBio());

	}
	public void editDetails(int a,String b,Create c)
	{
		System.out.println("---------------------Edit Details-----------------------------");
		System.out.println(" ");
		System.out.println("Press respective number which you wish to edit");
		switch(a)
		{
			case 1:
			{	
				c.setName(b);
				System.out.println(" press 1 to continue ");
			}break;
			case 2:
			{
				c.setUserName(b);
				System.out.println(" press 1 to continue ");
			}break;
			case 3:
			{
				c.setEmail(b);
				System.out.println(" press 1 to continue ");
			}break;
			case 4:
			{
				c.setPass(b);
				System.out.println(" press 1 to continue ");
			}break;
			case 6:
			{
				c.setBio(b);
				System.out.println(" press 1 to continue ");
			}break;
			default :
			{
				System.out.println("Entered Invalid number press 1 to continue ");
			}
		}
	}
	public void editNumber(int a,long b,Create c)
	{
		switch(a)
		{
			case 5:
			{
				c.setNumber(b);
				System.out.println(" press 1 to continue ");
			}break;
		}
	}
}
