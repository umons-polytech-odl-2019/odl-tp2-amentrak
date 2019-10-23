package exercise1;
import java.util.*;

public class buildFixedSalaryEmployee extends Employee {

 private int salary = 0;
	public buildFixedSalaryEmployee(String name, int fixedSalary) {
		super(name);
		this.salary = fixedSalary;
	}
	public void workOneHour(){
		super.workOneHour();
	}
	@Override
	public int computeSalary(){
		return this.salary;
	}
}

