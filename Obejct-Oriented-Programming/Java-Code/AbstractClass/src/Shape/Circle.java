package Shape;

public class Circle extends shape{
    //area=3.1416*r*r
    Circle(double r){
        super(r,r);
    }

    @Override
    void area() {
        double result = Math.PI * var1*var2;
        System.out.printf("Circle Area : %.03f",result);
    }
}
