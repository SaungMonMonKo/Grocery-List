import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Grocery> groceries = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }


            Grocery grocery = new Grocery(name);

            if (groceries.contains(grocery)) {
                System.out.println("The item is already on the list.");
            } else {
                groceries.add(grocery);
                System.out.println("Thank you! The item "+ name + " has been added to the grocery list.");
            }
            
        }
        
               
    }
}
