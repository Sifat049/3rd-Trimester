import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean successful = false;
        while(!successful){
            System.out.println("Enter 2 integers.");
            try{
                int a = scan.nextInt();
                int b = Integer.parseInt(scan.nextLine().trim());
                int c = a/b;
                System.out.println("Result: " + c);
                successful = true;
            }
            catch(ArithmeticException e){
                System.out.println("Can not divide by 0.");
            }
            catch(InputMismatchException e){
                System.out.println("Need 2 numbers for division.");
                if (scan.hasNextLine())
                    scan.nextLine();
            }
            catch(NumberFormatException e){
                System.out.println("Need 2 numbers for division.");
            }
        }
        scan.close();
    }
}
