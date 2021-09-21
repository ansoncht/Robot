import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Radial extends Robot{

    private static final ArrayList<String> strength = new ArrayList<String>(
            Arrays.asList(
                    "wash the car"
            ));

    public Radial(String robot_type, HashMap<String,Integer> tasks) {
        super(robot_type, tasks, strength);
    }

    public int getScore() {
        return this.current_score;
    }
}
