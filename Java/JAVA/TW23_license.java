/*
23) Assume that you have received a request from the transport authority for automating the task of issuing the permanent license for two wheelers. The mandatory condition to issue the license are: 
1) the applicant must over 18 years of age and 
2) holder of a valid learner’s license and 3) no accident cases in the last one year. 
Write a Java program that reads user details as required (use the Scanner class). Create user defined exceptions to check for the three conditions imposed by the transport authority. Based on the inputs entered by the user, decide and display whether or not a license has to be issued or an error message as defined by the user exception.
*/

import java.util.Scanner;
class UnderAgeException extends Exception{
    UnderAgeException(String s){
        super(s);
    }
    @Override
    public String toString(){
        return "Sorry. You are too young for the license";
    }
}
class ValidLLR extends Exception{
    ValidLLR(String s){
        super(s);
    }
    @Override
    public String toString(){
        return "Sorry. You do not hold a valid LLR";
    }
}
class NumAccidents extends Exception{
    NumAccidents(String s){
        super(s);
    }
    @Override
    public String toString(){
        return "Sorry. There are accidents in last one year";
    }
}
class License{
    String name;
    int age, no_of_cases;
    char gender;
    char validLLR;
    void readData(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = in.nextLine();
        System.out.println("Enter the age: ");
        age = in.nextInt();
        System.out.println("Enter the gender: ");
        gender = in.next().charAt(0);
        System.out.println("Do you have Valid LLR (Y/N)? ");
        validLLR = in.next().charAt(0);
        System.out.println("How many number of cases in past one year? ");
        no_of_cases = in.nextInt();
    }
    
}
public class TW23_license
{
    public static void main(String[] args) {
        License applicant =new License();
        applicant.readData();
        validateApplicant(applicant);
    }
    static void validateApplicant(License a){
       try{
           if(a.age<18)
               throw new UnderAgeException("Underageexception:");
           if(a.validLLR!='Y')
               throw new ValidLLR("ValidLLRexception:");
           if(a.no_of_cases>0)
               throw new NumAccidents("Numberofaccidentsexception:");
           System.out.println("Congrats!! Your license is being posted");
       } 
       catch(UnderAgeException e){
           System.out.println(e.getMessage()+e);
       }
       catch(ValidLLR e){
           System.out.println(e.getMessage()+e);
       }
       catch(NumAccidents e){
           System.out.println(e.getMessage()+e);
       }
       catch(Exception e){
           System.out.println(e.getMessage()+e);
       }

    }
}