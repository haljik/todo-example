package todo.datasource;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import todo.model.Task;
import todo.model.TaskId;

/**
 * Created by haljik on 15/01/26.
 */
public interface TaskMapper {
    @Insert("insert into todo.tasks( task_id, subject)" +
            "values (#{task.id.value}, #{task.name}")
    void register(Task task);

    @Select("select nextval('task_id_seq') as value")
    TaskId newId();
}
