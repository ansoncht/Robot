import java.util.ArrayList;
import java.util.HashMap;

public abstract class Robot {
    protected HashMap<String, Integer> tasks;
    protected ArrayList<String> tasks_name;
    protected String robot_type;
    protected ArrayList<String> assigned_tasks;
    protected int times_taken;
    protected ArrayList<String> strength;
    protected int current_score;

    public Robot(String robot_type, HashMap<String,Integer> tasks, ArrayList<String> strength) {
        this.robot_type = robot_type;
        this.tasks = tasks;
        this.times_taken = 1;
        this.strength = strength;
        this.tasks_name = new ArrayList<>(this.tasks.keySet());
        this.assigned_tasks = new ArrayList<>();
        this.current_score = 0;
        while (this.assigned_tasks.size() < 5) {
            int index = (int)(Math.random() * this.tasks_name.size());
            if (!this.assigned_tasks.contains(this.tasks_name.get(index))) {
                this.assigned_tasks.add(this.tasks_name.get(index));
            }
        }
    }

    public void scheduleTasks() {
        while (this.getRemaining() > 0) {
            int index = this.getRemaining();
            this.handleTasks(this.assigned_tasks.get(index - 1));
            if (strength.contains(this.assigned_tasks.get(index-1))) {
                this.current_score += 2;
            } else {
                this.current_score += 1;
            }
            this.assigned_tasks.remove(index - 1);
        }
    };

    public abstract int getScore();

    public void start() {
        this.scheduleTasks();
    }

    public int getRemaining() {

        return this.assigned_tasks.size();
    }

    public void handleTasks(String task) {
        int time = this.tasks.get(task);
        for (int i = 0; i < time-1; i++) {
            // System.out.println(String.format("At time %d, %s is in progress by robot %s", this.times_taken, task, this.getRobotName()));
            this.times_taken++;
        }
        System.out.println(String.format("At time %d, %s is done by %s%n", this.times_taken, task, this.getRobotName()));
        this.times_taken++;
    }

    public String getRobotName() {
        return this.robot_type;
    }
}
