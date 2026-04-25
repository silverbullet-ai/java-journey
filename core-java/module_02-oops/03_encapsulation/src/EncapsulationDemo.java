class Student {
    private String name;
    private int age;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Aahish");
        s1.setAge(21);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}