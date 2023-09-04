package us.tpauline.scheduleofclasses.Major;
import org.springframework.data.repository.CrudRepository;
/*
 * This will act as a data service
 * 
 * for the generic args the entity type is Topic, the id type isString
 */
public interface MajorRepository extends CrudRepository<Major,String>{
    // getAlltopics()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(Sring id)

}
