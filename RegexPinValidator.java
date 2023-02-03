// Website with full Kata: https://edabit.com/challenge/sCP58J9vcexchgwo7
// Create a function that will test if a string is a valid PIN or not via a regular expression.
//
//    A valid PIN has:
//
//    Exactly 4 or 6 characters.
//    Only numeric characters (0-9).
//    No whitespace.


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPinValidator {
    public boolean validate(String pin){
        String  regex   = "([0-9]{6})|([0-9]{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pin);

        return matcher.matches();
    }
}
