package Composition;

public class Bilgisayar {
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;

    public Bilgisayar(CPU cpu, RAM ram, HardDrive hardDrive) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public void start() {
        cpu.process();
        ram.load();
        hardDrive.readData();
        System.out.println("Bilgisayar başlatıldı.");
    }
}
