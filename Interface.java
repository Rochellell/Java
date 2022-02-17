//create shape interface with area method and find area of circle
interface Shape
{
    double pi=3.14;
    public  void area();
}
class Circle implements Shape{ 
    double r;
    
    public Circle(double r){
        this.r=r;
    }
    
    public void  area(){
        double cir=r*r*pi;
        System.out.println("The area is " + cir);
    }
}


public class Interface {
    public static void main(String[] args){
        Circle c1= new Circle(2);// print area
        c1.area();
        Shape c2 = new Circle(1);// print area
        c2.area();
        System.out.println(Shape.pi);// print pi
        System.out.println(c2.pi);// print pi

    }
}