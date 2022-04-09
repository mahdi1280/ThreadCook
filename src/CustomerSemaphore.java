import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public class CustomerSemaphore {

    private final Semaphore semaphore=new Semaphore(3);
    private final List<Customer> customers;

    public CustomerSemaphore() {
        this.customers = Arrays.asList(new Customer("ali"), new Customer("veli"), new Customer("ayse"));
    }

    public Customer getCustomer() throws InterruptedException {
        semaphore.acquire();
        return customers.get(semaphore.availablePermits());
    }

    public void setSemaphore(){
        semaphore.release();
    }




}
