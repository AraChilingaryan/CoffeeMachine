import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MachinesNeeds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">");
        int countOfCups = Integer.parseInt(reader.readLine());
        System.out.println("For " + countOfCups +  " cups of coffee you will need:");
        System.out.println(countOfCups * 200 + " ml of water");
        System.out.println(countOfCups * 50 + " ml of milk");
        System.out.println(countOfCups * 15 + " ml of coffee beans");
    }
}
