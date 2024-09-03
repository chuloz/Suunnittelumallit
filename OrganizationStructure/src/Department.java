import java.util.ArrayList;
import java.util.List;

public class Department extends Component {
    private List<Component> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void printStructure() {
        System.out.println("Department: " + name);
        for (Component component : components) {
            component.printStructure();
        }
    }

    @Override
    public double getTotalSalary() {
        return components.stream().mapToDouble(Component::getTotalSalary).sum();
    }
}