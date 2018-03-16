package validator;

import java.util.regex.Pattern;


public class DomainValidator {
      public static boolean isValid(String domain)
    {
        String domainRegex = "^\\.[a-zA-Z-.]"+"\\.[a-zA-Z-.]+$";
                                  
        Pattern pat = Pattern.compile(domainRegex);
        if (domain == null)
            return false;
        return pat.matcher(domain).matches();
    }
}
