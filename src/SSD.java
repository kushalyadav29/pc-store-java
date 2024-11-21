public class SSD extends PCComponent {
    private int capacity; // in GB

    public SSD(String name, double price, int capacity,int quantity) {
        super(name, price,quantity);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + capacity + " GB";
    }
}
