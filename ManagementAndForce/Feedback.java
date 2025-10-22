package ManagementAndForce;

public class Feedback {
//instance vars

    private Student student;
    private Course course;
    private String comment;
    private int rating;
//constructor

    public Feedback() {
    }
//overloading constructor

    public Feedback(Student student, Course course, String comment, int rating) {
        this.student = student;
        this.course = course;
        this.comment = comment;
        setRating(rating);
    }

//------ getters ------
    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }
//-------- setters --------

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 1 and 5.");
            this.rating = 3;
        }
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

//    ------- toString -------
    @Override
    public String toString() {
        return "Feedback: "
                + "\nStudent : " + student.getName()
                + "\nCourse : " + course.getTitle()
                + "\nComment : " + comment
                + "\nRating : " + rating + "/5 ";
    }

}
