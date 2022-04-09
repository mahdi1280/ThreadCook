import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public class MachineSemaphore {

    private final Semaphore semaphore=new Semaphore(3);
    private final List<Machine> machines;

    public MachineSemaphore() {
        this.machines = Arrays.asList(new Machine("asd",MachineTypeFood.FAST_FOOD)
                ,new Machine("afg",MachineTypeFood.FAST_FOOD),new Machine("masd",MachineTypeFood.FAST_FOOD));
        System.out.println("MachineStartingFood");

    }

    public Machine getMachine() throws InterruptedException {
        semaphore.acquire();
        System.out.println("MachineDoneFood");
        return machines.get(semaphore.availablePermits());
    }

    public void releaseMachine() {
        System.out.println("MachineEnding");
        semaphore.release();
    }

}
