package us.tpauline.scheduleofclasses.Sections;

// import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

@Service //marks class as spring business service
public class SectionService {

    @Autowired
    private SectionRepository courseRepository;

    public  List<Section> getAllSections(String majorId,String courseId){
        List<Section> sections = new ArrayList<>();
        // courseRepository.findByMajorIdCourseId(majorId,courseId).forEach(courses::add);
        courseRepository.findByCourseId(courseId).forEach(sections::add);
        return sections;
    }

    public Section getSection(String id){
       return courseRepository.findOne(id);
    }

    public void addSection(Section section) {
        courseRepository.save(section);
    }

    public void updateSection(Section section, String id){
        courseRepository.save(section);
    }


    public void deleteSection(String id){
         courseRepository.delete(id);
    }
}
