import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class EnoughCoffee {
    public static void main(String[] args) throws Exception {
        int[] array = enoughCoffee();
        isEnough(array);
    }

    public static int[] enoughCoffee() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Write how many ml of water the coffee machine has:\n>");
        list.add(Integer.parseInt(bufferedReader.readLine()) / 200);

        System.out.print("Write how many ml of milk the coffee machine has:\n>");
        list.add(Integer.parseInt(bufferedReader.readLine()) / 50);

        System.out.print("Write how many grams of coffee beans the coffee machine has:\n>");
        list.add(Integer.parseInt(bufferedReader.readLine()) / 15);

        System.out.print("Write how many cups of coffee you will need:\n>");
        String count = bufferedReader.readLine();

        Collections.sort(list);
        bufferedReader.close();
        int[] arrayOfArgument = new int[2];
        arrayOfArgument[0] = list.get(0);
        arrayOfArgument[1] = Integer.parseInt(count);

        return arrayOfArgument;
    }

    public static void isEnough(int[] array){
        if(array[0] < array[1]){
            System.out.println("No, I can make only " + array[0] + " cup(s) of coffee");
        }

        if(array[0] == array[1]){
            System.out.println("Yes, I can make that amount of coffee");
        }

        if(array[0] > array[1]){
            System.out.println("Yes, I can make that amount of coffee" + " (and even " + (array[0] - array[1]) + " more than that)");
        }
    }
}
