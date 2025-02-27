//public class Main {
//    public static void main(String[] args) {

     /*   int a,b;
        try {
             b=0;
            a=22/6;
            System.out.println("This will not be printed");
        }catch (ArithmeticException math){
            System.out.println("msg"+ math.getMessage());
            System.out.println("divided by  zero");
        }
        System.out.println("Hello world!");
    }

      */
import java.util.*;
import java.lang.*;
import java.io.*;
        public class Main{
            public static void main (String[] args) throws java.lang.Exception{
                int arr[]= new int[4];
                int x = 10, y = 1;
                try{
                    try{
                        arr[4] = x / (y - 1);
                        System.out.println("a");
                    }
                    catch(ArithmeticException e){
                        System.out.println("b");
                        arr[4] = x / (y - 1);
                    }
                    catch(IndexOutOfBoundsException e){
                        System.out.println("c");
                        arr[4] = x / (y - 1);
                    }
                    finally{
                        System.out.println("d");
                    }
                }
                catch(Exception e){
                    System.out.println("e");
                }
                finally{
                    System.out.println("f");
                }
            }
        }

   // }