import java.util.Scanner;

public class CoffeeLoop {
    public static void main(String[] args)  {
        int countOfWater = 400;
        int countOfMilk = 540;
        int countOfCoffeeBeans = 120;
        int countOfCups = 9;
        int countOfMoney = 550;

        int[] arrayOfIngredients = new int[5];
        arrayOfIngredients[0] = countOfWater;
        arrayOfIngredients[1] = countOfMilk;
        arrayOfIngredients[2] = countOfCoffeeBeans;
        arrayOfIngredients[3] = countOfCups;
        arrayOfIngredients[4] = countOfMoney;

       Scanner scanner = new Scanner((System.in));
        boolean isTrue = true;

        while (isTrue) {
            System.out.print("Write action (buy, fill, take, remain, exit):\n>");
            String action = null;
                action = scanner.nextLine();

            switch (action) {
                case "buy":
                    arrayOfIngredients = buy(arrayOfIngredients);
                    break;
                case "fill":
                    arrayOfIngredients = fill(arrayOfIngredients);
                    break;
                case "take":
                    arrayOfIngredients = take(arrayOfIngredients);
                    break;
                case "remain":
                    arrayOfIngredients = remain(arrayOfIngredients);
                    break;
                case "exit":
                    exit();
                    isTrue = false;
                    break;
            }
        }

    }
    /**
     * prints what kind of coffee hs machine
     * @return array of ingredients
     */
    public static int[]  buy(int[] arrayOfIngredients) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n>");

        String number = scanner.nextLine();

        switch(Integer.parseInt(number)){
            case 1:
                espresso(arrayOfIngredients);
                break;
            case 2:
                latte(arrayOfIngredients);
                break;
            case 3:
            cappuccino(arrayOfIngredients);
            break;

        }
        return arrayOfIngredients;
    }

    /**
     * prints does machine have enough resources for Espresso
     * and changes argument's parameters
     * @param arrayOfIngredients
     */

    public static void espresso(int[] arrayOfIngredients){
        int countOfWaterForEspresso = 250;
        int countOfCoffeeBeansForEspresso = 16;
        int countOfCupsForEspresso = 1;
        int countOfMoneyForEspresso = 4;
        if(arrayOfIngredients[0] < countOfWaterForEspresso)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(arrayOfIngredients[2] < countOfCoffeeBeansForEspresso)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else
        {
            System.out.println("I have enough resources, making you a coffee!");
            arrayOfIngredients[0] -= countOfWaterForEspresso;
            arrayOfIngredients[2] -= countOfCoffeeBeansForEspresso;
            arrayOfIngredients[3] -= countOfCupsForEspresso;
            arrayOfIngredients[4] += countOfMoneyForEspresso;
        }

    }
    /**
     * prints does machine have enough resources for latte
     * and changes argument's parameters
     * @param arrayOfIngredients
     */

    public static void latte(int[] arrayOfIngredients){
        int countOfWaterForLatte = 350;
        int countOfMilkForLatte = 75;
        int countOfCoffeeBeansForLatte = 20;
        int countOfCupsForLatte = 1;
        int countOfMoneyForLatte = 7;
        if(arrayOfIngredients[0] < countOfWaterForLatte)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(arrayOfIngredients[1] < countOfMilkForLatte)
        {
            System.out.println("Sorry, not enough milk!");
        }
        else if(arrayOfIngredients[2] < countOfCoffeeBeansForLatte)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else
        {
            System.out.println("I have enough resources, making you a coffee!");
            arrayOfIngredients[0] -= countOfWaterForLatte;
            arrayOfIngredients[1] -= countOfMilkForLatte;
            arrayOfIngredients[2] -= countOfCoffeeBeansForLatte;
            arrayOfIngredients[3] -= countOfCupsForLatte;
            arrayOfIngredients[4] += countOfMoneyForLatte;
        }

    }
    /**
     * prints does machine have enough resources for cappuccino
     * and changes argument's parameters
     * @param arrayOfIngredients
     */
    public static void cappuccino(int[] arrayOfIngredients){
        int countOfWaterForCappuccino = 200;
        int countOfMilkForCappuccino = 100;
        int countOfCoffeeBeansForCappuccino = 12;
        int countOfCupsForCappuccino = 1;
        int countOfMoneyForCappuccino = 6;
        if(arrayOfIngredients[0] < countOfWaterForCappuccino)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(arrayOfIngredients[1] < countOfMilkForCappuccino)
        {
            System.out.println("Sorry, not enough milk!");
        }
        else if(arrayOfIngredients[2] < countOfCoffeeBeansForCappuccino)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else
        {
            System.out.println("I have enough resources, making you a coffee!");
            arrayOfIngredients[0] -= countOfWaterForCappuccino;
            arrayOfIngredients[1] -= countOfMilkForCappuccino;
            arrayOfIngredients[2] -= countOfCoffeeBeansForCappuccino;
            arrayOfIngredients[3] -= countOfCupsForCappuccino;
            arrayOfIngredients[4] += countOfMoneyForCappuccino;
        }

    }

    /**
     * prints what and how much we want to add
     * @param   arrayOfIngredients
     * @return changed arrayOfArguments
     */

    public static int[]  fill(int[] arrayOfIngredients) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("Write how many ml of water do you want to add:\n>");
        int countOfWater = scanner.nextInt();
        arrayOfIngredients[0] += countOfWater;

        System.out.print("Write how many ml of milk do you want to add:\n>");
        int countOfMilk = scanner.nextInt();
        arrayOfIngredients[1] +=  countOfMilk;

        System.out.print("Write how many grams of coffee beans do you want to add:\n>");

        int countOfCoffeeBeans = scanner.nextInt();
        arrayOfIngredients[2] += countOfCoffeeBeans;

        System.out.print("Write how many disposable cups of coffee do you want to add:\n>");
        int countOfCups = scanner.nextInt();
        arrayOfIngredients[3] += countOfCups;


        return arrayOfIngredients;
    }

    /**
     * prints and give us money from machine
     * @param arrayOfIngredients
     * @return changed arrayOfIngredients
     */

    public static int[]  take(int[] arrayOfIngredients) {
        int amountOfMoney = arrayOfIngredients[4];
        if(amountOfMoney != 0) {
            System.out.println("I gave you " + amountOfMoney);
            arrayOfIngredients[4] = 0;
        }else System.out.println("We don't have money for you:(");
        return arrayOfIngredients;
    }

    /**
     * prints how much ingredients has machune at that moment
     * @param arrayOfIngredients
     * @return  arrayOfIngredients
     */
    public static int[]  remain(int[] arrayOfIngredients) {
        System.out.println("The coffee machine has:");
        System.out.println(arrayOfIngredients[0] + " of water");
        System.out.println(arrayOfIngredients[1] + " of milk");
        System.out.println(arrayOfIngredients[2] + " of coffee beans");
        System.out.println(arrayOfIngredients[3] + " of disposable cups");
        System.out.println(arrayOfIngredients[4] + " of money");

        return arrayOfIngredients;

    }

    /**
     * calling exit machine interrupts its work
     * and program finished with 0;
     */
    public static void exit(){
        return;
    }

}
