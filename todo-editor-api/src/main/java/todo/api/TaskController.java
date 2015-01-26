package todo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.model.Task;
import todo.service.TaskRegisterService;

/**
 * Created by haljik on 15/01/26.
 */
@RestController
public class TaskController {
    @Autowired
    TaskRegisterService service;

    @ModelAttribute
    public Task prototype() {
        return service.prototype();
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    public ResponseEntity<String> addTask(@ModelAttribute Task task) {
        service.registerTask(task);
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
