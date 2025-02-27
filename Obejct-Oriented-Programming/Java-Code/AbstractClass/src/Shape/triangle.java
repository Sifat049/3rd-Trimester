package Shape;

public class triangle extends shape{
    triangle(double var1, double var2){
        super(var1,var2);
    }

    @Override
    void area() {
        double result = 0.5* var1 * var2;
        System.out.printf("Triangle Area : %.02f\n",result);
    }
}
