package ManagementAndForce;

import java.util.ArrayList;

public class Student extends User {
//instance vars

    private String level;
    private ArrayList<String> courses;
//constructor

    public Student() {
        this.level = "beginner";
    }
//overloading constructor

    public Student(String name, String ID, String Email, String phone, String level) {
        super(name, ID, Email, phone);
        this.level = level;
        this.courses = new ArrayList<>();
    }
//------ getters ------

    public String getLevel() {
        return level;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

//    -------- setters -------
    public void setLevel(String level) {
        if (level != null) {
            if (level.equalsIgnoreCase("Beginner") || level.equalsIgnoreCase("Intermediate") || level.equalsIgnoreCase("Advanced")) {
                this.level = level;
            } else {
                this.level = "Beginner";
                System.out.println("invalid level , the default level (Beginner) ");
            }

        }

    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

//   ---------- action methods----------
    public void enroll() {
        System.out.println(getName() + " has enrolled in a course .");
    }

    public void addCourse(String courseName) {
        courses.add(courseName);
        System.out.println(courseName + " added to " + getName() + "'s courses .");
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println(getName() + " is not enrolled in any course");
        } else {
            System.out.println(getName() + "'s courses: ");

            int index = 1;
            for (String c : courses) {
                System.out.println(index + ". " + c);
                index++;
            }
        }

    }

//   --------toString----------
    @Override
    public String toString() {
        return "Student : " + "\n"
                + super.toString()
                + "\nlevel= " + level
                + "\ncourses=" + courses;
    }

}
