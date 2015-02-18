package todo.model;

/**
 * Created by haljik on 15/01/26.
 */
public interface TaskRepository {
    void registerTask(Task task);

    Task prototype();

    Tasks tasks();

    Task findBy(Integer id);

    void done(Task task);
}
