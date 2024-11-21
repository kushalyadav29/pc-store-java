public class HDD extends PCComponent {
    private int capacity; // in GB

    public HDD(String name, double price, int capacity,int quantity) {
        super(name, price,quantity);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + capacity + " GB";
    }
}
