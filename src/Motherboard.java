public class Motherboard extends PCComponent {
    private String formFactor;
    private String socketType;
    private int maxRAMSupport; // Maximum RAM support in GB

    public Motherboard(String name, double price, String formFactor, String socketType, int maxRAMSupport, int quantity) {
        super(name, price, quantity);
        this.formFactor = formFactor;
        this.socketType = socketType;
        this.maxRAMSupport = maxRAMSupport;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getSocketType() {
        return socketType;
    }

    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }

    public int getMaxRAMSupport() {
        return maxRAMSupport;
    }

    public void setMaxRAMSupport(int maxRAMSupport) {
        this.maxRAMSupport = maxRAMSupport;
    }

    @Override
    public String toString() {
        return String.format("%s: %s, Form Factor: %s, Socket Type: %s, Max RAM Support: %dGB, Price: $%.2f, Quantity: %d",
                getClass().getSimpleName(), getName(), formFactor, socketType, maxRAMSupport, getPrice(), getQuantity());
    }
}
