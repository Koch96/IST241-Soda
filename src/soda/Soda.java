
package soda;


//@author sak5680

public class Soda {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        machine.fillUp(10);
        
        machine.insertToken();
        machine.insertToken();
        
        System.out.print("Token count: ");
        System.out.println(machine.getTokenCount());
        
        System.out.print("Can count: ");
        System.out.println(machine.getCanCount());
    }

}
