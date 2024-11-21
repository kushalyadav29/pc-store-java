public class Cabinet extends PCComponent {
    private String material;
    private String formFactor; // e.g., ATX, microATX

    public Cabinet(String name, double price, String material, String formFactor,int qunatity) {
        super(name, price,qunatity);
        this.material = material;
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material + ", Form Factor: " + formFactor;
    }
}
