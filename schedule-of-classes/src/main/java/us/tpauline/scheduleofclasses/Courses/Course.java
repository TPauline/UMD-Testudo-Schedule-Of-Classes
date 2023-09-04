package us.tpauline.scheduleofclasses.Courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

import us.tpauline.scheduleofclasses.Major.Major;

@Entity
public class Course {
    
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Major major;

    private int credits;
    private String level;
    private String delivery;
    private String graduation_method;
    private ArrayList<String> prequsits;
    private String restrictions;
    private String additional_information;
    private ArrayList<String> cross_list;
    private ArrayList<String> credit_granted;
    private String core;
    private String general_education;

    public Course() {
    }
    
    public Course(String id, String name, String description, String majorId,int credits, String level, String delivery, String graduation_method, ArrayList<String> prequsits, String restrictions, String additional_information, ArrayList<String> cross_list,  ArrayList<String> credit_granted, String core, String general_education) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.major = new Major(majorId, "","");
        this.credits = credits;
        this.level = level;
        this.delivery = delivery;
        this.graduation_method = graduation_method;
        this.prequsits = prequsits;
        this.restrictions = restrictions;
        this.additional_information = additional_information;
        this.cross_list = cross_list;
        this.credit_granted = credit_granted;
        this.core = core;
        this.general_education = general_education;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getGraduation_method() {
        return graduation_method;
    }

    public void setGraduation_method(String graduation_method) {
        this.graduation_method = graduation_method;
    }

    public ArrayList<String> getPrequsits() {
        return prequsits;
    }

    public void setPrequsits(ArrayList<String> prequsits) {
        this.prequsits = prequsits;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public String getAdditional_information() {
        return additional_information;
    }

    public void setAdditional_information(String additional_information) {
        this.additional_information = additional_information;
    }

    public ArrayList<String> getCross_list() {
        return cross_list;
    }

    public void setCross_list(ArrayList<String> cross_list) {
        this.cross_list = cross_list;
    }

    public  ArrayList<String> getCredit_granted() {
        return credit_granted;
    }

    public void setCredit_granted( ArrayList<String> credit_granted) {
        this.credit_granted = credit_granted;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getGeneral_education() {
        return general_education;
    }

    public void setGeneral_education(String general_education) {
        this.general_education = general_education;
    }

    
    



    
}

