package prob04;

public class Depart extends Employee{
	private String departement;
	public Depart(String name, int salary, String departement){
		super(name,salary);
		this.departement=departement;
	}
	
	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + "연봉:" + getSalary()+"부서: "+departement);

	}

}
