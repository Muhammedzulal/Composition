package Composition;

public class CPU {
    private String model;
    private int clockSpeed; // MHz cinsinden saat hızı

    public CPU(String model, int clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public void process() {
        System.out.println(model + " CPU " + clockSpeed + " MHz hızında çalışıyor.");
    }
}
