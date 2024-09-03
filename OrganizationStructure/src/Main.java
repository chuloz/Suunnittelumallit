public class Main {
    public static void main(String[] args) {
        Department headOffice = new Department("Head Office");

        Department itDepartment = new Department("IT Department");
        itDepartment.add(new Employee("Antti",10000));
        itDepartment.add(new Employee("Mohamed", 15000));

        Department hrDepartment = new Department("HR Department");
        hrDepartment.add(new Employee("Liisa", 7500));
    // lisätään uusia työntekijöitä ItDepartmentiin

        Employee newEmployee1 = new Employee("Anna", 8000);
        Employee newEmployee2 = new Employee("Matti", 50000);
        itDepartment.add(newEmployee1);
        itDepartment.add(newEmployee2);
    // lisätään uusia työntekijöitä HrDepartmentiin
        Employee newEmployee3 = new Employee("Sanna", 8000);
        Employee newEmployee4 = new Employee("Vesa", 50000);
        hrDepartment.add(newEmployee3);
        hrDepartment.add(newEmployee4);

    // poistetaan yksi työntekijä itDepartmentistä
        itDepartment.remove(newEmployee2);

    // poistetaan yksi työntekijä hrDepartmentistä
        hrDepartment.remove(newEmployee4);

        headOffice.add(itDepartment);
        headOffice.add(hrDepartment);

        headOffice.printStructure();

        System.out.println("Total salary: " + headOffice.getTotalSalary());
    }
}
