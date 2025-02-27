package Summer22;

import java.util.Scanner;

public class exception {

    class InvalidUserException extends  Exception{
        InvalidUserException(String msg){
            super(msg);
            //System.out.println("Message from the Child constructor.");
        }
    }
    class ExceptionDemo{
        void UserCheck(int age,int work_experience) throws InvalidUserException{
            if(age<50)
            {
                throw new InvalidUserException("Ineligible for Elderly pension because of age");
            }
            if(age<20){
               throw new InvalidUserException("Ineligible for Elderly pension because of work experience” ");
            }
        }
    }

    public static void main(String[] args) {
        ExceptionDemo obj = new ExceptionDemo();
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int work_experience = input.nextInt();

        obj.UserCheck(age, work_experience);
    }
}
