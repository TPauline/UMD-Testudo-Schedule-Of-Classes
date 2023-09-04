package us.tpauline.scheduleofclasses.Courses;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
/*
 * This will act as a data service
 * 
 * for the generic args the entity type is Topic, the id type isString
 */
public interface CourseRepository extends CrudRepository<Course,String>{

	public List<Course> findByMajorId(String  name);
	public List<Course> findByDescription(String  name);
}
