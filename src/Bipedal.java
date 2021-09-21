import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Bipedal extends Robot{

    private static final ArrayList<String> strength = new ArrayList<String>(
            Arrays.asList(
                    "do the laundry",
                    "take out the recycling"
            ));

    public Bipedal(String robot_type, HashMap<String,Integer> tasks) {
        super(robot_type, tasks, strength);
    }

    public int getScore() {
        return this.current_score;
    }
}
