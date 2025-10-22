package ManagementAndForce;

import java.util.Scanner;

public class Test2 {

    public static void fillCompanyInfo(TrainingCompany company) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter company name : ");
        company.setName(s.nextLine());
        System.out.print("Enter company address : ");
        company.setAddress(s.nextLine());

    }

    public static void addInstructor(Instructor ins) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name :");
        ins.setName(s.nextLine());
        System.out.print("Enter ID :");
        ins.setID(s.nextLine());
        System.out.print("Enter Email :");
        ins.setEmail(s.nextLine());
        System.out.print("Enter Phone :");
        ins.setPhone(s.nextLine());
        System.out.print("Enter Expertise (e.g AI) :");
        ins.setExpertise(s.nextLine());

    }

    public static void addStudent(Student st) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name :");
        st.setName(s.nextLine());
        System.out.print("Enter ID :");
        st.setID(s.nextLine());
        System.out.print("Enter Email :");
        st.setEmail(s.nextLine());
        System.out.print("Enter Phone :");
        st.setPhone(s.nextLine());
        System.out.print("Enter level (Beginner, Intermediate, Advanced) :");
        st.setLevel(s.nextLine());

    }

    public static void addCourse(Course crs) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Title :");
        crs.setTitle(s.nextLine());
        System.out.print("Enter Duration :");
        crs.setDuration(s.nextInt());
        System.out.print("Enter Price :");
        crs.setPrice(s.nextDouble());
        s.nextLine();
        System.out.print("Enter Description : ");
        crs.setDescription(s.nextLine());
        System.out.print("Is the Course " + "(" + crs.getTitle() + ")" + " Active? (true/false) : ");
        crs.setIsActive(s.nextBoolean());
    }

    public static void addFeedback(Feedback f) {
        Scanner s = new Scanner(System.in);
        System.out.print("Add Comment : ");
        f.setComment(s.nextLine());
        System.out.print("Add Rating : ");
        f.setRating(s.nextInt());

    }

    public static void main(String[] args) {

        System.out.println("----Welcome to Training Company setup----");
        TrainingCompany company = new TrainingCompany();
        fillCompanyInfo(company);
//        -------------------------------------------------------------------
        System.out.println("-----Add Instructor-----");
        Instructor ins = new Instructor();
        addInstructor(ins);
        company.addInstructors(ins);
//        -------------------------------------------------------------------
        System.out.println("-----Add Student-----");
        Student st = new Student();
        addStudent(st);
        company.addStudents(st);
//        -------------------------------------------------------------------
        System.out.println("-----Add Course-----");
        Course crs = new Course();
        addCourse(crs);
        company.addCourse(crs);
        crs.applyDiscount(st);
        crs.addInstructors(ins);
//        -------------------------------------------------------------------   
        System.out.println("-----Leave Feedback-----");
        Feedback f = new Feedback();
        addFeedback(f);
//        -------------------------------------------------------------------          
        System.out.println("-----Result-----");
        System.out.println(company);
        System.out.println("-------------------------");
        System.out.println(ins);
        System.out.println("-------------------------");
        System.out.println(st);
        System.out.println("-------------------------");
        System.out.println(crs);
        System.out.println("-------------------------");
        f.setStudent(st);
        f.setCourse(crs);
        System.out.println("-------------------------");
        System.out.println(f);

    }

}
