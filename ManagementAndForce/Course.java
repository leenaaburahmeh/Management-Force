package ManagementAndForce;

import java.util.ArrayList;

public class Course {
//instance vars   
//    -----constants-----

    public static final boolean ACTIVE = true;
    public static final boolean NOT_ACTIVE = false;
//    --------------------
    private String title;
    private int duration; // in hours
    private double price;
    private String description;
    private boolean isActive;
    private ArrayList<Instructor> instructors;
//constructor

    public Course() {
        this.instructors = new ArrayList<>();

    }
//overloading constructor

    public Course(String title, int duration, double price, String description, boolean isActive) {
        this.title = title;
        this.duration = duration;
        this.price = price;
        this.instructors = new ArrayList<>();
        this.description = description;
        this.isActive = isActive;
    }
//------ getters -----

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public String getDescription() {
        return description;
    }

    public boolean isIsActive() {
        return isActive;
    }

// ------ setters ------
    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        } else {
            System.out.println("Invalid title");
        }
    }

    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        } else {
            System.out.println("invalid duration , must be positive hours");
        }
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price , must be positive");
        }
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        } else {
            System.out.println("Invalid Description");
        }
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

//     ------- action methods -------
    public void applyDiscount(Student st) {
        if (st == null || st.getLevel() == null) {
            System.out.println("student or student level is not defined");
            return;
        }
        String level = st.getLevel();
        double discount = 0;
        if (level.equalsIgnoreCase("Advanced")) {
            discount = 0.50;
        }
        if (level.equalsIgnoreCase("Intermediate")) {
            discount = 0.30;
        }
        if (level.equalsIgnoreCase("Beginner")) {
            System.out.println("no discount");
        }
        double discountAmount = price * discount;
        price -= discountAmount;
        System.out.println("Applied " + (int) (discount * 100) + "% discount for student " + st.getName() + ". New price: " + price + "$");

    }

    public void addInstructors(Instructor ins) {
        instructors.add(ins);
    }

    public void viewInstructors() {
        if (instructors.isEmpty()) {
            System.out.println("No instructors signed to this course yet ");
        } else {
            System.out.println("Instructors : ");

            int j = 1;
            for (Instructor i : instructors) {
                System.out.println(j + ". " + i.getName());
                j++;
            }
        }
    }

    public String getInstructorNames() {
        if (instructors.isEmpty()) {
            return " No instructors assigned";
        }
        String names = "";
        for (int i = 0; i < instructors.size(); i++) {
            names += instructors.get(i).getName();
            if (i != instructors.size() - 1) {
                names += ", ";
            }
        }
        return names;
    }
//------ toString -------

    @Override
    public String toString() {
        return "Course : "
                + "\ntitle=" + title
                + "\nduration=" + duration
                + "\nprice=" + price
                + "\ninstructors=" + getInstructorNames()
                + "\ndescription=" + description
                + "\nisActive=" + isActive;
    }

}
