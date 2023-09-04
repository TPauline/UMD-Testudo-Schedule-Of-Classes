package us.tpauline.scheduleofclasses.Courses;

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
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public  List<Course> getAllCourses(String majorId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByMajorId(majorId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id){
       return courseRepository.findOne(id);
    }

    public void addCourse(Course major) {
        courseRepository.save(major);
    }

    public void updateCourse(Course major, String id){
        courseRepository.save(major);
    }


     public void deleteCourse(String id){
         courseRepository.delete(id);
    }
}
