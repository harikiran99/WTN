public class Employee extends Person
{
	double annual_salary;
	int year;
	String insurance_no;
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsurance_no() {
		return insurance_no;
	}
	public void setInsurance_no(String insurance_no) {
		this.insurance_no = insurance_no;
	}
}