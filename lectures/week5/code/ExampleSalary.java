public class ExampleSalary {

    public static void main(String[] args) {
	Employee employee = new Employee(createOneMillionUUIDs(), 100d);
	    }
	Number salary = employee.getSalary();
	computeBonus(salary);
    }

    private static void computeBonus(Number salary) {
	// TODO - do something memory intensive
    }

}
