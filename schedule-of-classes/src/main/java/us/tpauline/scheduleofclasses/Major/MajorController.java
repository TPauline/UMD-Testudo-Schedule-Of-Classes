package us.tpauline.scheduleofclasses.Major;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MajorController {

    @Autowired
    private MajorService majorService;

    @RequestMapping("/soc/2023")
    public List<Major> getAllMajors(){
        // return "SCHEDULE OF CLASSES -FALL2023";
        return majorService.getAllMajors();
    }

    @RequestMapping("/soc/2023/{id}")
    public Major getMajor(@PathVariable String id){
        return majorService.getMajor(id);
    }

    @RequestMapping(method=RequestMethod.POST, value= "/soc/2023")
    public void addMajor(@RequestBody Major major){
        majorService.addMajor(major);
    }

    @RequestMapping(method=RequestMethod.PUT, value= "/soc/2023/{id}")
    public void updateMajor(@RequestBody Major major, @PathVariable String id ){
        majorService.updateMajor(major, id);
    }


     @RequestMapping(method=RequestMethod.DELETE, value= "/soc/2023/{id}")
    public void deleteMajor(@PathVariable String id ){
        majorService.deleteMajor(id);
    }
}
