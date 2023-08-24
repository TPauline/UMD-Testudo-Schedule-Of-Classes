package us.tpauline.umdtestudo.scheduleofclasses.Major;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service //marks class as spring business service
public class MajorService {
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
}
