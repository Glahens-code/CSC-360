package test1;

public class ContractPay extends PayType {

	public ContractPay() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public double Pay(Employee e) 
	{
		// TODO Auto-generated method stub
		double ret_pay = e.Hours * e.payRate;
		
		return ret_pay;
	}



	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
