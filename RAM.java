package Composition;

public class RAM {
    private String capacity; // Örneğin "16GB"

    public RAM(String capacity) {
        this.capacity = capacity;
    }

    public void load() {
        System.out.println(capacity + " RAM yükleniyor.");
    }
}
