package todo.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import todo.model.Task;
import todo.model.TaskRepository;

/**
 * Created by haljik on 15/01/26.
 */
public class TaskDatasource implements TaskRepository {

    @Autowired
    TaskMapper mapper;

    @Override
    public void registerTask(Task task) {
        mapper.register(task);
    }

}
