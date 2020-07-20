import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class EnoughCoffee {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(">");
        String countOfWater = bufferedReader.readLine();
        list.add(Integer.parseInt(countOfWater) / 200);

        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print(">");
        String countOfMilk = bufferedReader.readLine();
        list.add(Integer.parseInt(countOfMilk) / 50);

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print(">");
        String countOfCoffee_Beans = bufferedReader.readLine();
        list.add(Integer.parseInt(countOfCoffee_Beans) / 15);

        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">");
        String count = bufferedReader.readLine();

        Collections.sort(list);
        if(list.get(0) < Integer.parseInt(count)){
            System.out.println("No, I can make only " + list.get(0) + " cup(s) of coffee");
        }

        if(list.get(0) == Integer.parseInt(count)){
            System.out.println("Yes, I can make that amount of coffee");
        }

        if(list.get(0) > Integer.parseInt(count)){
            System.out.println("Yes, I can make that amount of coffee" + " (and even " + (list.get(0) - Integer.parseInt(count)) + " more than that)");
        }

    }
}
