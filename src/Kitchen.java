import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Kitchen {

    private final Semaphore semaphore=new Semaphore(3);
    private final List<Cook> cooks;

    public Kitchen() {
        this.cooks = Arrays.asList(new Cook("asd"), new Cook("fd"), new Cook("hg"));
        System.out.println("CookReceivedOrder");
        System.out.println("MachineStartingFood");
    }

    public Cook getCook() throws InterruptedException {
        semaphore.acquire();
        System.out.println("CookStartedFood");
        System.out.println("MachineDoneFood");
        return cooks.get(semaphore.availablePermits());
    }

    public void releaseCook(){
        System.out.println("CookFinishedFood");
        System.out.println("MachineEnding");
        semaphore.release();
    }
}
