package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from Lab2.lab2", TaskStatus.COMPLETED));
    }

    public List<TaskItem> getTasks(){
        return this.tasks;
    }

    public Optional<TaskItem> getByStatus(TaskStatus status){
        return tasks.
                stream()
                .filter(task -> task.getTaskStatus().equals(status))
                .findFirst();
    }

    public List<TaskItem> findTaskIdGreaterThan2(){
        return tasks.
                stream()
                .filter(task -> task.getTaskId() >= 2)
                .toList();
    }

    public void printTaskDescription(){
        tasks.forEach(task -> {
                    System.out.println(task.getTaskDescription());
                });
    }
}



