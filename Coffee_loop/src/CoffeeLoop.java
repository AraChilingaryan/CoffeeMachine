import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeLoop {
    public static void main(String[] args) throws IOException {
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

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("Write action (buy, fill, take, remain, exit):");
            System.out.print(">");
            String action = reader.readLine();

            if (action.equals("buy")) {
                array = buy(array);
            }

            if (action.equals("fill")) {

                array = fill(array);
            }
            if (action.equals("take")) {
                array = take(array);
            }
            if (action.equals("remain")) {
                array = remain(array);
            }
            if (action.equals("exit")) {
                exit();
                break;
            }

        }

        reader.close();
    }
    public static int[]  buy(int[] array1) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        System.out.print(">");
        String number = reader.readLine();
        //reader.close();
        if(number.equals("1")){

            if(array1[0] < 250)
            {
                System.out.println("Sorry, not enough water!");
            }
            else if(array1[2] < 16)
            {
                System.out.println("Sorry, not enough coffee beans!");
            }
            else
            {
                System.out.println("I have enough resources, making you a coffee!");
                array1[0] -= 250;
                array1[2] -= 16;
                array1[3] -= 1;
                array1[4] += 4;
            }

        }
        if(number.equals("2"))
        {
            if(array1[0] < 350)
            {
                System.out.println("Sorry, not enough water!");
            }
            else if(array1[1] < 75)
            {
                System.out.println("Sorry, not enough milk!");
            }
            else if(array1[2] < 20)
            {
                System.out.println("Sorry, not enough coffee beans!");
            }
            else
            {
                System.out.println("I have enough resources, making you a coffee!");
                array1[0] -= 350;
                array1[1] -= 75;
                array1[2] -= 20;
                array1[3] -= 1;
                array1[4] += 7;
            }


        }

        if(number.equals("3"))
        {
            if(array1[0] < 200)
            {
                System.out.println("Sorry, not enough water!");
            }
            else if(array1[1] < 100)
            {
                System.out.println("Sorry, not enough milk!");
            }
            else if(array1[2] < 12)
            {
                System.out.println("Sorry, not enough coffee beans!");
            }
            else
            {
                System.out.println("I have enough resources, making you a coffee!");
                array1[0] -= 200;
                array1[1] -= 100;
                array1[2] -= 12;
                array1[3] -= 1;
                array1[4] += 6;
            }

        }


        return array1;
    }

    public static int[]  fill(int[] array1) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write how many ml of water do you want to add:");
        System.out.print(">");
        int countOfWater = Integer.parseInt(reader.readLine());
        System.out.println( countOfWater);
        array1[0] += countOfWater;

        System.out.println("Write how many ml of milk do you want to add:");
        System.out.print(">");
        int countOfMilk = Integer.parseInt(reader.readLine());
        System.out.println(countOfMilk);
        array1[1] +=  countOfMilk;

        System.out.println("Write how many grams of coffee beans do you want to add:");
        System.out.print(">");
        int countOfCoffeeBeans = Integer.parseInt(reader.readLine());
        System.out.println(countOfCoffeeBeans);
        array1[2] += countOfCoffeeBeans;

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        System.out.print(">");
        int countOfCups = Integer.parseInt(reader.readLine());
        System.out.println(countOfCups);
        array1[3] += countOfCups;

        //  reader.close();

        return array1;
    }

    public static int[]  take(int[] array1) throws IOException{
        System.out.println("I gave you " + array1[4] );
        array1[4] = 0;
        return array1;
    }

    public static int[]  remain(int[] array1) throws IOException{
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
