import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Action {
    public static void main(String[] args)  {
        int countOfWater = 400;
        int countOfMilk = 540;
        int countOfCoffeeBeans = 120;
        int countOfMoney = 550;
        int countOfCups = 9;

        Scanner scanner = new Scanner(System.in);
        System.out.println("The coffee machine has:");
        System.out.println(countOfWater + " of water");
        System.out.println(countOfMilk + " of milk");
        System.out.println(countOfCoffeeBeans + " of coffee beans");
        System.out.println(countOfMoney + " of money");
        System.out.print("Write action (buy, fill, take):\n>");
        String action = scanner.nextLine();
        switch (action){
            case "buy":
                buy(countOfWater,countOfMilk,countOfCoffeeBeans,countOfMoney,countOfCups);
                break;
            case "fill":
                fill(countOfWater,countOfMilk,countOfCoffeeBeans,countOfMoney,countOfCups);
                break;
            case "take":
                take(countOfWater,countOfMilk,countOfCoffeeBeans,countOfMoney,countOfCups);
                break;

        }
        scanner.close();

    }

    /**
     * prints what we want to buy
     * and call that method
     *
     */
    public static void buy(int countOfWater, int countOfMilk,int countOfCoffeeBeans, int countOfMoney,int countOfCups){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:\n>");
        String number = scanner.nextLine();
        switch (Integer.parseInt(number)){
            case 1:
                espresso(countOfWater, countOfMilk,countOfCoffeeBeans,countOfCups,countOfMoney);
                break;
            case 2:
                latte(countOfWater, countOfMilk,countOfCoffeeBeans,countOfCups,countOfMoney);
                break;
            case 3:
                cappuccino(countOfWater, countOfMilk,countOfCoffeeBeans,countOfCups,countOfMoney);
                break;
        }

        scanner.close();

    }

    /**
     * prints changes after buying espresso
     *
     */
    public static void espresso(int countOfWater, int countOfMilk,int countOfCoffeeBeans,int countOfCups, int countOfMoney){
        System.out.println("The coffee machine has:");
        System.out.println(countOfWater - 250 + " of water");
        System.out.println(countOfMilk + " of milk");
        System.out.println(countOfCoffeeBeans - 16 + " of coffee beans");
        System.out.println(countOfCups - 1 + " of disposable cups");
        System.out.println(countOfMoney + 4 + " of money");

    }

    /**
     * prints changes after buying latte
     *
     */

    public static void latte(int countOfWater, int countOfMilk,int countOfCoffeeBeans,int countOfCups, int countOfMoney){
        System.out.println("The coffee machine has:");
        System.out.println(countOfWater - 350 + " of water");
        System.out.println(countOfMilk - 75 + " of milk");
        System.out.println(countOfCoffeeBeans - 20 + " of coffee beans");
        System.out.println(countOfCups - 1 + " of disposable cups");
        System.out.println(countOfMoney + 7 + " of money");
    }

    /**
     *prints changes after buying cappuccino
     *
     */

    public static void cappuccino(int countOfWater, int countOfMilk,int countOfCoffeeBeans,int countOfCups, int countOfMoney){
        System.out.println("The coffee machine has:");
        System.out.println(countOfWater - 200 + " of water");
        System.out.println(countOfMilk - 100 + " of milk");
        System.out.println(countOfCoffeeBeans - 12 + " of coffee beans");
        System.out.println(countOfCups - 1 + " of disposable cups");
        System.out.println(countOfMoney + 6 + " of money");
    }

    /**
     * prints what we add what it becomes after that
     *
     */

    public static void fill(int countOfWater, int countOfMilk,int countOfCoffeeBeans, int countOfMoney,int countOfCups) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many ml of water do you want to add:\n>");
           int countOfWater1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Write how many ml of milk do you want to add:\n>");
           int countOfMilk1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Write how many grams of coffee beans do you want to add:\n>");
           int countOfCoffeeBeans1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Write how many disposable cups of coffee do you want to add:\n>");
           int countOfCups1 = Integer.parseInt(scanner.nextLine());

        System.out.println("The coffee machine has:");
        System.out.println(countOfWater + countOfWater1 + " of water");
        System.out.println(countOfMilk + countOfMilk1 + " of milk");
        System.out.println(countOfCoffeeBeans + countOfCoffeeBeans1 + " of coffee beans");
        System.out.println(countOfCups + countOfCups1 + " of disposable cups");
        System.out.println(countOfMoney + " of money");

        scanner.close();

    }

    /**
     * prints how much money it gives us
     * and what we have after that
     */

    public static void take(int countOfWater, int countOfMilk,int countOfCoffeeBeans, int countOfMoney,int countOfCups){
        System.out.println("I gave you $550");
        System.out.println(countOfWater + " of water");
        System.out.println(countOfMilk  + " of milk");
        System.out.println(countOfCoffeeBeans  + " of coffee beans");
        System.out.println(countOfCups + " of disposable cups");
        System.out.println(0 + " of money");
    }
}
