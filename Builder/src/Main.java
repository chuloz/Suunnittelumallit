public class Main {
    public static void main(String[] args) {
        // Rakennetaan pelitietokone
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(gamingBuilder);
        director1.constructComputer();
        Computer gamingComputer = director1.getComputer();
        System.out.println("Gaming Computer Configuration:");
        System.out.println(gamingComputer);

        // Rakennetaan toimistotietokone
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(officeBuilder);
        director2.constructComputer();
        Computer officeComputer = director2.getComputer();
        System.out.println("Office Computer Configuration:");
        System.out.println(officeComputer);
    }
}
