import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Leaderboard {

    protected HashMap<Robot, Integer> leaderboard;

    public Leaderboard() {
        this.leaderboard = new HashMap<>();
    }

    public void addScore(Robot robot, int score) {
        this.leaderboard.put(robot, 0);
    }

    public void modifyScore(Robot robot, int score) {
        this.leaderboard.put(robot, leaderboard.get(robot)+ score);
    }

    public void displayResult() {
        Set<Robot> keys = this.leaderboard.keySet();
        if (keys.size() == 0) {
            System.out.println("No robot has been created");
        } else {
            runCompetition(keys);
            for (Robot robot: keys) {
                System.out.println(String.format("Score for %s: %d", robot.getRobotName(), this.leaderboard.get(robot)));
            }
        }
        System.out.println("");
    }

    private void runCompetition(Set<Robot> keys) {
        for (Robot robot: keys) {
            robot.start();
            this.modifyScore(robot, robot.getScore());
        }
    }
}
