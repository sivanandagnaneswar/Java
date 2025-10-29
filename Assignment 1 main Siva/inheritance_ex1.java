class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void showStudent() {
        displayInfo();
        System.out.println("Course: " + course);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void showTeacher() {
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}

public class InheritanceSimple {
    public static void main(String[] args) {
        Student s = new Student("Renganayaki", 20, "Computer Science");
        Teacher t = new Teacher("Murrugesan", 35, "Mathematics");

        s.showStudent();
        System.out.println("-----");
        t.showTeacher();
    }
}