package ManagementAndForce;

public class Enrollment {
//instance vars

    private Course course;
    private Student student;

    private String date;
    private String status;
//constructor

    public Enrollment() {
    }
//overloading constructor

    public Enrollment(Course course, Student student, String date, String status) {
        this.course = course;
        this.student = student;
        setDate(date);
        setStatus(status);
    }
//-------- getters --------

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

//-------- setters --------
    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setDate(String date) {
        if (date != null && date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.date = date;
        } else {
            System.out.println("Invalid date format. Please use YYYY-MM-DD");
        }
    }

    public void setStatus(String status) {
        if (status != null && (status.equalsIgnoreCase("Pending")
                || status.equalsIgnoreCase("Approved")
                || status.equalsIgnoreCase("Rejected"))) {
            this.status = status;
        } else {
            System.out.println("Invalid status. Please enter 'Pending', 'Approved', or 'Rejected'.");
        }

    }
//------- toString -------

    @Override
    public String toString() {
        return "Enrollment: "
                + "\ncourse = " + course
                + "\nstudent = " + student
                + "\ndate = " + date
                + "\nstatus = " + status;
    }

}
