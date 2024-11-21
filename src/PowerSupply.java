public class PowerSupply extends PCComponent {
    private int wattage;
    private String efficiency; // e.g., "80 Plus Gold"

    public PowerSupply(String name, double price, int wattage, String efficiency,int quantity) {
        super(name, price,quantity);
        this.wattage = wattage;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wattage: " + wattage + "W, Efficiency: " + efficiency;
    }
}
