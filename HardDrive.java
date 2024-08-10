package Composition;

public class HardDrive {
    private String capacity; // Örneğin "1TB"

    public HardDrive(String capacity) {
        this.capacity = capacity;
    }

    public void readData() {
        System.out.println(capacity + " Hard Drive veri okuyor.");
    }
}
