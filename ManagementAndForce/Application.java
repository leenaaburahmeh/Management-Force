package ManagementAndForce;

public class Application {
//instance vars

    private Student student;
    private Course course;
    private String applicationDate;
    private String status;
//constructor

    public Application() {
        this.status = "Pending";
    }
//overloading constructor

    public Application(Student student, Course course, String applicationDate, String status) {
        this.student = student;
        this.course = course;
        setApplicationDate(applicationDate);
        setStatus(status);
    }
//------ getters ------

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getApplicationDate() {

        return applicationDate;
    }

    public String getStatus() {
        return status;
    }

//     ------- setters -------
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {

        this.course = course;

    }

    public void setApplicationDate(String applicationDate) {
        if (applicationDate != null && applicationDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.applicationDate = applicationDate;
        } else {
            System.out.println("Invalid date format. Please use YYYY-MM-DD");
        }
    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("Pending")
                || status.equalsIgnoreCase("Approved")
                || status.equalsIgnoreCase("Rejected")) {
            this.status = status;
        } else {
            this.status = "Pending";
            System.out.println("Invalid status. Please enter 'Pending', 'Approved', or 'Rejected'.");
        }
    }
//------- action methods -------

    public void approve() {
        setStatus("Approved");
    }

    public void reject() {
        setStatus("Rejected");
    }

//   ------ toString ------
    @Override
    public String toString() {
        return "Application: "
                + "\nstudent :" + student
                + "\ncourse : " + course
                + "\napplicationDate : " + applicationDate
                + "\nstatus : " + status;
    }

}
