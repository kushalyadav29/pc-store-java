import java.util.ArrayList;
import java.util.List;

class Inventory {
    List<CPU> cpus = new ArrayList<>();
    List<GPU> gpus = new ArrayList<>();
    List<RAM> rams = new ArrayList<>();
    List<SSD> ssds = new ArrayList<>();
    List<HDD> hdds = new ArrayList<>();
    List<PowerSupply> powerSupplies = new ArrayList<>();
    List<Cabinet> cabinets = new ArrayList<>();
    List<CPUCooler> cpuCoolers = new ArrayList<>();
    List<Motherboard> motherboards = new ArrayList<>();

    // Methods to add, remove, and get components
    public void addCPU(CPU cpu) {
        cpus.add(cpu);
    }

    public List<CPU> getCPUs() {
        return cpus;
    }

    public void addCabinets(Cabinet cabinet) {
        cabinets.add(cabinet);
    }

    public List<Cabinet> getCabinets() {
        return cabinets;
    }

    public void addGPU(GPU gpu) {
        gpus.add(gpu);
    }

    public List<GPU> getGpus() {
        return gpus;
    }

    public void addRams(RAM ram) {
        rams.add(ram);
    }

    public List<RAM> getRams() {
        return rams;
    }

    public void addSSD(SSD ssd) {
        ssds.add(ssd);
    }

    public List<SSD> getSSD() {
        return ssds;
    }

    public void addHDD(HDD hdd) {
        hdds.add(hdd);
    }

    public List<HDD> getHDD() {
        return hdds;
    }

    public void addPowerSupplies(PowerSupply powerSupply) {
        powerSupplies.add(powerSupply);
    }

    public List<PowerSupply> getPowerSupplies() {
        return powerSupplies;
    }

    public void addCPUCooler(CPUCooler cpuCooler) {
        cpuCoolers.add(cpuCooler);
    }

    public List<CPUCooler> getCPUCoolers() {
        return cpuCoolers;
    }
    
    public void addMotherboard(Motherboard motherboard) {
        motherboards.add(motherboard);
    }

    public List<Motherboard> getMotherboard() {
        return motherboards;
    }

    // Similar add and get methods for other components
}