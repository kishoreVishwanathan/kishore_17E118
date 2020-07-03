
public class Employee  extends  Person
{
	double salary;
	int year_employee_started;
	String national_insurance_number;
	public Employee(String member, double salary, int year_employee_started, String national_insurance_number) {
		super(member);
		this.salary = salary;
		this.year_employee_started = year_employee_started;
		this.national_insurance_number = national_insurance_number;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear_employee_started() {
		return year_employee_started;
	}
	public void setYear_employee_started(int year_employee_started) {
		this.year_employee_started = year_employee_started;
	}
	public String getNational_insurance_number() {
		return national_insurance_number;
	}
	public void setNational_insurance_number(String national_insurance_number) {
		this.national_insurance_number = national_insurance_number;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", year_employee_started=" + year_employee_started
				+ ", national_insurance_number=" + national_insurance_number + "]";
	}
	

}
