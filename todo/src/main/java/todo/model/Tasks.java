package todo.model;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by haljik on 15/01/27.
 */
public class Tasks {
    final List<Task> values;

    public Tasks(List<Task> values) {
        this.values = values;
    }

    public List<Task> asList() {
        return values.stream()
                .filter(task -> !task.isDone())
                .collect(Collectors.toList());
    }
}
