package sayHi;

public class PersonAge 
{
	String first_Name;
	String last_Name;
	int age;
	
	

	/**
	 * @param fname - First Name
	 * @param lname - Last name 
	 * @param age   - age pf person in years
	 */
	public PersonAge(String fname, String lname, int age)
	{
		super();
		this.first_Name = fname;
		this.last_Name = lname;
		this.age = age;
	}
	
	



	@Override
	public String toString() 
	{
		return "Person:" + first_Name + " " + last_Name + ", " + age;
	}





	/**
	 * @return the fname
	 */
	public String getFname() {
		return first_Name;
	}





	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.first_Name = fname;
	}





	/**
	 * @return the lname
	 */
	public String getLname() {
		return last_Name;
	}





	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.last_Name = lname;
	}





	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}





	/**
	 * @param the age to set
	 */
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public PersonAge makePerson(PersonAge that) throws UnderAgeException
	{
		if(age<18 || that.age<18)
		{
			throw new UnderAgeException();
			
		}
			

		PersonAge child = new PersonAge(this.first_Name,that.last_Name,0);
			
		return child;
	}


	


	public static void main(String[] args) 
	{
		PersonAge r = new PersonAge("Romeo", "Mon", 15);
		System.out.println("R" + r);

	}

}
