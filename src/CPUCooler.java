class CPUCooler extends PCComponent {
    private String coolerType; // "Air" or "Liquid"
    private String size;       // Size or capacity description

    public CPUCooler(String model, double price, String coolerType, String size, int quantity) {
        super(model, price, quantity);
        this.coolerType = coolerType;
        this.size = size;
    }

    public String getCoolerType() {
        return coolerType;
    }

    public String getSize() {
        return size;
    }
}
