package todo.datasource;

import org.apache.ibatis.annotations.Insert;
import todo.model.Task;

/**
 * Created by haljik on 15/01/26.
 */
public interface TaskMapper {
    @Insert("insert into todo.tasks( task_id, subject)" +
            "values ( nexval('task_id_seq')), #{task.name}")
    void register(Task task);
}
