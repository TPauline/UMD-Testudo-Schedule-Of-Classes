package us.tpauline.scheduleofclasses.Major;

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
public class MajorService {

    @Autowired
    private MajorRepository majorRepository;
/* 
   private List<Major> majors = new ArrayList<>(Arrays.asList(
            new Major("CMSC", "Computer Sciene", "....."),
            new Major("MATH", "Mathamatics", "....."),
            new Major("ENES", "Engineering Science", ".....")
        ));


    public  List<Major> getAllMajors(){
        return majors;
    }

    public Major getMajor(String id){
       return  majors.stream().filter(m -> m.getId().equals(id)).findFirst().get();
    }

    public void addMajor(Major major) {
        majors.add(major);
    }

    public void updateMajor(Major major, String id){
            for(int i =0; i < majors.size(); i ++){
                Major m = majors.get(i);
                if(m.getId().equals(id)){
                    majors.set(i, major);
                    return;
                }
            }
    }


     public void deleteMajor(String id){
            majors.removeIf(m -> m.getId().equals(id));
    }
    */


    public  List<Major> getAllMajors(){
        List<Major> majors = new ArrayList<>();
        majorRepository.findAll().forEach(majors::add);
        return majors;
    }

    public Major getMajor(String id){
       return majorRepository.findOne(id);
    }

    public void addMajor(Major major) {
        majorRepository.save(major);
    }

    public void updateMajor(Major major, String id){
        majorRepository.save(major);
    }


     public void deleteMajor(String id){
         majorRepository.delete(id);
    }
}
