package java_27_9;

public class Person {
    private final String name;
    private final int age;
    private final String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    // Getter cho các trường
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public void gerInfor(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", 25, "Male");
        person.gerInfor();
    }
}
