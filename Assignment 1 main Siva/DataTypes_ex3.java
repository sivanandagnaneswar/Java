public class DataTypes_ex3 {
    public static void main(String[] args) {

        // Student details using all primitive types + String
        String studentName = "Renganayaki";
        byte age = 18;
        short yearOfAdmission = 2022;
        int totalMarks = 480;
        long universityRoll = 23000001234L;

        float attendancePercentage = 92.5f;
        double cgpa = 8.34;

        char grade = 'A';
        boolean isPromoted = true;

        // Output
        System.out.println("----- Student Details -----");
        System.out.println("Name          : " + studentName);
        System.out.println("Age           : " + age);
        System.out.println("Admission Year: " + yearOfAdmission);
        System.out.println("Roll Number   : " + universityRoll);
        System.out.println("Total Marks   : " + totalMarks);
        System.out.println("Attendance    : " + attendancePercentage + "%");
        System.out.println("CGPA          : " + cgpa);
        System.out.println("Grade         : " + grade);
        System.out.println("Promoted?     : " + isPromoted);
    }
}