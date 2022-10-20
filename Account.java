class Account 
{
	private String account_holder_name;
	private long account_number;
	private double balance;
	Account(long account_number)
	{
		this.account_number=account_number;
	}
	public String getAccountHolderName()
	{
		return account_holder_name;
	}
	public void setAccountHolderName(String account_holder_name)
	{
		this.account_holder_name=account_holder_name;
	}
	public long getAccountNumber()
	{
		return account_number;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void accountDetails()
	{
		System.out.println("---------------Executing account details----------------------------");
		System.out.println("Name : "+account_holder_name);
		System.out.println("Account_Number : "+account_number);
		System.out.println("Account_Balance : "+balance);
	}
}
