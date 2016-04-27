package ita_ces22_ex2_triangle;

class Shape{
    private String name;
    Shape(String aName) {name=aName;}
    public String getName() {return name;}
    public float calculateArea() {return 0.0f;}
}

class Circle extends Shape{
    private int radius;
    Circle(String aName){
        super(aName);
        radius = 3;
    }
    
    public float calculateArea(){
        float area;
        area = (float) (3.14 * radius * radius);
        return area;
    }
}

class Square extends Shape{
    private int side;
    Square(String aName){
        super(aName);
        side = 3;
    }
    
    public float calculateArea(){
        int area;
        area = side * side;
        return area;
    }
}

public class ITA_CES22_Ex2_Triangle {

    public static void main(String[] args) {
    }
    
}
