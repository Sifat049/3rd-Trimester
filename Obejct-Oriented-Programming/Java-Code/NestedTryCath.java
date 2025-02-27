package class_15;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCath {
    public static void main(String[] args) {
        try{
            System.out.println("Outer try");
            try {
                System.out.println("Inner try");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Divide");
                int c = a/b;
                System.out.println("Result: " +c);

            }catch (ArithmeticException e){
                System.out.println("Inner Catch");
            }
            finally {
                System.out.println("Inner finally");

            }
        }catch (NumberFormatException e){
            System.out.println("Outer Catch");
        }
        finally {
            System.out.println("Outer finally");
        }
        System.out.println("finished");
    }

}
