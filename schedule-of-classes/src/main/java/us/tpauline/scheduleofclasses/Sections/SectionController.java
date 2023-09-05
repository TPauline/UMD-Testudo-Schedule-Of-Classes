package us.tpauline.scheduleofclasses.Sections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import us.tpauline.scheduleofclasses.Courses.Course;
import us.tpauline.scheduleofclasses.Major.Major;


@RestController
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @RequestMapping("/soc/2023/{majorId}/courses/{courseId}/sections")
    public List<Section> getAllSections(@PathVariable String majorId, @PathVariable String courseId){
        // return "SCHEDULE OF CLASSES -FALL2023";
        return sectionService.getAllSections(majorId,courseId);
    }

    @RequestMapping("/soc/2023/{majorId}/courses/{courseId}/sections/{id}")
    public Section getSection(@PathVariable String id){
        return sectionService.getSection(id);
    }

    @RequestMapping(method=RequestMethod.POST, value= "/soc/2023/{majorId}/courses/{courseId}/sections")
    public void addSection( @RequestBody Section section, @PathVariable String majorId, @PathVariable String courseId){
        section.setCourse(new Course(courseId, "", "", majorId,0, "", "", "", new ArrayList<String>(), "", "", new ArrayList<String>(),  new ArrayList<String>(), "", ""));
        section.getCourse().setMajor(new Major(majorId, "", ""));
        sectionService.addSection(section);
        System.out.println("added section");
    }

    @RequestMapping(method=RequestMethod.PUT, value= "/soc/2023/{majorId}/courses/{courseId}/{id}")
    public void updateSection(@RequestBody Section section, @PathVariable String majorId,@PathVariable String courseId){
        section.setCourse(new Course(courseId, "", "", majorId,0, "", "", "", new ArrayList<String>(), "", "", new ArrayList<String>(),  new ArrayList<String>(), "", ""));
        section.getCourse().setMajor(new Major(majorId, "", ""));
        sectionService.addSection(section);
    }


     @RequestMapping(method=RequestMethod.DELETE, value= "/soc/2023/{majorId}/courses/{courseId}/{id}")
    public void deleteSection(@PathVariable String id ){
        sectionService.deleteSection(id);
    }
}
