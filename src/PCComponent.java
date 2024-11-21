public class PCComponent {
    private String name;
    private double price;
    private int quantity;

    public PCComponent(String name, double price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void decreaseStock(int i)
    {
        this.quantity-=i;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
