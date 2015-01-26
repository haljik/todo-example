package todo.model;

/**
 * Created by haljik on 15/01/26.
 */
public class Task {
    final TaskId id;
    String name;

    public Task(TaskId id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
