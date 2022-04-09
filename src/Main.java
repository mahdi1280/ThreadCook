public class Main {
    public static void main(String[] args) throws InterruptedException {
        Kitchen kitchen = new Kitchen();
        CustomerSemaphore customerSemaphore=new CustomerSemaphore();
        System.out.println("CookStarting");
        System.out.println("CustomerStarting");
        System.out.println("MachineStarting");
        while (true){
            customerSemaphore.getCustomer();
            kitchen.getCook();
            customerSemaphore.releaseCustomer();
            kitchen.releaseCook();
        }

    }
}
