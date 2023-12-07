package java_package;

public class BankSystem implements Calculator,LoginProcess {

	int amt =1000;
	void deposit(int a )
	{
		amt = amt +a;
		System.out.println("The amount after the deposit "+amt);
		
	}
	void withdraw(int b)
	{
		amt = amt -b;
		System.out.println("The amount after the withdraw "+amt);
	}
	int display()
	{
		return amt;
	}
	
	public static void main(String[] args) {
		//create an  object
		BankSystem obj= new BankSystem();
		
		obj.deposit(1000);
		obj.withdraw(500);
		System.out.println( obj.display());
		obj.username();
	}
	@Override
	public void username() {
		// TODO Auto-generated method stub
		System.out.println("the username of the customer");
	}
	@Override
	public void password() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void subt() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void multi() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}
	
	

}
