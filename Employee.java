/**
 * 
 */
package test1;

/**
 * @author glahens.paul
 *
 */
public class Employee 
{
	String Name;
	double Hours;
	double payRate;
	PayType payType;
	double Earnings;

	
	/**
	 * @param Name- Name of employee
	 * @param Hours - Hours worked by the employee
	 * @param payRate - The rate in which they will get payed
	 * 
	 */
	public Employee(String Name, double Hours, double payRate, PayType paytype) 
	{
		this.Name = Name;
		this.Hours = Hours;
		this.payRate = payRate;
		this.payType = paytype;
		this.Earnings = this.payType.Pay(this);
	}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		PayType S = new SalarayPay();
		
		Employee e = new Employee("Jon",45.0,10,S);
		
		System.out.println(e.Earnings);
	}

}
