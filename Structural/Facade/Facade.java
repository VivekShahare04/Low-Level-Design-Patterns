package Structural.Facade;

public class Facade {
    private ComputerSystems.CPU cpu = new  ComputerSystems().new CPU(); 
    private ComputerSystems.Memory memory = new  ComputerSystems().new Memory();
    private ComputerSystems.HardDrive hardDrive = new  ComputerSystems().new HardDrive();

    public Facade(){
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        cpu.process();
        memory.load();
        hardDrive.read();
        System.out.println("Computer has started successfully.");
    }
}
