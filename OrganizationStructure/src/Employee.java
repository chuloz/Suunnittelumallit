public class Employee  extends Component{
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void printStructure() {
        System.out.println("Employee:" + name + ", salary;" + salary);
    }

    @Override
    public double getTotalSalary() {
        return salary;
    }
}
