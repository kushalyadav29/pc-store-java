public class GPU extends PCComponent {
    private int memory; // in GB
    private double coreSpeed; // in GHz

    public GPU(String name, double price, int memory, double coreSpeed,int quantity) {
        super(name, price,quantity);
        this.memory = memory;
        this.coreSpeed = coreSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Memory: " + memory + " GB, Core Speed: " + coreSpeed + " GHz";
    }
}
