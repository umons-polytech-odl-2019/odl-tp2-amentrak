package exercise1;
import java.util.*;

public abstract class Employee {
	private final String name;
	private int workedhours =0;
	private int sales =0;

	protected Employee(String name){
		this.name=name;
	}
	public abstract int computeSalary();

	public void sell() {
		sales++;
	}
protected int getSales(){
		return sales;
}
	public void workOneHour() {
		this.workedhours +=1;
	}

	public int getWorkedhours() {
		return workedhours;
	}

	public String getName() {
		return name;
	}
}
