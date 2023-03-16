import java.util.regex.*;
 
class Validate {
 
    public static boolean isValidCode(String pinCode)
    {
 
        String regex
            = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
        Pattern p = Pattern.compile(regex);

        if (pinCode == null) {
            return false;
        }
	    
        Matcher m = p.matcher(pinCode);
 
        return m.matches();
    }
 
    // Driver Code.
    public static void main(String args[])
    {
 
    
        String num1 = "451113";
        System.out.println(
            num1 + ": "
            + isValidCode(num1));
 
  
        String num2 = "431 001";
        System.out.println(
            num2 + ": "
            + isValidCode(num2));
 
    }
}
