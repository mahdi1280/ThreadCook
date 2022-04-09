public class Main {
    public static void main(String[] args) throws InterruptedException {
        Kitchen kitchen = new Kitchen();
        CustomerSemaphore customerSemaphore=new CustomerSemaphore();
        MachineSemaphore machineSemaphore=new MachineSemaphore();

        System.out.println("CookStarting");
        System.out.println("CustomerStarting");
        System.out.println("MachineStarting");
        while (true){
            customerSemaphore.getCustomer();
            kitchen.getCook();
            machineSemaphore.getMachine();
            customerSemaphore.releaseCustomer();
            kitchen.releaseCook();
            machineSemaphore.releaseMachine();
        }

    }
}
