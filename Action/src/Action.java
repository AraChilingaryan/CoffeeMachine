import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Action {
    public static void main(String[] args) throws IOException {
        int countOfWater = 400;
        int countOfMilk = 540;
        int countOfCoffeeBeans = 120;
        int countOfMoney = 550;
        int countOfCups = 9;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The coffee machine has:");
        System.out.println(countOfWater + " of water");
        System.out.println(countOfMilk + " of milk");
        System.out.println(countOfCoffeeBeans + " of coffee beans");
        System.out.println(countOfMoney + " of money");
        System.out.println("Write action (buy, fill, take):");
        System.out.print(">");
        String action = reader.readLine();

        if(action.equals("buy"))
            buy(countOfWater,countOfMilk,countOfCoffeeBeans,countOfMoney,countOfCups);
        if(action.equals("fill"))
            fill(countOfWater,countOfMilk,countOfCoffeeBeans,countOfMoney,countOfCups);
        if(action.equals("take"))
            take(countOfWater,countOfMilk,countOfCoffeeBeans,countOfMoney,countOfCups);

        reader.close();

    }
    public static void buy(int countOfWater, int countOfMilk,int countOfCoffeeBeans, int countOfMoney,int countOfCups) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        System.out.print(">");
        String number = reader.readLine();
        System.out.println(number);
        if(number.equals("1")){
            System.out.println("The coffee machine has:");
            System.out.println(countOfWater - 250 + " of water");
            System.out.println(countOfMilk + " of milk");
            System.out.println(countOfCoffeeBeans - 16 + " of coffee beans");
            System.out.println(countOfCups - 1 + " of disposable cups");
            System.out.println(countOfMoney + 4 + " of money");
        }
        if(number.equals("2")){
            System.out.println("The coffee machine has:");
            System.out.println(countOfWater - 350 + " of water");
            System.out.println(countOfMilk - 75 + " of milk");
            System.out.println(countOfCoffeeBeans - 20 + " of coffee beans");
            System.out.println(countOfCups - 1 + " of disposable cups");
            System.out.println(countOfMoney + 7 + " of money");
        }

        if(number.equals("3")){
            System.out.println("The coffee machine has:");
            System.out.println(countOfWater - 200 + " of water");
            System.out.println(countOfMilk - 100 + " of milk");
            System.out.println(countOfCoffeeBeans - 12 + " of coffee beans");
            System.out.println(countOfCups - 1 + " of disposable cups");
            System.out.println(countOfMoney + 6 + " of money");
        }
        reader.close();

    }

    public static void fill(int countOfWater, int countOfMilk,int countOfCoffeeBeans, int countOfMoney,int countOfCups) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write how many ml of water do you want to add:");
        System.out.print(">");
        int countOfWater1 = Integer.parseInt(reader.readLine());
        System.out.println(countOfWater);

        System.out.println("Write how many ml of milk do you want to add:");
        System.out.print(">");
        int countOfMilk1 = Integer.parseInt(reader.readLine());
        System.out.println(countOfMilk);

        System.out.println("Write how many grams of coffee beans do you want to add:");
        System.out.print(">");
        int countOfCoffeeBeans1 = Integer.parseInt(reader.readLine());
        System.out.println(countOfCoffeeBeans);

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        System.out.print(">");
        int countOfCups1 = Integer.parseInt(reader.readLine());
        System.out.println(countOfCups);

        System.out.println("The coffee machine has:");
        System.out.println(countOfWater + countOfWater1 + " of water");
        System.out.println(countOfMilk + countOfMilk1 + " of milk");
        System.out.println(countOfCoffeeBeans + countOfCoffeeBeans1 + " of coffee beans");
        System.out.println(countOfCups + countOfCups1 + " of disposable cups");
        System.out.println(countOfMoney + " of money");

        reader.close();

    }

    public static void take(int countOfWater, int countOfMilk,int countOfCoffeeBeans, int countOfMoney,int countOfCups){
        System.out.println("I gave you $550");
        System.out.println(countOfWater + " of water");
        System.out.println(countOfMilk  + " of milk");
        System.out.println(countOfCoffeeBeans  + " of coffee beans");
        System.out.println(countOfCups + " of disposable cups");
        System.out.println(0 + " of money");
    }
}
