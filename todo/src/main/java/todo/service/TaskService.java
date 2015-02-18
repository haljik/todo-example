package todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.model.Task;
import todo.model.TaskRepository;
import todo.model.Tasks;

/**
 * Created by haljik on 15/01/26.
 */
@Service
public class TaskService {
    @Autowired
    TaskRepository repository;

    public Task prototype() {
        return repository.prototype();
    }

    public void registerTask(Task task) {
        repository.registerTask(task);
    }

    public Tasks tasks() {
        return repository.tasks();
    }

    public void done(Integer id) {
        Task task = repository.findBy(id);
        task.setDone(true);
        repository.done(task);
    }
}
