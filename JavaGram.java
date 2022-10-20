import java.util.*;
class JavaGram 
{
	int a;
	String b;
	String c;
	long d;
	String e;
	String f;
	String g;
	String h;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		JavaGram j1=new JavaGram();
		Create c1=new Create();
		Admin a1=new Admin();
		Home h1=new Home();
		LogIn l1=new LogIn();
		Setting s1=new Setting();
		System.out.println("-------------------Welcome to JavaGram-----------------------");
		System.out.println(" ");
		System.out.println("Choose LogIn as");
		System.out.println("1.Admin"+"\n"+"2.User");
		j1.a=sc.nextInt();
		if(j1.a==1)
		{
			System.out.println("Enter username of Authorize Account");
			String userid=sc.next();
			System.out.println("Enter Password of Authorize Account");
			String Pass=sc.next();
			if(a1.getUserID().equals(userid) && a1.getPass().equals(Pass))
			{
			System.out.println("------------------Welcome Admin-------------------------");
			System.out.println(" ");
			System.out.println("Choose Operation");
			System.out.println("1.Show Accounts"+"\n"+"2.Delete Account");
			j1.a=sc.nextInt();
			if (j1.a==1)
			{
				a1.showAccount(c1);
			}
			else if(j1.a==2)
			{
				a1.deleteAccount(c1);
			}
			else
			{
				System.out.println("Invalid try again ");
			}
			}
			else
				{
					System.out.println("Invalid Details");
				}
		}
		else if(j1.a==2)
		{
			System.out.println("---------------------Welcome User-----------------------");
			System.out.println(" ");
			System.out.println("Choose"+"\n"+"1.Create"+"\n"+"2.LogIn");
			j1.a=sc.nextInt();
			int n=1;
			while(n==1)
			{
			if (j1.a==1)
			{
				System.out.println("---------------Welcome To Create Page---------------");
				System.out.println(" ");
				System.out.println("Enter Name");
				j1.b=sc.nextLine();
				j1.b=sc.nextLine();
				System.out.println("Enter UserName");
				j1.c=sc.next();
				System.out.println("Enter Number");
				j1.d=sc.nextLong();
				System.out.println("Enter Email");
				j1.e=sc.next();
				System.out.println("Enter password");
				j1.f=sc.next();
				System.out.println("Enter Password again");
				j1.g=sc.next();
				System.out.println("Enter Bio");
				j1.h=sc.nextLine();
				j1.h=sc.nextLine();
				if (j1.f.equals(j1.g))
				{
					c1.setAccount(j1.b,j1.c,j1.d,j1.e,j1.g,j1.h);
					System.out.println(" Congratulation Account Created Sucessfully !");
					System.out.println("to select logIn option press 2");
					j1.a=sc.nextInt();
				}
				else
					{
						System.out.println("Password not matching, Try Again! press 1 ");
						n=sc.nextInt();
					}
			}
			else if(j1.a==2)
			{
				System.out.println("----------------Welcome To LogIn---------------------");
				System.out.println(" ");
				System.out.println("Enter UserName");
				String u=sc.next();
				System.out.println("Enter Password");
				String p=sc.next();
				boolean l=l1.loginCheck(u,j1.c,j1.f,p);
				if(l==true)
				{
					int m;
					h1.home(c1);
					System.out.println("Press 1 for Setting");
					m=sc.nextInt();
					if (m==1)
					{
						while(m==1)
						{
							System.out.println("-----------------Settings-----------------------");
							System.out.println(" ");
							System.out.println("Choose option"+"\n"+"1.Show Details"+"\n"+"2.Edit Details");
							int m1=sc.nextInt();
							if(m1==1)
							{
								System.out.println("-----Showing Details-----");
								s1.showDetails(c1);
							}
							else if(m1==2)
							{
								System.out.println("------Edit Details-------");
								System.out.println("");
								s1.showDetails(c1);
								System.out.println("Choose detail to change");
								int z=sc.nextInt();
								if (z!=5)
								{
									System.out.println("Enter the Detail");
									String y=sc.nextLine();
									y=sc.nextLine();
									s1.editDetails(z,y,c1);
									if(z==4)
									{
										System.out.println("Enter password again");
										p=sc.next();
										s1.editDetails(z,y,c1);
									}
								}
								else if (z==5)
								{
									System.out.println("Enter the detail");
									long x=sc.nextLong();
									s1.editNumber(z,x,c1);
								}
								else
								{
									System.out.println("Invalid Number");
									System.out.println("To continue again press 1");
									m=sc.nextInt();
								}
								System.out.println("To continue press 1 or to exit press 2");
								m=sc.nextInt();
							}
						}
					}
					else
					{
						System.out.println("Invalid Number try again");
						System.out.println("To continue press 2 or press 0 to exit ");
						j1.a=sc.nextInt();
					}


				}
				else
				{
					System.out.println("Invalid Details");
					System.out.println("To continue press 1 and or press 0 to exit ");
					n=sc.nextInt();
					System.out.println("To LogIn press 2 and exit 0");
					j1.a=sc.nextInt();
				}
			}
			}
		}
		else
		{
			System.out.println("bye");
		}
	}
}
