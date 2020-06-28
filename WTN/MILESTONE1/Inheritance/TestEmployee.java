public class TestEmployee 
{
	public static void main(String args[])
	{
		Employee e =new Employee();
		e.setName("Hari");
		e.setInsurance_no("123S3221A");
		e.setYear(2001);
		e.setAnnual_salary(100000);
		System.out.println("Details Regarding Employee: ");
		System.out.println("Name :"+e.getName());
		System.out.println("Salary "+e.getAnnual_salary());
		System.out.println("Insurance number "+e.getInsurance_no());
		System.out.println("Year of joining "+e.getYear());
	}
}