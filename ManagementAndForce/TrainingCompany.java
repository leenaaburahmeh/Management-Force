package ManagementAndForce;

import java.util.ArrayList;

public class TrainingCompany {
//instance vars

    private String name;
    private String address;

    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Instructor> instructors;
//constructor

    public TrainingCompany() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.instructors = new ArrayList<>();
    }
//overloading constructor

    public TrainingCompany(String name, String address) {
        setName(name);
        setAddress(address);
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.instructors = new ArrayList<>();
    }
//    -----------getters----------

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

//    ------------setters--------------
    public void setCourses(ArrayList<Course> courses3) {
        this.courses = courses3;
    }

    public void setStudents(ArrayList<Student> students2) {
        this.students = students2;
    }

    public void setInstructors(ArrayList<Instructor> instructors2) {
        this.instructors = instructors2;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Invalid company name");
        }
    }

    public void setAddress(String address) {
        if (address != null) {
            this.address = address;
        } else {
            System.out.println("Invalid address");
        }
    }
//    ------- action methods------

    public void addCourse(Course crs) {
        if (crs != null && !courses.contains(crs)) {
            courses.add(crs);
        } else {
            System.out.println("Invalid course or already exists");
        }

    }

    public void removeCourse(Course crs) {
        if (courses.remove(crs)) {
            System.out.println("Course removed");
        } else {
            System.out.println("Course not found");
        }
    }

    public void viewCourses() {
        if (courses.isEmpty()) {
            System.out.println("no courses yet");
        } else {
            System.out.println("Total courses : " + courses.size());
            System.out.println("Courses : ");

            int r = 1;
            for (Course n : courses) {
                System.out.println(r + ". " + n.getTitle());
                r++;
            }
        }
    }

    public void addStudents(Student stu) {
        if (stu != null && !students.contains(stu)) {
            students.add(stu);
        } else {
            System.out.println("Invalid student or already exists");
        }
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students yet");
        } else {
            System.out.println("Total Students: " + students.size());
            System.out.println("names : ");

            int y = 1;
            for (Student f : students) {
                System.out.println(y + ". " + f.getName());
                y++;
            }

        }
    }

    public void addInstructors(Instructor ins) {
        if (ins != null && !instructors.contains(ins)) {
            instructors.add(ins);
        } else {
            System.out.println("Invalid instructor or already exists");
        }
    }

    public void viewInstructors() {
        if (instructors.isEmpty()) {
            System.out.println("No instructors yet");
        } else {
            System.out.println("Total Instructors : " + instructors.size());
            System.out.println("names :");

            int e = 1;
            for (Instructor v : instructors) {
                System.out.println(e + ". " + v.getName());
                e++;
            }
        }

    }

//    ------- toString------
    @Override
    public String toString() {
        return "Training Company: "
                + "\nname=" + name
                + "\naddress=" + address
                + "\ncourses3=" + courses
                + "\nstudents2=" + students
                + "\ninstructors2=" + instructors;
    }

}
