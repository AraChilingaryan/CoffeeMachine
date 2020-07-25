import java.util.Scanner;

public class CoffeeMachineStates {
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int cups = 9;
    int money = 550;
    States state = States.READY;
    Scanner scanner = new Scanner(System.in);

    /**
     * this method is brain for our class
     * its  works with states and change our machine states depending
     * on our choice,also calls other methods from this class
     *
     */
    private void action(String  action){
        boolean isDigit = isDigit(action);

        if(action.equals("buy")){
            System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n>");
            state = States.SELECTCOFFEE;
        }

        if(isDigit && state == States.SELECTCOFFEE) {
            buy(Integer.parseInt(action));
            IsReady();
        }

        if (action.equals("fill")) {
            System.out.print("Write how many ml of water do you want to add:\n>");
            state = States.FILLWATER;
        }
        else if (isDigit && state == States.FILLWATER) {
            water += Integer.parseInt(action);
            state = States.FILLMILK;
            System.out.print("Write how many ml of milk do you want to add:\n>");

        }
        else if (isDigit && state == States.FILLMILK) {
            milk += Integer.parseInt(action);
            state = States.FILLCOFFEE;
            System.out.print("Write how many grams of coffee beans do you want to add:\n>");
        }
        else if (isDigit && state == States.FILLCOFFEE) {
            coffeeBeans += Integer.parseInt(action);
            state = States.FILLCUPS;
            System.out.print("Write how many disposable cups of coffee do you want to add:\n>");
        }
        else if (isDigit && state == States.FILLCUPS) {
            cups += Integer.parseInt(action);
            IsReady();
        }
        if (action.equals("take")) {
            take();
            IsReady();
        }
        if (action.equals("remain")) {
            remain();
            IsReady();
        }
        if (action.equals("exit")) {
            exit();
        }
    }

    /**
     *  prints what kind of coffee has machine
     *  and depending on our choice calls for us method which makes coffee
     *
     */
    private void buy(int input){
        switch(input){
            case 1:
                espresso();
                break;
            case 2:
                latte();
                break;
            case 3:
                cappuccino();
                break;
        }
    }

    /**
     * prints does machine have enough resources for cappuccino
     * and changes counts of ingredients in machine
     */

    private void cappuccino(){
        int countOfWaterForCappuccino = 200;
        int countOfMilkForCappuccino = 100;
        int countOfCoffeeBeansForCappuccino = 12;
        int countOfCupsForCappuccino = 1;
        int countOfMoneyForCappuccino = 6;
        if(water < countOfWaterForCappuccino)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(milk < countOfMilkForCappuccino)
        {
            System.out.println("Sorry, not enough milk!");
        }
        else if(coffeeBeans < countOfCoffeeBeansForCappuccino)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else
        {
            System.out.println("I have enough resources, making you a coffee!");
            water -= countOfWaterForCappuccino;
            milk -= countOfMilkForCappuccino;
            coffeeBeans -= countOfCoffeeBeansForCappuccino;
            cups -= countOfCupsForCappuccino;
            money += countOfMoneyForCappuccino;
        }

    }
    /**
     * prints does machine have enough resources for espresso
     * and changes counts of ingredients in machine
     */
    private void espresso(){
        int countOfWaterForEspresso = 250;
        int countOfCoffeeBeansForEspresso = 16;
        int countOfCupsForEspresso = 1;
        int countOfMoneyForEspresso = 4;
        if(water < countOfWaterForEspresso)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(milk < countOfCoffeeBeansForEspresso)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else
        {
            System.out.println("I have enough resources, making you a coffee!");
            water -= countOfWaterForEspresso;
            coffeeBeans -= countOfCoffeeBeansForEspresso;
            cups -= countOfCupsForEspresso;
            money += countOfMoneyForEspresso;
        }


    }
    /**
     * prints does machine have enough resources for latte
     * and changes counts of ingredients in machine
     */
    private void latte(){
        int countOfWaterForLatte = 350;
        int countOfMilkForLatte = 75;
        int countOfCoffeeBeansForLatte = 20;
        int countOfCupsForLatte = 1;
        int countOfMoneyForLatte = 7;
        if(water < countOfWaterForLatte)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(milk < countOfMilkForLatte)
        {
            System.out.println("Sorry, not enough milk!");
        }
        else if(coffeeBeans < countOfCoffeeBeansForLatte)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else
        {
            System.out.println("I have enough resources, making you a coffee!");
            water -= countOfWaterForLatte;
            milk -= countOfMilkForLatte;
            coffeeBeans -= countOfCoffeeBeansForLatte;
            cups -= countOfCupsForLatte;
            money += countOfMoneyForLatte;
        }


    }

    /**
     * this method returns machine menu
     * and also changes states to ready
     */
    private void IsReady(){
        System.out.print("Write action (buy, fill, take, remain, exit):\n>");
        state = States.READY;
    }

    /**
     *return  boolean value if our input is digit

     */
    private boolean isDigit(String input){
        for (int i = 0; i < input.length(); ++i) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * shows us what machine has and how much
     */
    private void remain(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

    }

    /**
     * gives us money
     */
    private void take(){
        if(money != 0) {
            System.out.println("I gave you " + money);
            money = 0;
        }else System.out.println("We don't have money for you:(");
    }

    /**
     * changes state to off
     */
    private void exit(){
        state = States.OFF;
    }


    public static void main(String[] args)  {
        CoffeeMachineStates coffeeMachineStates = new CoffeeMachineStates();
        System.out.print("Write action (buy, fill, take, remain, exit):\n>");
        while(coffeeMachineStates.state != States.OFF){
            coffeeMachineStates.action(coffeeMachineStates.scanner.nextLine());
        }

    }

}

