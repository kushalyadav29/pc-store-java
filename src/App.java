import java.util.*;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static Inventory inv=new Inventory();
    public static Cart cart=new Cart();

    public static void main(String[] args) {
        initializeComponents();
        System.out.println("Welcome to our PC Store!");

        boolean continueShopping = true;
        while (continueShopping) {
            System.out.println("1. Configure your own PC");
            System.out.println("2. Choose a prebuilt PC");
            System.out.println("3. Buy individual components");

            System.out.print("Please select an option (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    configurePC();
                    break;
                case 2:
                    selectPrebuiltPC();
                    break;
                case 3:
                    buyComponents();
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option from the menu.");
                    break;
            }

            System.out.print("Would you like to buy anything else? (yes/no): ");
            String answer = scanner.next().trim().toLowerCase();
            if (!answer.equals("yes")) {
                continueShopping = false;
            }
        }

        System.out.println("Bye! Thanks for your purchase.");
    }
    public static void initializeComponents()
    {
        // CPU
        inv.addCPU(new CPU("intel i9 13900k", 51000, 5.3, 4));
        inv.addCPU(new CPU("intel i7 13700k", 44000, 5.1, 2));
        inv.addCPU(new CPU("intel i9 13900", 49000, 5.2, 1));
        inv.addCPU(new CPU("intel i7 13700kf", 46500, 5, 2));
        inv.addCPU(new CPU("intel i5 13400f", 29500, 4.9, 5));
        // GPU
        inv.addGPU(new GPU("NVIDIA rtx 3080",47000, 16, 1440, 3));
        inv.addGPU(new GPU("NVIDIA rtx 3070",37000, 12, 1240, 2));
        inv.addGPU(new GPU("NVIDIA rtx 3080ti",49000, 16, 1540, 5));
        inv.addGPU(new GPU("NVIDIA rtx 3060",28000, 8, 1010, 1));
        inv.addGPU(new GPU("NVIDIA rtx 3070 ti",47000, 16, 1340, 2));
        inv.addGPU(new GPU("NVIDIA rtx 3090",57000, 16, 1440, 2));
        // HDD
        inv.addHDD(new HDD("WD", 12400, 2, 1));
        inv.addHDD(new HDD("Seagete", 13500, 2, 3));
        inv.addHDD(new HDD("crucial", 8400, 1, 2));
        inv.addHDD(new HDD("seagete", 9700, 1, 2));
        // SSD
        inv.addSSD(new SSD("WD", 8300, 1, 4));
        inv.addSSD(new SSD("WD", 15300, 2, 4));
        inv.addSSD(new SSD("Crucial", 9300, 1, 4));
        inv.addSSD(new SSD("Seagette", 9700, 1, 4));
        inv.addSSD(new SSD("WD", 8900, 1, 4));
        // CPU cabinet
        inv.addCabinets(new Cabinet("ANT", 7000, "mid tower", "m-ATX", 3));
        inv.addCabinets(new Cabinet("Coolermaster", 13600, "full tower", "ATX", 2));
        inv.addCabinets(new Cabinet("Corsair", 12000, "mid tower", "ATX", 1));
        inv.addCabinets(new Cabinet("ANT", 9600, "mid tower", "m-ATX", 2));
        inv.addCabinets(new Cabinet("ANT", 14200, "full tower", "ATX", 3));
        // CPUCooler
        inv.addCPUCooler(new CPUCooler("Cooler master", 12000, "Liquid", "240mm", 2));
        inv.addCPUCooler(new CPUCooler("Cooler master", 13500, "Liquid", "360mm", 3));
        inv.addCPUCooler(new CPUCooler("Deepcool", 9500, "Air", "120mm", 2));
        inv.addCPUCooler(new CPUCooler("Deepcool", 10000, "Liquid", "120mm", 1));
        // Power Supply
        inv.addPowerSupplies(new PowerSupply("Cooler master", 14000, 800, "gold", 3));
        inv.addPowerSupplies(new PowerSupply("Cooler master", 23000, 1000, "silver", 2));
        inv.addPowerSupplies(new PowerSupply("Cooler master", 23000, 1000, "silver", 2));
        inv.addPowerSupplies(new PowerSupply("Ant", 10500, 750, "bronze", 2));
        // RAM
        inv.addRams(new RAM("corsair", 7000, 16, 5));
        inv.addRams(new RAM("crucial", 7500, 32, 3));
        inv.addRams(new RAM("corsair", 9000, 32, 2));
        inv.addRams(new RAM("crucial", 5000, 8, 7));
        // Motherboard
        inv.addMotherboard(new Motherboard("asus prime vii", 23400, "m-atx", "LGA", 4, 2));
        inv.addMotherboard(new Motherboard("aorus 450M", 17400, "m-atx", "PGA", 4, 3));
        inv.addMotherboard(new Motherboard("gigabyte 550m", 25400, "atx", "LGA", 4, 5));
        inv.addMotherboard(new Motherboard("asus prime ii", 15400, "mini atx", "LGA", 2, 3));
    }
    public static void selectPrebuiltPC() {
        System.out.println("Choose PC type: 1. Workstation 2. Gaming");
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                workstation();
                break;
            case 2:
                gaming();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                return;
        }
    
        cart.displayItems();
        double totalPrice = cart.getTotalPrice();
        System.out.println("Total price of your selected prebuilt PC: \u20B9" + totalPrice);
    }
    
    public static void workstation()
    {
        System.out.println(" choose for \n 1. low end\nprocessor: i5 13400f \nGraphic card:rtx 3060\nRam: corsair 8gb\nSSD: WD 1tb");
        System.out.println("2. mid range\nprocessor: i7 13700f \nGraphic card:rtx 3070\nRam: corsair 16gb\nSSD: WD 1tb");
        System.out.println("3. high range range\nprocessor: i9 13900k \nGraphic card:rtx 3090\nRam: corsair 32gb\nSSD: WD 2tb");
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                cart.addComponent(inv.getCPUs().get(4));  // i5 13400f
                cart.addComponent(inv.getGpus().get(3));  // NVIDIA rtx 3060
                cart.addComponent(inv.getRams().get(3));  // corsair 8gb
                cart.addComponent(inv.getSSD().get(4));   // WD 1tb
                cart.addComponent(inv.getHDD().get(2));   // crucial 1tb
                cart.addComponent(inv.getCabinets().get(3)); // ANT mid tower m-ATX
                cart.addComponent(inv.getPowerSupplies().get(3)); // Ant 750w bronze
                cart.addComponent(inv.getMotherboard().get(3)); // asus prime ii
                cart.addComponent(inv.getCPUCoolers().get(3)); // Deepcool 120mm Liquid
                break;
            case 2:
                cart.addComponent(inv.getCPUs().get(1));  // i7 13700k
                cart.addComponent(inv.getGpus().get(1));  // NVIDIA rtx 3070
                cart.addComponent(inv.getRams().get(0));  // corsair 16gb
                cart.addComponent(inv.getSSD().get(0));   // WD 1tb
                cart.addComponent(inv.getHDD().get(1));   // Seagete 2tb
                cart.addComponent(inv.getCabinets().get(4)); // ANT full tower ATX
                cart.addComponent(inv.getPowerSupplies().get(0)); // Cooler master 800w gold
                cart.addComponent(inv.getMotherboard().get(0)); // asus prime vii
                cart.addComponent(inv.getCPUCoolers().get(0)); // Cooler master 240mm Liquid
                break;
            case 3:
                cart.addComponent(inv.getCPUs().get(0));  // i9 13900k
                cart.addComponent(inv.getGpus().get(5));  // NVIDIA rtx 3090
                cart.addComponent(inv.getRams().get(2));  // corsair 32gb
                cart.addComponent(inv.getSSD().get(1));   // WD 2tb
                cart.addComponent(inv.getHDD().get(0));   // WD 2tb
                cart.addComponent(inv.getCabinets().get(1)); // Coolermaster full tower ATX
                cart.addComponent(inv.getPowerSupplies().get(1)); // Cooler master 1000w silver
                cart.addComponent(inv.getMotherboard().get(2)); // gigabyte 550m
                cart.addComponent(inv.getCPUCoolers().get(1)); // Cooler master 360mm Liquid
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }

    }
    public static void gaming()
    {
        System.out.println("Choose your gaming PC configuration: \n1. Entry-level\nProcessor: Intel i5 13400f \nGraphic card: NVIDIA RTX 3060\nRAM: Corsair 8GB\nSSD: WD 1TB");
        System.out.println("2. Mid-range\nProcessor: Intel i7 13700k \nGraphic card: NVIDIA RTX 3070\nRAM: Corsair 16GB\nSSD: WD 1TB");
        System.out.println("3. High-end\nProcessor: Intel i9 13900k \nGraphic card: NVIDIA RTX 3090\nRAM: Corsair 32GB\nSSD: WD 2TB");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                cart.addComponent(inv.getCPUs().get(4)); // Intel i5 13400f
                cart.addComponent(inv.getGpus().get(3)); // NVIDIA RTX 3060
                cart.addComponent(inv.getRams().get(3)); // Corsair 8GB
                cart.addComponent(inv.getSSD().get(4));  // WD 1TB
                cart.addComponent(inv.getHDD().get(2));  // Assuming an extra HDD
                cart.addComponent(inv.getCabinets().get(3)); // Cabinet
                cart.addComponent(inv.getPowerSupplies().get(3)); // Power Supply
                cart.addComponent(inv.getMotherboard().get(3)); // Motherboard
                cart.addComponent(inv.getCPUCoolers().get(3)); // CPU Cooler
                break;
            case 2:
                cart.addComponent(inv.getCPUs().get(1)); // Intel i7 13700k
                cart.addComponent(inv.getGpus().get(1)); // NVIDIA RTX 3070
                cart.addComponent(inv.getRams().get(0)); // Corsair 16GB
                cart.addComponent(inv.getSSD().get(0));  // WD 1TB
                cart.addComponent(inv.getHDD().get(1));  // Assuming an extra HDD
                cart.addComponent(inv.getCabinets().get(4)); // Cabinet
                cart.addComponent(inv.getPowerSupplies().get(0)); // Power Supply
                cart.addComponent(inv.getMotherboard().get(0)); // Motherboard
                cart.addComponent(inv.getCPUCoolers().get(0)); // CPU Cooler
                break;
            case 3:
                cart.addComponent(inv.getCPUs().get(0)); // Intel i9 13900k
                cart.addComponent(inv.getGpus().get(5)); // NVIDIA RTX 3090
                cart.addComponent(inv.getRams().get(2)); // Corsair 32GB
                cart.addComponent(inv.getSSD().get(1));  // WD 2TB
                cart.addComponent(inv.getHDD().get(0));  // Assuming an extra HDD
                cart.addComponent(inv.getCabinets().get(1)); // Cabinet
                cart.addComponent(inv.getPowerSupplies().get(1)); // Power Supply
                cart.addComponent(inv.getMotherboard().get(2)); // Motherboard
                cart.addComponent(inv.getCPUCoolers().get(1)); // CPU Cooler
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option from 1 to 3.");
                break;
        }
    }
    public static void configurePC() {
        System.out.println("Welcome to the PC configurator!");

        // Select CPU
        chooseComponent("CPU", inv.getCPUs());

        // Select GPU
        chooseComponent("GPU", inv.getGpus());

        // Select RAM
        chooseComponent("RAM", inv.getRams());

        // Select SSD
        chooseComponent("SSD", inv.getSSD());

        // Select HDD
        chooseComponent("HDD", inv.getHDD());

        // Select Power Supply
        chooseComponent("Power Supply", inv.getPowerSupplies());

        // Select Cabinet
        chooseComponent("Cabinet", inv.getCabinets());

        // Select CPU Cooler
        chooseComponent("CPU Cooler", inv.getCPUCoolers());

        // Select Motherboard
        chooseComponent("Motherboard", inv.getMotherboard());

        // Confirm the selections
        System.out.println("Your PC will have the following components:");
        cart.displayItems(); // Assuming the Cart class has the displayItems method

        // Display total price
        System.out.println("Total price of your configuration: \u20B9" + cart.getTotalPrice());
    }

    private static <T extends PCComponent> void chooseComponent(String componentName, List<T> components) {
        System.out.println("Choose a " + componentName + ":");
        for (int i = 0; i < components.size(); i++) {
            T component = components.get(i);
            System.out.println((i + 1) + ". " + component.getName() + " - \u20B9" + component.getPrice());
        }
        int choice = scanner.nextInt();
        cart.addComponent(components.get(choice - 1));
    }
    public static void buyComponents() {
        boolean continueShopping = true;
        while (continueShopping) {
            System.out.println("Select the category of components you want to buy:");
            System.out.println("1. CPU");
            System.out.println("2. GPU");
            System.out.println("3. RAM");
            System.out.println("4. SSD");
            System.out.println("5. HDD");
            System.out.println("6. Power Supply");
            System.out.println("7. Cabinet");
            System.out.println("8. CPU Cooler");
            System.out.println("9. Motherboard");
            System.out.println("10. Finish Shopping");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    chooseComponent("CPU", inv.getCPUs());
                    break;
                case 2:
                    chooseComponent("GPU", inv.getGpus());
                    break;
                case 3:
                    chooseComponent("RAM", inv.getRams());
                    break;
                case 4:
                    chooseComponent("SSD", inv.getSSD());
                    break;
                case 5:
                    chooseComponent("HDD", inv.getHDD());
                    break;
                case 6:
                    chooseComponent("Power Supply", inv.getPowerSupplies());
                    break;
                case 7:
                    chooseComponent("Cabinet", inv.getCabinets());
                    break;
                case 8:
                    chooseComponent("CPU Cooler", inv.getCPUCoolers());
                    break;
                case 9:
                    chooseComponent("Motherboard", inv.getMotherboard());
                    break;
                case 10:
                    continueShopping = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            if (continueShopping) {
                System.out.println("Do you want to continue shopping? (yes/no)");
                String answer = scanner.next();
                continueShopping = answer.equalsIgnoreCase("yes");
            }
        }

        // Display cart content and total price at the end of shopping.
        System.out.println("You have selected the following components:");
        for (PCComponent comp : cart.items) {
            System.out.println(comp.getName() + " - \u20B9" + comp.getPrice());
        }
        System.out.println("Total price: \u20B9" + cart.getTotalPrice());
    }

}  

