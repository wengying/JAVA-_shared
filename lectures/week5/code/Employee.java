public class Employee {

    private static class Salary extends Number {

	private final double baseSalary;

	private Salary(double baseSalary) {
	    this.baseSalary = baseSalary;
	}

    }

    private final String[] uuids;

    private final double baseSalary;

    public Employee(String[] uuids, double baseSalary) {
	this.uuids = uuids;
	this.baseSalary = baseSalary;
    }

    public Number getSalary() {
	return new Salary(baseSalary);
    }
    

}
