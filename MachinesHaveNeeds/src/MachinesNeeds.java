import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MachinesNeeds {
    /**
     * prints what we need for coffee
     *
     */
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">");
        int countOfCups = Integer.parseInt(scanner.nextLine());
        System.out.println("For " + countOfCups +  " cups of coffee you will need:");
        System.out.println(countOfCups * 200 + " ml of water");
        System.out.println(countOfCups * 50 + " ml of milk");
        System.out.println(countOfCups * 15 + " ml of coffee beans");
    }
}
