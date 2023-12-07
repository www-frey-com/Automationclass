package java_package;

public class CompanySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee a= new Employee();
		a.empName();
		a.compnayName();
		
	}

}


class Company
{
	
	void compnayName()
	{
		System.out.println("The name of company is Infotek");
	}
}



class Employee extends Company
{
	
	void empName()
	{
		System.out.println("the name of employee is Fery");
	}
}