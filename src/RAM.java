public class RAM extends PCComponent {
    private int capacity; // in GB

    public RAM(String name, double price, int capacity,int quantity) {
        super(name, price,quantity);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + capacity + " GB";
    }
}
