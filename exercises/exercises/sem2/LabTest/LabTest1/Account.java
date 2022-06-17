package exercises.sem2.LabTest.LabTest1;

public class Account {
    String user_id, name, email, contact_number;

    public Account(String name) {
        this.name = name;
        this.email = null;
        this.user_id = null;
        this.contact_number = null;
    }

    public Account(String user_id, String name, String email, String contact_number) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.contact_number = contact_number;
    }
}
