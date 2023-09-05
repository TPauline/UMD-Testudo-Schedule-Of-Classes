package us.tpauline.scheduleofclasses.Sections;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
/*
 * This will act as a data service
 * 
 * for the generic args the entity type is Topic, the id type isString
 */
public interface SectionRepository extends CrudRepository<Section,String>{

	// public List<Section> findByMajorIdCourseId(String  major, String course);
	public List<Section> findByCourseId(String  name);
	public List<Section> findByInstructor(String  name);
}
