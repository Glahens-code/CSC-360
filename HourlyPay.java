package test1;

public class HourlyPay extends PayType {

	public HourlyPay() 
	{
	}

	@Override
	public double Pay(Employee e) 
	{
		if (e.Hours > 40) 
		{
			double Ot = e.Hours - 40;
			
			double Ot_rate = e.payRate*1.5;
			
			System.out.println("Ot Rate:" + Ot_rate);
			
			double Ot_pay = Ot*Ot_rate;
				
			
			
			
			
			double final_pay = 40*e.payRate + Ot_pay;
			
			return final_pay;
		}
		else
		{
			return super.Pay(e);
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
