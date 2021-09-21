import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Quadrupedal extends Robot{

    private static final ArrayList<String> strength = new ArrayList<String>(
            Arrays.asList(
                    "mow the lawn"
            ));

    public Quadrupedal(String robot_type, HashMap<String,Integer> tasks) {
        super(robot_type, tasks, strength);
    }

    public int getScore() {
        return this.current_score;
    }
}
