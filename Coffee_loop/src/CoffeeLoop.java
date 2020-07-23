import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CoffeeLoop {
    public static void main(String[] args)  {
        int countOfWater = 400;
        int countOfMilk = 540;
        int countOfCoffeeBeans = 120;
        int countOfCups = 9;
        int countOfMoney = 550;

        int[] array = new int[5];
        array[0] = countOfWater;
        array[1] = countOfMilk;
        array[2] = countOfCoffeeBeans;
        array[3] = countOfCups;
        array[4] = countOfMoney;

       Scanner scanner = new Scanner((System.in));
        boolean isTrue = true;

        while (isTrue) {
            System.out.print("Write action (buy, fill, take, remain, exit):\n>");
            String action = null;
                action = scanner.nextLine();

            switch (action) {
                case "buy":
                    array = buy(array);
                    break;
                case "fill":
                    array = fill(array);
                    break;
                case "take":
                    array = take(array);
                    break;
                case "remain":
                    array = remain(array);
                    break;
                case "exit":
                    exit();
                    isTrue = false;
                    break;
            }
        }

    }
    public static int[]  buy(int[] array1) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n>");
        String number = null;
        try {
            number = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch(Integer.parseInt(number)){
            case 1:
                espresso(array1);
                break;
            case 2:
                latte(array1);
                break;
            case 3:
            cappuccino(array1);
            break;

        }
        return array1;
    }

    public static void espresso(int[] array1){
        int countOfWaterForEspresso = 250;
        int countOfCoffeeBeansForEspresso = 16;
        int countOfCupsForEspresso = 1;
        int countOfMoneyForEspresso = 4;
        if(array1[0] < countOfWaterForEspresso)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(array1[2] < countOfCoffeeBeansForEspresso)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else
        {
            System.out.println("I have enough resources, making you a coffee!");
            array1[0] -= countOfWaterForEspresso;
            array1[2] -= countOfCoffeeBeansForEspresso;
            array1[3] -= countOfCupsForEspresso;
            array1[4] += countOfMoneyForEspresso;
        }

    }

    public static void latte(int[] array1){
        int countOfWaterForLatte = 350;
        int countOfMilkForLatte = 75;
        int countOfCoffeeBeansForLatte = 20;
        int countOfCupsForLatte = 1;
        int countOfMoneyForLatte = 7;
        if(array1[0] < countOfWaterForLatte)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(array1[1] < countOfMilkForLatte)
        {
            System.out.println("Sorry, not enough milk!");
        }
        else if(array1[2] < countOfCoffeeBeansForLatte)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else
        {
            System.out.println("I have enough resources, making you a coffee!");
            array1[0] -= countOfWaterForLatte;
            array1[1] -= countOfMilkForLatte;
            array1[2] -= countOfCoffeeBeansForLatte;
            array1[3] -= countOfCupsForLatte;
            array1[4] += countOfMoneyForLatte;
        }

    }
    public static void cappuccino(int[] array1){
        int countOfWaterForCappuccino = 200;
        int countOfMilkForCappuccino = 100;
        int countOfCoffeeBeansForCappuccino = 12;
        int countOfCupsForCappuccino = 1;
        int countOfMoneyForCappuccino = 6;
        if(array1[0] < countOfWaterForCappuccino)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(array1[1] < countOfMilkForCappuccino)
        {
            System.out.println("Sorry, not enough milk!");
        }
        else if(array1[2] < countOfCoffeeBeansForCappuccino)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else
        {
            System.out.println("I have enough resources, making you a coffee!");
            array1[0] -= countOfWaterForCappuccino;
            array1[1] -= countOfMilkForCappuccino;
            array1[2] -= countOfCoffeeBeansForCappuccino;
            array1[3] -= countOfCupsForCappuccino;
            array1[4] += countOfMoneyForCappuccino;
        }

    }

    public static int[]  fill(int[] array1) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("Write how many ml of water do you want to add:\n>");
        int countOfWater = scanner.nextInt();
        array1[0] += countOfWater;

        System.out.print("Write how many ml of milk do you want to add:\n>");
        int countOfMilk = scanner.nextInt();
        array1[1] +=  countOfMilk;

        System.out.print("Write how many grams of coffee beans do you want to add:\n>");

        int countOfCoffeeBeans = scanner.nextInt();
        array1[2] += countOfCoffeeBeans;

        System.out.print("Write how many disposable cups of coffee do you want to add:\n>");
        int countOfCups = scanner.nextInt();
        array1[3] += countOfCups;


        return array1;
    }

    public static int[]  take(int[] array1) {
        int amountOfMoney = array1[4];
        if(amountOfMoney != 0) {
            System.out.println("I gave you " + amountOfMoney);
            array1[4] = 0;
        }else System.out.println("We don't have money for you:(");
        return array1;
    }

    public static int[]  remain(int[] array1) {
        System.out.println("The coffee machine has:");
        System.out.println(array1[0] + " of water");
        System.out.println(array1[1] + " of milk");
        System.out.println(array1[2] + " of coffee beans");
        System.out.println(array1[3] + " of disposable cups");
        System.out.println(array1[4] + " of money");

        return array1;

    }
    public static void exit(){
        return;
    }

}
