import java.util.ArrayList;
import java.util.List;
class Cart {
    List<PCComponent> items = new ArrayList<>();

    public void addComponent(PCComponent component) {
        if (component.getQuantity() > 0) {
            items.add(component);
            component.decreaseStock(1);
        } else {
            throw new RuntimeException("Component not available, unable to add to cart.");
        }
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(PCComponent::getPrice).sum();
    }

    public void displayItems() {
        System.out.println("Cart Items:");
        for (PCComponent item : items) {
            System.out.println(item.getName() + " - \u20B9" + item.getPrice());
        }
    }
}
