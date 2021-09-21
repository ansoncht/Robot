import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Unipedal extends Robot{

    private static final ArrayList<String> strength = new ArrayList<String>(
        Arrays.asList(
                "sweep the house",
                "rake the leaves"
        ));

    public Unipedal(String robot_type, HashMap<String,Integer> tasks) {
        super(robot_type, tasks, strength);
    }

    public int getScore() {
        return this.current_score;
    }
}
