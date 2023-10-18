package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", TaskStatus.COMPLETED));
    }

    public List<TaskItem> getTasks(){
        return this.tasks;
    }

    /* TO FIX
    public List<TaskItem> getByStatus(TaskStatus taskStatus){
        List<TaskItem> tasksByStatus = new ArrayList<>();
        for(TaskItem task : this.tasks){
            if(TaskItem.getTaskStatus() == taskStatus){
                tasksByStatus.add(task);
            }
        }
    } */
}



