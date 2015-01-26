package todo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import todo.model.Task;
import todo.service.TaskRegisterService;

/**
 * Created by haljik on 15/01/26.
 */
@RestController
public class Register {
    @Autowired
    TaskRegisterService service;
    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    public void addTask(@RequestParam("name") String name) {
        service.registerTask(new Task(name));
    }
}
