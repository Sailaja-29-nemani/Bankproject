package project;

public class Transaction
{	int bal=10000;
	
	double deposit(int amount)
	{
		bal+=amount;
		return bal;
	}
	double withdraw(int wd)
	{
	bal-=wd;
	return bal;
	
	}
	double display()
	{
		return bal;
	}
	public static void main(String[] args)
	{
		Bank b1=new Bank(1554,"Union","1554010");
		Transaction t1=new Transaction();
		System.out.println(b1);
		System.out.println("Acc balance after deposit "+ t1.deposit(500));
		System.out.println("Acc balance after Withdraw " + t1.withdraw(200));
		System.out.println("Total acc balance:" + t1.display());	
	}

}
