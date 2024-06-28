class pen{
    String name;
    String color;

    public void write(){
        System.out.println("PEn is ready");

    }
    public void print(){
        System.out.println(this.color);
        System.out.println(this.name);
    }
}

class Student{
    String name;
    int age;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}



public class firstintroclass {
    public static void main(String args[]){
        // pen p1 = new pen();
        // p1.color= "Red";
        // p1.name = "BOlt";
        // p1.write();
        // p1.print();

        Student s1 = new Student("sheenam",19);
        s1.info();

    }

    
    
}
