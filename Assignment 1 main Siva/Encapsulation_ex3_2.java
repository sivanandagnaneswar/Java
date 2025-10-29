//Encapsulation

class Student {
    private String name;
    private int age;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber > 0) {
            this.rollNumber = rollNumber;
        } else {
            System.out.println("Invalid roll number!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Renganayaki");
        s1.setAge(21);
        s1.setRollNumber(22030);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Roll Number: " + s1.getRollNumber());
    }
}
