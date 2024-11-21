public class CPU extends PCComponent {
    private double clockSpeed; // in GHz

    public CPU(String name, double price, double clockSpeed,int qunatity) {
        super(name, price,qunatity);
        this.clockSpeed = clockSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Clock Speed: " + clockSpeed + " GHz";
    }
}
