package vendingMachine;

public class VendingMachineMain {

    public static void main(String[] args) {
        VendingMachine vendingMachine1 = new VendingMachine();
        VendingMachine vendingMachine2 = new VendingMachine();

        String product = vendingMachine1.pushProductButton(100);
        System.out.println(product);
    }

}
