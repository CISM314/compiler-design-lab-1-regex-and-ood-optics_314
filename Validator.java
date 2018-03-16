package validator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Validator {
    
   
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        DomainValidator domainValidator = new DomainValidator();
        PhoneNumberValidator phoneNumberValidator = new PhoneNumberValidator();
        
        String myNumber;
        String myDomain;
        System.out.println("Input your phone number");
        myNumber = input.next();
        System.out.println("Enter domain");
        myDomain = input.next();
       

        if(phoneNumberValidator.numberIsValid(myNumber) )
            System.out.println("Numbers are Valid");
        else
            System.out.println("Numbers are not Valid");
        
        System.out.println();
        
        if(domainValidator.isValid(myDomain))
            System.out.println("Your domain is valid");
        else
            System.out.println("Your Domain is invalid");
        
    }
    
}
