public class Main {
    public static void main(String[] args) throws InterruptedException {
        Kitchen kitchen = new Kitchen();
        Cook cook = kitchen.getCook();
        System.out.println("customer starting");
        System.out.println(cook);
        Cook cook1=kitchen.getCook();
        System.out.println(cook1);
        kitchen.getCook();
        kitchen.releaseCook();
        kitchen.getCook();

    }
}
