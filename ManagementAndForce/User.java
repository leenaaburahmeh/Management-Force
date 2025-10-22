package ManagementAndForce;

public class User {
//instance vars

    private String name;
    private String ID;
    private String Email;
    private String phone;
//constructor

    public User() {
        this.ID = "00000";
    }
//overloading constructor

    public User(String name, String ID, String Email, String phone) {
        setName(name);
        setID(ID);
        setEmail(Email);
        setPhone(phone);

    }
//--------- getters----------

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return phone;
    }
//--------setters---------

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Enter name ");
        }
    }

    public void setID(String ID) {
        if (ID != null) {
            this.ID = ID;
        } else {
            this.ID = "00000";
            System.out.println("Enter Id ");
        }

    }

    public void setEmail(String Email) {
        if (Email != null && Email.contains("@") && Email.contains(".com")) {
            this.Email = Email;
        } else {
            System.out.println("enter the email in the correct form ,invalid email for  " + name);
        }
    }

    public void setPhone(String phone) {
        if (phone != null && phone.startsWith("+962") && phone.length() == 13) {
            this.phone = phone;
        } else {
            System.out.println(" invalid number ");
        }
    }
//-------actions  methods----------

    public void login() {
        System.out.println(name + "has logged in");
    }

    public void logout() {
        System.out.println(name + "has logged out");
    }
//------toString------------

    @Override
    public String toString() {
        return " name=" + name
                + "\nID=" + ID
                + "\nEmail=" + Email
                + "\nphone=" + phone;
    }

}
