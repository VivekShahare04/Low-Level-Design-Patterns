package Structural.Facade;

public class ComputerSystems {
    class CPU {
        public void process() {
            System.out.println("CPU is processing data.");
        }
    }

    class Memory {
        public void load() {
            System.out.println("Memory is loading data.");
        }
    }

    class HardDrive {
        public void read() {
            System.out.println("Hard Drive is reading data.");
        }
    }
}
