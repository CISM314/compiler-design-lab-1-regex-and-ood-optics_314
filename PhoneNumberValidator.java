package validator;

import java.util.regex.Pattern;

public class PhoneNumberValidator {
    
      public static boolean numberIsValid(String numbers)
    {
       String phoneNumberRegex = "^((?:\\+27|27)|0)(=72|82|73|83|74|84|071|60)+(\\d{7})$";
               
                             
        Pattern pat = Pattern.compile(phoneNumberRegex);
        if (numbers == null)
            return false;
        return pat.matcher(numbers).matches();
    }
}
