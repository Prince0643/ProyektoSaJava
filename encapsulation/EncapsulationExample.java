
class Student {

    private String name;
    private int age;

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
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("John Doe");
        student.setAge(20);

        student.displayInfo();
    }
}
