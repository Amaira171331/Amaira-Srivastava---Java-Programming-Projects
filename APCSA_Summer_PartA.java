import java.util.ArrayList;

public class APCSA_Summer_PartA {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Amaira", 90, "Amaira@gmail.com"));
        students.add(new Student("Antara", 92, "Antara@gmail.com"));
        students.add(new Student("Eesha", 88, "Eesha@gmail.com"));
        students.add(new Student("Saaketh", 72, "Saaketh@gmail.com"));
        students.add(new Student("Samhita", 76, "Samhita@gmail.com"));
        students.add(new Student("Nick", 81, "Nick@gmail.com"));
        students.add(new Student("Bhargav", 93, "Bhargav@gmail.com"));

        Student longestName = students.get(0);
        Student shortestName = students.get(0);
        Student maxMarks = students.get(0);
        Student minMarks = students.get(0);
        int totalMarks = 0;

        for (Student student : students) {
            if (student.getNameLength() > longestName.getNameLength()) {
                longestName = student;
            }
            if (student.getNameLength() < shortestName.getNameLength()) {
                shortestName = student;
            }
            if (student.getMarks() > maxMarks.getMarks()) {
                maxMarks = student;
            }
            if (student.getMarks() < minMarks.getMarks()) {
                minMarks = student;
            }
            totalMarks += student.getMarks();
        }

        double average = totalMarks / (double) students.size();

        System.out.println("Longest name: " + longestName.getName());
        System.out.println("Shortest name: " + shortestName.getName());
        System.out.println("Max marks: " + maxMarks.getName() + " - " + maxMarks.getMarks());
        System.out.println("Min marks: " + minMarks.getName() + " - " + minMarks.getMarks());
        System.out.println("Average score: " + average);
    }
}
