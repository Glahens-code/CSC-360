/**
 * 
 */
package test1;

/**
 * @author glahens.paul
 *
 */
public class PayType 
{
	
	/**
	 * 
	 */
	public PayType() 
	{
		// TODO Auto-generated constructor stub
	}
	
	
	public double Pay(Employee e) 
	{
		
		
		double ret_pay = e.Hours * e.payRate;
		
		return ret_pay;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		
	}

}
