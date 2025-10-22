package ManagementAndForce;
public class Test1 {
    public static void main(String[] args) {
        TrainingCompany company = new TrainingCompany("Academy" , "amman");
        
        Instructor ins1 = new Instructor("Leena" , "e100" ,"lina@gmail.com","+962791816802" , "Data science");
        Instructor ins2 =  new Instructor("Sami" , "e200" , "Sami@mail.com","+962796573638" , "AI");
        Instructor ins3 =  new Instructor("Samia" , "e300" ,"", "" ,  "AI developer"); 
        ins2.setExpertise("History");
        
        company.addInstructors(ins1);
        company.addInstructors(ins2);
        company.addInstructors(ins3);
        
       Student st1 = new Student("Ali","s100","st@mail.com","+962791816804","beginner");
       Student st2 = new Student("Alia","s200","st2@mail.com","+962791816813","advanced");        
        
       company.addStudents(st1);
       company.addStudents(st2); 
       
       Course crs1 = new Course("Network" , 3 , 75.30 , "course for cys students " , Course.ACTIVE);
       Course crs2 = new Course("AI application " , 8 , 90 , "course for cys students" , Course.NOT_ACTIVE);
       
       crs1.addInstructors(ins1);
       crs2.addInstructors(ins2);
       crs2.addInstructors(ins3);    
       
       company.addCourse(crs1);
       company.addCourse(crs2);
       
       crs1.applyDiscount(st2);
       crs2.applyDiscount(st1);
       
       
       Application app1 = new Application(st2 , crs2 ,"2024-11-03","approved"  );
               app1.reject();
               
               
       Feedback f1 = new Feedback(st1,crs1,"excellent course" ,4);
       Feedback f2 = new Feedback(st2,crs1,"good course" ,7); 
       
       
        System.out.println("\n---------Training company overview----------");
        System.out.println(company);
        
        System.out.println("\n===== Detailed Info =====");
        System.out.println(ins1);
        System.out.println(st1);
        System.out.println(crs1);
        System.out.println(app1);
        System.out.println(f1);
        System.out.println(f2);
       
    }
    
}
