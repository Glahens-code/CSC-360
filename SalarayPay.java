package test1;

public class SalarayPay extends PayType 
{

	public SalarayPay() 
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Pay(Employee e) 
	{
		
		
		return e.payRate * 40;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
