package HelloWorld;

public class Person {
    int age;
    String name;
    boolean gender;
    public static boolean alive = true;

    public Person() {
    }

    public Person(int age, String name, boolean gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }
    public void printAge() {
        System.out.println("This is age from class: " + age);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    
}
