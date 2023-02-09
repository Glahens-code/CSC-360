/**
 * 
 */
package test1;

/**
 * @author glahens.paul
 *
 */

import java.util.Arrays;
import java.util.ArrayList;

public class Payroll 
{
	ArrayList<Employee> Emps = null;
	
	/**
	 * 
	 */
	
	
	public Payroll()
	{
		
	}
	
	public ArrayList<Double> PayAll()
	{
		ArrayList<Double> emps = new ArrayList<Double>();
		
		//emps.add(this.Emps.get(0).Earnings);
		
		for(int i = 0; i< this.Emps.size(); i++)
		{
			System.out.println("Name: " + this.Emps.get(i).Name + "Earnings: " + this.Emps.get(i).Earnings);
			emps.add(this.Emps.get(i).Earnings);
		}
		

		
		return emps;
		
	}
	
	public ArrayList<String> AddEmp(Employee e)
	{

		
		this.Emps.add(e);
		
		
		
		ArrayList<String> Emp_names = new ArrayList<String>();
		
		System.out.println(Emp_names);
		for (int i = 0; i< this.Emps.size(); i++)
		{
			Emp_names.add(this.Emps.get(i).Name);
		}

		System.out.println(Emp_names);
		return Emp_names;
		
		
		
		
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		Payroll p = new Payroll();
		Employee A1 = new Employee("A",10,40, new SalarayPay());
		Employee A3 = new Employee("B",10,40, new SalarayPay());
		Employee A2= new Employee("C",10,40, new SalarayPay());
		ArrayList<Employee> R = new ArrayList<Employee>(Arrays.asList(A1,A2));
		
		p.Emps = R;
		
		System.out.println(p.PayAll());
	}
	
	

}
