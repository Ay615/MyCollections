package com.selenium.rahulcourse;

import java.util.List;
import java.util.Map;

public class ObjectUsedForJsonContent {
    private String Url;
    private String services;
    private String expertise;
    private String instructor;
    private String linkedIn;
    private Map<String,String> courses;

    public ObjectUsedForJsonContent(String url, String services, String expertise, String instructor, String linkedIn, Map<String, String> courses) {
        Url = url;
        this.services = services;
        this.expertise = expertise;
        this.instructor = instructor;
        this.linkedIn = linkedIn;
        this.courses = courses;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public Map<String,String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String,String> courses) {
        this.courses = courses;
    }
}
