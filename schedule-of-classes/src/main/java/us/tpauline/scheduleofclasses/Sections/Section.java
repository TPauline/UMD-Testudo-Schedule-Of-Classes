package us.tpauline.scheduleofclasses.Sections;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

import us.tpauline.scheduleofclasses.Major.Major;
import us.tpauline.scheduleofclasses.Courses.Course;


@Entity
public class Section {
    
    @Id
    private String id;

    // private String courseId;
    // private String majorId;
    private String instructor;
    private int total_seats;
    private int open_seats;
    private int waitlist;
    private String location;

    @ManyToOne
    private Course course;

    public Section() {
    }

    public Section(String id, String instructor, String courseId, String majorId, int total_seats, int open_seats, int waitlist, String location) {
        this.id = id;
        // this.courseId = courseId;
        // this.majorId = majorId;
        this.instructor = instructor;
        this.total_seats = total_seats;
        this.open_seats = open_seats;
        this.waitlist = waitlist;
        this.location = location;
        this.course = new Course(courseId, "", "", "",0, "", "", "", new ArrayList<String>(), "", "", new ArrayList<String>(),  new ArrayList<String>(), "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    public int getOpen_seats() {
        return open_seats;
    }

    public void setOpen_seats(int open_seats) {
        this.open_seats = open_seats;
    }

    public int getWaitlist() {
        return waitlist;
    }

    public void setWaitlist(int waitlist) {
        this.waitlist = waitlist;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    // public String getCourseId() {
    //     return courseId;
    // }

    // public void setCourseId(String courseId) {
    //     this.courseId = courseId;
    // }

    // public String getMajorId() {
    //     return majorId;
    // }

    // public void setMajorId(String majorId) {
    //     this.majorId = majorId;
    // }
    
    
   
    
    



    
}

