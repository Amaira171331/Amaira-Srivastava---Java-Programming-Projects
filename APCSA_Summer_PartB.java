public class APCSA_Summer_PartB {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student("Amaira", 90, "Amaira@gmail.com");
        students[1] = new Student("Antara", 92, "Antara@gmail.com");
        students[2] = new Student("Eesha", 88, "Eesha@gmail.com");
        students[3] = new Student("Saaketh", 72, "Saaketh@gmail.com");
        students[4] = new Student("Samhita", 76, "Samhita@gmail.com");
        students[5] = new Student("Bhargav", 93, "Bhargav@gmail.com");
        students[6] = new Student("Nick", 81, "Nick@gmail.com");

        Student longestName = students[0];
        Student shortestName = students[0];
        Student maxMarks = students[0];
        Student minMarks = students[0];
        int totalMarks = 0;

        for (int i=0; i<students.length; i++) {
            if (students[i].getNameLength() > longestName.getNameLength()) {
                longestName = students[i];
            }
            if (students[i].getNameLength() < shortestName.getNameLength()) {
                shortestName = students[i];
            }
            if (students[i].getMarks() > maxMarks.getMarks()) {
                maxMarks = students[i];
            }
            if (students[i].getMarks() < minMarks.getMarks()) {
                minMarks = students[i];
            }
            totalMarks += students[i].getMarks();
        }

        double average = totalMarks / (double) students.length;

        System.out.println("Longest name: " + longestName.getName());
        System.out.println("Shortest name: " + shortestName.getName());
        System.out.println("Max marks: " + maxMarks.getName() + " - " + maxMarks.getMarks());
        System.out.println("Min marks: " + minMarks.getName() + " - " + minMarks.getMarks());
        System.out.println("Average score: " + average);
    }
}
