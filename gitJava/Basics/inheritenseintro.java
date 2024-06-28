class Shape{
    String color;
    public void area(){
        System.out.println("Shape is done");;
    }
    
}
class Triangle extends Shape{
    int size;
   
}

public class inheritenseintro {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.area();
        t1.size = 4;
        System.err.println(t1.color);
        System.out.println(t1.size);
    }
    
}
