class Shape{
    String name;
}
class Rang extends Shape {
    String color;
    int size;
}

class Final extends Rang {

}


public class multilevelHeritense {
    public static void main(String args[]){
        Final f1 = new Final();
        f1.name = "Triangle";
        f1.color = "red";
        f1.size = 3;
        System.out.println(f1.name);
        System.out.println(f1.color);
        System.out.println(f1.size);
    }
    
}
