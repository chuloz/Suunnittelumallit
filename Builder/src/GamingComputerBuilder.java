public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    public void buildProcessor() {
        computer.setProcessor("Intel i9 9900K");
    }

    public void buildRAM() {
        computer.setRamSize(32);
    }

    public void buildHardDrive() {
        computer.setHardDrive("1 TB SSD");
    }

    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA RTX 3080");
    }

    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 10");
    }

    public Computer getComputer() {
        return this.computer;
    }
}
