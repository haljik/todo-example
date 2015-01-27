package todo.datasource;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import todo.model.Task;
import todo.model.TaskId;

import java.util.List;

/**
 * Created by haljik on 15/01/26.
 */
public interface TaskMapper {
    @Insert("insert into todo.tasks( task_id, name, done)" +
            "values (#{id.value}, #{name}, #{done} )")
    void register(Task task);

    @Select("select nextval('todo.task_id_seq') as value")
    TaskId newId();

    @Select("select task_id as \"id.value\", name, done from todo.tasks")
    List<Task> tasks();


    @Select("select task_id as \"id.value\", name, done from todo.tasks where task_id = #{id}")
    Task findBy(@Param("id") String id);

    @Update("update todo.tasks set done = #{done} where task_id = #{id.value}")
    void done(Task task);
}
