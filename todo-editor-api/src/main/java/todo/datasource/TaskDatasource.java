package todo.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import todo.model.Task;
import todo.model.TaskRepository;

/**
 * Created by haljik on 15/01/26.
 */
@Repository
public class TaskDatasource implements TaskRepository {

    @Autowired
    TaskMapper mapper;

    @Override
    public void registerTask(Task task) {
        mapper.register(task);
    }

    @Override
    public Task prototype() {
        return new Task(mapper.newId());
    }

}
