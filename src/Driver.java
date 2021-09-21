import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {
    public static void main (String[] args) {
        HashMap<String, Integer> tasks = new HashMap<>();
        tasks.put("do the dishes", 1000);
        tasks.put("sweep the house", 3000);
        tasks.put("do the laundry", 10000);
        tasks.put("take out the recycling", 4000);
        tasks.put("make a sammich", 7000);
        tasks.put("mow the lawn", 20000);
        tasks.put("rake the leaves", 18000);
        tasks.put("give the dog a bath", 14500);
        tasks.put("bake some cookies", 8000);
        tasks.put("wash the car", 20000);

        // leaderboard object
        Leaderboard l1 = new Leaderboard();

        // cmd input prompt
        int choice = -1;

        Scanner S = new Scanner(System.in);
        do {
            // prepare menu for the user to see multiple operations.
            System.out.println("1 Create Unipedal");
            System.out.println("2 Create Bipedal");
            System.out.println("3 Create Quadrupedal");
            System.out.println("4 Create Arachnid");
            System.out.println("5 Create Radial");
            System.out.println("6 Create Aeronautical");
            System.out.println("7 Run Competition");
            System.out.println("8 Exit");

            // enter the choice
            System.out.print("Enter your choice: ");
            choice = S.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    Unipedal u1 = new Unipedal("Unipedal", tasks);
                    l1.addScore(u1, 0);
                    break;
                case 2:
                    Bipedal b1 = new Bipedal("Bipedal", tasks);
                    l1.addScore(b1, 0);
                    break;
                case 3:
                    Quadrupedal q1 = new Quadrupedal("Quadrupedal", tasks);
                    l1.addScore(q1, 0);
                    break;
                case 4:
                    Arachnid a1 = new Arachnid("Arachnid", tasks);
                    l1.addScore(a1, 0);
                    break;
                case 5:
                    Radial r1 = new Radial("Radial", tasks);
                    l1.addScore(r1, 0);
                    break;
                case 6:
                    Aeronautical ae1 = new Aeronautical("Aeronautical", tasks);
                    l1.addScore(ae1, 0);
                    break;
                case 7:
                    l1.displayResult();
                    l1 = new Leaderboard();
                default:
                    break;
            }

        } while (choice != 8);
    }
}
