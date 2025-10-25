public class Student {
    private String name;
    private int marks;
    private String email;

    public Student(String name, int marks, String email) {
        this.name = name;
        this.marks = marks;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getEmail() {
        return email;
    }

    public int getNameLength() {
        return name.length();
    }
    
    public String toString() {
        return name + " (" + marks + ", " + email + ")";
    }
}

