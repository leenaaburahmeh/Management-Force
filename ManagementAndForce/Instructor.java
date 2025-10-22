package ManagementAndForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Instructor extends User {
//instance vars

    private String expertise;
    private ArrayList<String> courses;
//---list---
    public static final List<String> allowedExpertise = Arrays.asList(
            "Cybersecurity",
            "Web development",
            "Cloud computing",
            "AI ",
            "Network",
            "Computer Science", "Software engineering", "Data Science"
    );
//constructor

    public Instructor() {
        this.courses = new ArrayList<>();
    }
//overloading constructor

    public Instructor(String name, String ID, String Email, String phone, String expertise) {
        super(name, ID, Email, phone);
        setExpertise(expertise);
        this.courses = new ArrayList<>();
    }
//---------getters---------

    public String getExpertise() {
        return expertise;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
// ---------setters--------

    public void setExpertise(String expertise) {
        if (expertise != null) {
            for (String allowed : allowedExpertise) {
                if (allowed.equalsIgnoreCase(expertise)) {
                    this.expertise = allowed;
                    return;
                }
            }
        }
        else
            
        System.out.println("Invalid expertise, be sure to choose from these: " + allowedExpertise);
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

//   --------action methods---------
    public void addCourse(String course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
        } else {
            System.out.println("Course name is invalid or already exist");
        }
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println(getName() + " is not teaching any course ");
        } else {
            System.out.println(getName() + "'s courses : ");
        }
        int i = 1;
        for (String s : courses) {
            System.out.println(i + ". " + s);
            i++;
        }

    }
//--------toString---------

    @Override
    public String toString() {
        return "Instructor : " + "\n"
                + super.toString()
                + "\nexpertise: " + expertise
                + "\nCourses: " + courses;
    }

}
