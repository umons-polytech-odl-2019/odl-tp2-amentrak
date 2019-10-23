package exercise1;

public class buildBaseSalaryPlusCommissionEmployee extends  Employee{

	private int baseSalary;
	private int commission;
	public buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission){
		super(name);
		this.baseSalary= baseSalary;
		this.commission=commission;
	}
	@Override
	public int computeSalary(){
		return baseSalary + getSales() * commission;
	}
}
}
