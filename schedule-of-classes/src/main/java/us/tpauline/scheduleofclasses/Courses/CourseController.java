package us.tpauline.scheduleofclasses.Courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import us.tpauline.scheduleofclasses.Major.Major;


@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/soc/2023/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        // return "SCHEDULE OF CLASSES -FALL2023";
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/soc/2023/{majorId}/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method=RequestMethod.POST, value= "/soc/2023/{majorId}/courses")
    public void addCourse( @RequestBody Course course, @PathVariable String majorId){
        course.setMajor(new Major(majorId, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method=RequestMethod.PUT, value= "/soc/2023/{majorId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String majorId){
        course.setMajor(new Major(majorId, "", ""));
        courseService.addCourse(course);
    }


     @RequestMapping(method=RequestMethod.DELETE, value= "/soc/2023/{majorId}/courses/{id}")
    public void deleteCourse(@PathVariable String id ){
        courseService.deleteCourse(id);
    }
}
