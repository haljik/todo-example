package todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import todo.model.Task;
import todo.model.Tasks;
import todo.service.TaskService;

/**
 * Created by haljik on 15/01/26.
 */
@Controller
@RequestMapping("/")
public class TaskController {
    @Autowired
    TaskService service;

    @ModelAttribute
    public Task prototype() {
        return service.prototype();
    }

    @ModelAttribute
    public Tasks tasks() {
        return service.tasks();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String top() {
        return "index";
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    public String addTask(@ModelAttribute Task task) {
        service.registerTask(task);
        return "redirect:/";
    }

    @RequestMapping(value = "/tasks/done/{id}", method= RequestMethod.POST)
    public String done(@PathVariable("id") String id) {
        service.done(id);
        return "redirect:/";
    }

}
