public class Machine {

    private String name;
    private MachineTypeFood machineTypeFood;

    public Machine(String name, MachineTypeFood machineTypeFood) {
        this.name = name;
        this.machineTypeFood = machineTypeFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MachineTypeFood getMachineTypeFood() {
        return machineTypeFood;
    }

    public void setMachineTypeFood(MachineTypeFood machineTypeFood) {
        this.machineTypeFood = machineTypeFood;
    }
}
