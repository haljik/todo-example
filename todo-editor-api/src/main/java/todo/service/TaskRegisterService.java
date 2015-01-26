package todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.model.Task;
import todo.model.TaskRepository;

/**
 * Created by haljik on 15/01/26.
 */
@Service
public class TaskRegisterService {
    @Autowired
    TaskRepository repository;

    public void registerTask(Task task) {
        repository.registerTask(task);
    }
}
