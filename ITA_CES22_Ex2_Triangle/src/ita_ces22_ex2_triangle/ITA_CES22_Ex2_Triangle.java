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

class Triangle extends Shape{
    private int a, b, c;
    
    public Triangle (String _name){
        super(_name);
        a = b = c = 1;
    }
    public Triangle (String _name, int _a, int _b, int _c){
        super(_name);
        
        a = _a; b = _b; c = _c;
        
        if (a >= b+c || b >= c+a || c >= a+b)
            a = b = c = 1; //Não respeita a desigualdade triangular
    }
    
    public float calculateArea(){
        float area;
        float p = ((float)(a+b+c))/2; //Semi-perímetro
        
        area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c)); //Fórmula de Heron
        return area;
    }
}

public class ITA_CES22_Ex2_Triangle {

    public static void main(String[] args) {
        
        //Teste simples
        Triangle t = new Triangle("Eustácio", 3, 4, 5);
        System.out.println (t.calculateArea());
        
    }
    
}
