
public class Employees {
	public Integer Sno;
	public String Ename;
	public String Edesignation;
	public double Esalary;
	public String loaction;
	public int Age;
	public String gender;
	
	
	public Employees(Integer sno, String ename, String edesignation, double esalary, String loaction, int age,
			String gender) {
		super();
		Sno = sno;
		Ename = ename;
		Edesignation = edesignation;
		Esalary = esalary;
		this.loaction = loaction;
		Age = age;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employees [Sno=" + Sno + ", Ename=" + Ename + ", Edesignation=" + Edesignation + ", Esalary=" + Esalary
				+ ", loaction=" + loaction + ", Age=" + Age + ", gender=" + gender + "]";
	}
	
	
}
	
	
	
	
	
	