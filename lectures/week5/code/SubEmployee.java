public class SubEmployee extends Employee {

    @Override public Number getSalary() {
	return 10d + super.getSalary();
    }

}
