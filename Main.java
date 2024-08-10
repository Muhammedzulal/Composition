package Composition;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel i7", 3200);
        RAM ram = new RAM("16GB");
        HardDrive hardDrive = new HardDrive("1TB");

        Bilgisayar bilgisayar = new Bilgisayar(cpu, ram, hardDrive);
        bilgisayar.start();
    }
}
