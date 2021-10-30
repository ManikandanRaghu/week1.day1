package week1.day1;

public class FirstObject {
	int empid;
	String empname;
	int mobile;
	
	public void joining()
	{
		System.out.println(empname+"'s Employment offered with ID "+empid);
	}
	private void resign() 
	{
		System.out.println(empname+"'s Resignation accepted");
	}
		public static void main(String[] args) 
		{
			FirstObject emp = new FirstObject();
			
			emp.empid=001;
			emp.empname="Ranjith";
			emp.mobile=123456790;
			emp.joining();
			emp.resign();
			System.out.println("-----------------------------");
			emp.empid=002;
			emp.empname="Venki";
			emp.mobile=1569321470;
			emp.joining();
			emp.resign();					
		}

}
