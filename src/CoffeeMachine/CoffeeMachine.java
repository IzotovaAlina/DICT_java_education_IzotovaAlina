package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] arg) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Write how many ml of water the coffee machine has: ");
        int water = Scanner.nextInt();

        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk = Scanner.nextInt();

        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int beans = Scanner.nextInt();

        System.out.print("Write how many cups of coffee you will need: ");
        int cups = Scanner.nextInt();

        int waterCup = water / 200;
        int milkCup = milk / 50;
        int beansCup = beans / 15;

        int limit = Math.min(waterCup, Math.min(milkCup, beansCup));

        if (cups > limit) {
            System.out.println("No, I can make only " + limit + " cup(s) of coffee");

        } else if (cups == limit) {
            System.out.println("Yes, I can make that amount of coffee");

        } else {
            int remainder = limit - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + remainder + " more than that)");
        }
    }
}
