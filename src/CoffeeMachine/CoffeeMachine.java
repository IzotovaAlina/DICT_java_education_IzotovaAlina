package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] arg){
        System.out.println("Write how many cups of coffee you will need:");
        Scanner Scanner = new Scanner(System.in);
        int input = Scanner.nextInt();
        int water = 200;
        int milk = 50;
        int coffee = 15;
        System.out.println("For "+ input + " cups of coffee you will need:\n" +
                + water * input +" ml of water\n" +
                + milk * input +" ml of milk\n" +
                + coffee * input +" g of coffee beans");
    }
}
