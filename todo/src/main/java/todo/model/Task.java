package todo.model;

/**
 * Created by haljik on 15/01/26.
 */
public class Task {
    TaskId id;
    String name;

    boolean done;

    Task() {}

    public Task(TaskId id) {
        this.id = id;
    }

    public TaskId getId() {
        return id;
    }

    public void setId(TaskId id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }
}
